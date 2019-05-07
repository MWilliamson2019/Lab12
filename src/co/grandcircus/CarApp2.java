package co.grandcircus;

import java.util.ArrayList;

public class CarApp2 {

	public static void main(String[] args) {
		
		ArrayList carsList = new ArrayList();
		Car one = new Car("Honda", "Accord",2019, 30000);
		Car two = new Car("Kia", "Sol", 2019, 20000);
		Car three = new Car("Chrysler", "300", 2019, 40000);
		Car four  = new UsedCar("Ford","Escort", 2003, 900,100000);
		Car five = new UsedCar("General Motors", "Cadillac", 2002, 40000,150000);
		Car six = new UsedCar("Buick", "Sable", 2000, 700, 120000);
		carsList.add(one);
		carsList.add(two);
		carsList.add(three);
		carsList.add(four);
		carsList.add(five);
		carsList.add(six);
		System.out.println(carsList);
		}

}
