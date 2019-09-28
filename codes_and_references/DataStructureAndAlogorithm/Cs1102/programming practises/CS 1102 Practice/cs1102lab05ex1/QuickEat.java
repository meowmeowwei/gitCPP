///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-10-02 16:12:32
/////  
///////////////////////////////////////////////////



import java.util.*;

public class QuickEat {

    int numOfDishes,numOfIns,order;
    String dishName,instruction,kindOfInstruction;
    Queue <Integer> aQueue;
    String[] namesOfDishes;

	public QuickEat() {
		//constructor
        aQueue= new LinkedList<Integer>();

	}
	
	public void addNewOrder() {
		//your code here
        aQueue.addLast(Integer dishNum);
	}
	
	public void processReadyFood() {
		//process food that are ready
	}
	
	public static void main(String [] args) {
		//your code here

        Scanner sc= new Scanner(System.in);
        
        //input the names of dishes
        numOfDishes= sc.nextInt();
        namesOfDishes= new String[numOfDishes];
        for(int i=0;i<numOfDishes-1;i++){
            namesOfDishes[i]= sc.next();
        }

        numOfIns= sc.nextInt();//input numbers of instructions
        for (int i=0;i<numOfIns-1,i++){

        //input components of intruction
        instruction = sc.nextLine();
        Scanner scan= new Scanner(instruction);
        kindOfInstructions= instruction.substring(0,4);




        }








	}

}
