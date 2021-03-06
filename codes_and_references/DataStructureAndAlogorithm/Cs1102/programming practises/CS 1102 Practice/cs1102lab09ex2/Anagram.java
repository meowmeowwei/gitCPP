///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-10-27 17:21:17
/////  
///////////////////////////////////////////////////



/*
 *Name: Cao Hoang Dang
 *Matric No.: U076987J
 *Program: CS1102
 */

import java.io.*;
import java.util.*;

public class Anagram
{
	public static void main(String args[]) throws IOException
	{
        //input 2 words to test
        
        Scanner sc= new Scanner(System.in);
        String word1,word2;
        boolean isAnagram;
        word1= sc.next();
        word2=sc.next();

        //put 2 words into vectors
        Vector wordV1= new Vector(word1.length());
        for(int i=0;i<word1.length();i++){
            wordV1.add(i,word1.charAt(i));
        }

        Vector wordV2=new Vector(word2.length());
        for(int i=0;i<word2.length();i++){
            wordV2.add(i,word2.charAt(i));
        }

        //test whether 2 words are anagrams
        if(word1.length()!=word2.length()){
            isAnagram=false;
        }
        else{
            isAnagram=true;
            int j=0;
            for(int i=0;i<wordV1.size();i++){
                while((wordV1.elementAt(i)!=wordV2.elementAt(j))&&(j<wordV2.size())){
                    j++;
                }   
                if (wordV1.elementAt(i)==wordV2.elementAt(j)){
                    wordV1.removeElementAt(i);
                    wordV2.removeElementAt(j);
                    j=0;
                }   

                if (j==wordV2.size()){
                    isAnagram=false;
                    break;
                }
        
            }
           }
       if(isAnagram==true){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
	}
}
