///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-08-28 15:38:05
/////  
///////////////////////////////////////////////////



// Test program for lab 0, question 1
// Teng Junbin
//edited by Tan Liyong

import java.io.*;
import java.util.*;

public class hierarchy {
public static int cnt;
	public void doProcess() {
	    BufferedReader f;
	    String s;
	    obj curr = null;
	    int legs, eyes,i;
	    String colour, name;

		Scanner scan = new Scanner(System.in);
		
		cnt = scan.nextInt();
		scan.nextLine();
		
		for (i = 0; i < cnt; ++i) {
			name = scan.nextLine();

			legs = scan.nextInt();

			eyes = scan.nextInt();
			scan.nextLine();

			colour = scan.nextLine();
			if (colour == "null") { colour = null; }

			curr = new obj(name, legs, eyes, colour, curr);
		}
		
		display x = new display(curr);
		x.displayAttributes();
	}

  public static void main( String[] args ) {
  	hierarchy x = new hierarchy();
  	x.doProcess();
	}
}
