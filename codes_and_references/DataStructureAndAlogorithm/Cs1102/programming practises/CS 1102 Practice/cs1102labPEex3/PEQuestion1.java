///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-11-05 23:08:03
/////  
///////////////////////////////////////////////////



import java.util.*;


public class PEQuestion1 {


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();// input original text
    
    
    // implement your program here

    //input test cases
    int numOfTest=scan.nextInt();
    String test;
    
    for(int i=0;i<numOfTest;i++){
        test= scan.nextLine();
        System.out.println(testWord(input,test));

    }
    
  }
    //method to test and return position of the word
    public static int testWord(String text, String word){
        
        boolean isWord;
        int position=-1;
        
        for(int i= 0;i<text.length();i++){
            if(text.charAt(i)!=word.charAt(0)){
                isWord=false;
            }
            else{
                String subText = text.substring(i,word.length()-1);
                if(subText.compareTo(word)==0){
                    isWord=true;
                    position=i;
                }
                else{
                    isWord=false;
                }
            }
        }
        return position;

    }

}
