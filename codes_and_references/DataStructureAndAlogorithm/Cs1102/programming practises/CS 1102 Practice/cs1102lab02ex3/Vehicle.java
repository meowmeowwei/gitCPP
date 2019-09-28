public abstract class Vehicle {
	
	protected String make;	//make of vehicle, example Nissan sunny
	protected double price;	//price of vehicle
	
	public String getMake() { return make; }
	public double getPrice() { return price; }
	
	public Vehicle (String m, double p) {
		make = m;
		price = p;
	}
	
	//returns number of wheels
	public abstract int getWheels();
	
	//calculate the amount of sales tax payable
	public abstract double calculateTax();
}
