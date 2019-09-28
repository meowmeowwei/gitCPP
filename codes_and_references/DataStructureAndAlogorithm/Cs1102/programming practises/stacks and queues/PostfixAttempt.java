import java.util.*;
public class PostfixAttempt {

public static void main (String [ ] args) throws Underflow {
    String postfixExp = "";
	boolean end;
	StackLL stack = new StackLL ();
	//StackLLE stack = new StackLLE ();
	//StackArr stack = new StackArr ();

    Scanner scanner = new Scanner("a-b");
    //Scanner scanner = new Scanner("a-b/c");
    //Scanner scanner = new Scanner("a+b+d/c");
    //Scanner scanner = new Scanner("a/b+d/c");
    //Scanner scanner = new Scanner("a+(b+d)/c");
	//Scanner scanner = new Scanner("a-(b+c*d)/e");

	String inputStr = scanner.next();
    try {
		for (int i=0; i < inputStr.length(); i++) {
		//	stack.print();
			char ch = inputStr.charAt(i);
			System.out.println( "processing : " + ch);
			switch ( ch ) {
				case '*':
				case '/':
					//System.out.println( "inside * / " );
					// write your while loop here....
					

			        //System.out.println( "out of while * /  " );
					break;

				case '+':
				case '-':
			        //System.out.println( "inside + - " );
					// write your while loop here....


			 	    //System.out.println( "out of while + - " );
					break;

				case '(': 
				    //System.out.println( "inside ( " );
					// write your code here


					break;

				case ')':
				    //System.out.println( "inside ) " );
					// write your code here

					stack.pop();
					break;

				default:  // operand
				    //System.out.println( "operand " );
					// write your code here


					break;
			}
		} // for loop

		// write another while loop here to clear the stack
		// while ( !stack.isEmpty() )


    } catch ( Underflow e ) {
		    //System.out.println("output of so far postfix: " + postfixExp);
			throw new Underflow(" bad input ");
    }

	System.out.println("output of postfix: " + postfixExp);
}
}
