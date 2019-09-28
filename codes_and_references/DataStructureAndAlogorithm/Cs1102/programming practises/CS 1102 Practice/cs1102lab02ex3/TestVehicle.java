///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-11-06 13:26:55
/////  
///////////////////////////////////////////////////



import java.util.Vector;

public class TestVehicle {
	public static void main(String [] args) {
		Vector<Vehicle> store = new Vector<Vehicle>();
		
		System.out.println("Creating new objects");
		store.add(new Car("Suzuki Swift", 30000, 2000));
		store.add(new Car("Audi A4", 35000, 4000));
		
		store.add(new Truck("Nissan Cabstar", 20000, 1500));
		
		store.add(new BigMotor("Big Bike", 10000, 1000));
		store.add(new MediumMotor("Honda Wave", 7000, 400));
		store.add(new SmallMotor("Vespa", 2000, 1000));
		
		System.out.println("Printing their properties");
		
		for (Vehicle v : store) {
			System.out.println(v.getMake() + " : Price ($" + v.getPrice() + ")");
			System.out.println("Tax: " + v.calculateTax() + " Wheels : " + v.getWheels());
		}
	}
}
