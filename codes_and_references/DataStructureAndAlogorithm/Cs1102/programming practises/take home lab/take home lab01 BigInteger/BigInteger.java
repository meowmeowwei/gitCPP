///////////////////////////////////////////////////
/////  
/////  LogName: u0906785
/////  FullName: sun wei
/////  CreationDate: 2010-01-30 13:29:37
/////  
///////////////////////////////////////////////////


import java.util.*;

public class BigInteger {

    private int[]number= new int[100];

    private boolean isNegative;

    private int digitCount;

    //constructor
    public BigInteger(String input){

        setSign(input);

        setNumber(input);

    }//end constructor

    public BigInteger(int[] array, boolean sign){
        number = array;
        isNegative =sign;
        digitCount =0;
    }

    //setNumber sets the input values into the int array 
    private void setNumber(String input){

        for( int i =0; i <100; i++){
            number[i]=0;
        }

        int position = 99;
        if(isNegative){

            for( int i=input.length(); i>1; i-- ){
                number[position]=Integer.parseInt(input.substring(i-1,i));
                position--;
            }
        }
        else{

            for( int i=input.length(); i>0; i--){
                number[position]=Integer.parseInt(input.substring(i-1,i));
                position--;
            }
        }
    }

    //setSign sets determines whether the number is positive or negative
    private  void setSign(String input){

        if(input.substring(0,1).equals("-")){
            isNegative = true;
            digitCount = input.length()-1;
        }
        else{
            isNegative = false;
            digitCount = input.length();
        }
    }

    //getArray returns int array number
    public int[] getArray(){
        return number;
    }

    //getDigitCount returns the digitCount
    public int getDigitCount(){
        return digitCount;
    }

    //getSign returns isNegative
    public boolean getSign(){
        return isNegative;
    }





    //toString returns the string representation of the bitInteger
    public String toString(){
        String output="" ;

        boolean isZero=true;

        for( int i =0; i < 100; i++){
            if(number[i]!=0){
                isZero=false;
                break;
            }
        }

        if(isNegative){
            output+="-";
        }
        int index =0;
        if(!isZero){
            for(int i=0; i<100; i++){
                if(number[i]!= 0){
                    index = i;
                    break;
                }
            }

        }
        else{
            index=99;
        }

        for( int i=index;i<100;i++){
            output+=number[i];
        }
        return output;
    }

    //compare compares the size of two numbers without considering
    //their sign bigger return 1, smaller return -1; same return 0;
    public int compare(BigInteger integer){
        int number=0;

        if(this.getDigitCount()>integer.getDigitCount()){
            number =1;
        }
        else if(this.getDigitCount()<integer.getDigitCount()){
            number = -1;
        }
        else{
            int[]array1= new int[100];
            array1=this.getArray();

            int[]array2= new int[100];
            array2=integer.getArray();

            if (this.getDigitCount()== integer.getDigitCount()){
                for( int i = 100-this.getDigitCount(); i<100;i++){
                    if(array1[i]>array2[i]){
                        number=1;
                        break;
                    }
                    else if(array1[i]<array2[i]){
                        number=2;
                        break;
                    }
                }
            }
        }
        return number;
    }

    //subtract will subtract values of one integer with another and it
    //returns an array

    public int[] subtract(BigInteger integer){
        int[]arr= new int[100];
        arr = this.getArray();
        for(int i=99; i>99-this.getDigitCount();i--){
            int result = arr[i]-integer.getArray()[i];
            if(result<0){
                arr[i]=arr[i]+10-integer.getArray()[i];
                arr[i-1]--;
            }
            else{
                arr[i]=result;
            }
        }
        return arr;
    }

    //plus will plus the values of one integer with another annd returns
    //an array

    public int[] plus(BigInteger integer){
        int[]arr=new int[100];
        arr= this.getArray();
        for( int i =99; i>=0;i--){
            int result = arr[i]+integer.getArray()[i];
            if(result>=10){
                arr[i]=result%10;
                arr[i-1]++;
            }
            else{
                arr[i]=result;
            }
        }
        return arr;
    }


    //add returns a BigInteger object that's the outcome
    public BigInteger add(BigInteger integer){

        int[]arr = new int[100];
        for ( int i =0; i<100;i++){
            arr[i]=0;
        }

        boolean isNegative = false;

        if(this.getSign()==integer.getSign()){

            isNegative = this.getSign();



            arr=this.plus(integer);

        }
        else{
            if(this.compare(integer)==1){
                isNegative=this.getSign();

                arr= this.subtract(integer);
            }
            if ( this.compare(integer)==-1){
                isNegative = integer.getSign();

                arr= integer.subtract(this);

            }
        }

        BigInteger answer = new BigInteger(arr,isNegative);
        return answer;
    }

    // minus returns a BigInteger object thats the outcome
    public BigInteger minus(BigInteger integer){
        int[]arr = new int[100];
        for( int i =0; i < 100; i++){
            arr[i]=0;
        }
        boolean isNegative= false;

        if(this.getSign()==integer.getSign()){
            if(this.compare(integer)==1){
                isNegative = this.getSign();
                arr= this.subtract(integer);
            }
            if(this.compare(integer)==-1){
                if(integer.getSign()==false){
                    isNegative = true;
                    arr= integer.subtract(this);
                }
                else{
                    isNegative = false;
                    arr=integer.subtract(this);
                }
            }
        }
        else{
            isNegative=this.getSign();
            arr=this.plus(integer);

        }
        BigInteger answer = new BigInteger(arr,isNegative);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        String method = scanner.nextLine();
        BigInteger integer1 = new BigInteger(input);
        BigInteger integer2 = new BigInteger(input2);

        if(method.equals("+")){
            System.out.println(integer1.add(integer2));
        }
        else{
            System.out.println(integer1.minus(integer2));
        }

    }
}
