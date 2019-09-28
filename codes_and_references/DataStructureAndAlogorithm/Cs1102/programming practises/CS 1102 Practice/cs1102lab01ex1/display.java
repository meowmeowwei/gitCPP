import java.io.*;

class display {
	obj o;
    

	display(obj x) {
		o = x;
	}

  

	void displayAttributes() {
		
          //display the name of the animal
          System.out.println("A "+ o.getName() +"has: ");

          //display the skin color of the animal
          if (o.getColour()!= "null"){
              System.out.println(o.getColour() +" skin colour");
          }else{
              o.trackColour(o);
          }


          System.out.println( " legs");
          System.out.println( " eyes");                                                                                                         
    }
}
