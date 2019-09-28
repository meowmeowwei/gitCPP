///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-08-22 20:03:05
///// 
///////////////////////////////////////////////////


// Import the package you require here
import java.util.*;
import java.lang.*;

public class threeNplusOne {

   public static void main(String [] args) {

    //Creat a threeNplusOne object
   
   threeNplusOne ex1=new threeNplusOne();

    //Get the maximum circle length
   
   int maxLength= ex1.getMaxLength();
    
    //output the result
   
   System.out.print(" "+maxLength);
   System.out.println();
   }
 
 //contructor of threeNplusOne class
 
 public threeNplusOne(){
 }
 

 // method to get the cycle length of an integer


 public static int cycleLength=1;
 
 public int getCycleLength(int x){
 
     if(x==1){
         return cycleLength;
     }

     if((x%2)!=0){
         cycleLength++;
         x=3*x+1;
         return getCycleLength(x);
     }else{
         cycleLength++;
         x=x/2;
         return getCycleLength(x);
     }
 }

 //method to get maximum cycle length of the integers between i and j
 
 public int getMaxLength(){
     
     int result,i,j,position=0;
     
     //input i,j
     Scanner sc= new Scanner(System.in);
     i=sc.nextInt();
     j=sc.nextInt();
     
     
     System.out.print(i+" "+j);//print out i,j
     
     int min = Math.min(i,j);
     
     int max= Math.max(i,j);
     
     int length=max-min+1;
     
     //create an array of cycle lengths of numbers between i and j
     
     int [] maxLength=new int[length];
     
     //put the cycle lengths into the array
     
     for (int a=min;a<=max;a++){
         maxLength[position]=getCycleLength(a);
         cycleLength=1;
         position++;
     }
     
     //find the max of cycle lengths
     
     result=maxLength[0];
     
     for(int b=0;b<length;b++){
         if(maxLength[b]>result){
             result=maxLength[b];
         }
     }
     return result;
 }
}
