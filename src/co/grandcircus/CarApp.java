package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("How many cars are you entering?");

	int car = scan.nextInt();
	scan.nextLine();
	ArrayList<Car> userCar = new ArrayList<>();

	for (int i = 0; i < car; i++) {
		System.out.println("Car #" + (i + 1) + " Make: ");
		String make = scan.nextLine();
		System.out.println("Car #" + (i + 1) + " Model: ");
		String model = scan.nextLine();
		System.out.println("Car #" + (i + 1) + " Year: ");
		int year = scan.nextInt();
		System.out.println("Car #" + (i + 1) + " Price: ");
		scan.nextLine();
		double price = scan.nextDouble();
		Car car1 = new Car(make, model, year, price);
		userCar.add(car1);
		scan.nextLine();
	}

	System.out.println("Thanks for adding: ");
	System.out.println(userCar);
	scan.close();
}

}
