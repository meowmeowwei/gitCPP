///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-11-06 13:27:01
/////  
///////////////////////////////////////////////////



import java.util.Vector;

public class TestShape {

	public static void main(String [] args) {
		Vector<Shape> storage = new Vector<Shape>();
	
		System.out.println("Test program for Shapes");
		
		//create shapes
		System.out.println("Creating shapes");
		
		Rectangle a = new Rectangle(3,2);
		Rectangle b = new Rectangle(3,3);
		
		Triangle d = new Triangle(2,4); 
		Isoceles e = new Isoceles(6,4); 
		Equilateral f = new Equilateral(5);
				
		Circle g = new Circle(5);
		
		storage.add(a);
		storage.add(b);
		storage.add(d);
		storage.add(e);
		storage.add(f);
		storage.add(g);
		
		for (Shape s : storage) {
			System.out.println(s.getSides());
			System.out.println(s.getArea());
		}

	}

}
