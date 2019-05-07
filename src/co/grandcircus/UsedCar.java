package co.grandcircus;

public class UsedCar extends Car {
	
	private double milage;

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public UsedCar() {
		super();
		
	}

	public UsedCar(String make, String model, int year, double price, double milage) {
		super(make, model, year, price);
		this.milage = milage;
		
	}
	

}
