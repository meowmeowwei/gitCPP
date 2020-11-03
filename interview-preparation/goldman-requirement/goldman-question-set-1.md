---
description: 'https://1o24bbs.com/t/topic/9091'
---

# Goldman Question Set 1

**第一轮: hacker rank**

Given a range of numbers \[l, r\] and an integer q. The task is to count all such number in the given range such that any digit of the number does not match with any digit in its product with the given number q.  
Input : l = 10, r = 12, q = 2  
Output : 1  
Explanation:  
10_2 = 20 which has 0 as same digit  
12_2 = 24 which as 2 as same digit  
11\*2 = 22 no same digit

Input : l = 5, r = 15, q = 2  
Output : 9

我的解法

```text
static boolean areInDigitInX(int n, int from) {
      int product = n * from;
      Set<Integer> numberDigits = digits(n);
      Set<Integer> productDigits = digits(product);

      for (Integer i : productDigits) {
          if (numberDigits.contains(i))
              return false;
      }

      return true;


  }

  static Set<Integer> digits(int item) {
      Set<Integer> set = new HashSet<>();

      int n = item;
      if (n == 0) {
          set.add(0);
          return set;
      }


      while (n > 0) {

          int digit = n % 10;
          set.add(digit);
          n = n / 10;

      }
      return set;
  }

  // Complete the nonRepeatingDigitProductCount function below.
  static int nonRepeatingDigitProductCount(int x, int y, int z) {

      int count = 0;
      for (int i = y; i <= z; i++) {
          if (areInDigitInX(i, x))
              count++;
      }

      return count;
  }
```

**第二轮 HACKERRANK**  
Carer cup Persons A and B uses an encryption based system for their conversation.  
Each conversation message is encoded from the source and decoded in  
the destination using a shared private positive number key known to each other.  
The algorithm is illustrated with an example.  
Input Format with explanation:

1. Operation \(1 for Encoding and 2 for Decoding\)
2. Input message
3. Input private key

Example:

input 1 Message: Open Key: 123

Output: Oppeeen

Input: 2 Oppeeen 123

Output: Open

```text

public class SecureChannel {

   static final String negResponse = "-1";

   // Complete the secureChannel function below.
   static String secureChannel(int operation, String message, String key) {

       switch (operation) {
           case 1:
               return encoded(message, key);
           case 2:
               return decoded(message, key);
           default:
               return negResponse;
       }

   }


   private static String isEmpty(String message, String key) {
       if (message == null || key == null)
           return negResponse;

       if (message.isEmpty() && key.isEmpty())
           return message;

       if (!message.isEmpty() && key.isEmpty())
           return message;

       if (message.isEmpty() && !key.isEmpty())
           return negResponse;


       return null;

   }

   /**
    * Input:
    * 2
    * Oppeeen
    * 123
    * <p>
    * Output:
    * Open
    *
    * @param message
    * @param key
    * @return
    */
   private static String decoded(String message, String key) {
       String corner = isEmpty(message, key);
       if (corner != null)
           return corner;


       if (key.equals("0"))
           return message;

       int index = 0;
       final StringBuilder res = new StringBuilder();

       char keys[] = key.toCharArray();

       int i;
       for (i = 0; i < keys.length; i++) {

           if (index < message.length()) {
               char current = message.charAt(index);
               if (Character.isDigit(keys[i])) {
                   int keyV = keys[i] - '0';
                   int x = 1;
                   while (x + index < message.length() && message.charAt(x + index) == current) {

                       x++;
                   }

                   if (x == keyV) { //this is correct
                       res.append(current);
                   } else
                       return negResponse;
                   index = index + x;
               } else
                   return negResponse;

           } else
               break;
       }

       return getMessage(message, index, res, keys, i);


   }

   private static String getMessage(String message, int index, StringBuilder res, char[] keys, int i) {
       if (index < message.length()) {
           String remaining = message.substring(index);
           res.append(remaining);
       }
       return res.toString();

   }

   /**
    * Message: Open
    * Key: 123
    * <p>
    * Output:
    * Oppeeen
    *
    * @param message
    * @param key
    * @return
    */
   private static String encoded(String message, String key) {
       String corner = isEmpty(message, key);
       if (corner != null)
           return corner;


       int index = 0;
       final StringBuilder res = new StringBuilder();

       char keys[] = key.toCharArray();

       int i;
       for (i = 0; i < keys.length; i++) {

           if (index < message.length()) {
               char current = message.charAt(index);

               if (Character.isDigit(keys[i])) {
                   int keyV = keys[i] - '0';

                   for (int x = 0; x < keyV; x++) {
                       res.append(current);
                   }

                   index++;
               } else
                   return negResponse;
           } else
               break;

       }

       return getMessage(message, index, res, keys, i);

   }

   public static void main(String args[]) {


       System.out.println(secureChannel(2, "open", "aad"));

       System.out.println(secureChannel(2, "", ""));


       System.out.println(secureChannel(2, "Oppeeennnn", "1234"));


       System.out.println(secureChannel(1, "abcdefgh", ""));
       System.out.println(secureChannel(2, "aaabbbcccdddeeefffggghhh", ""));


       System.out.println(secureChannel(1, "abcdefgh", "0"));
       System.out.println(secureChannel(2, "bcdefgh", "0"));


       System.out.println(secureChannel(1, "abcdefgh", ""));
       System.out.println(secureChannel(2, "aaabbbcccdddeeefffggghhh", ""));


       System.out.println(secureChannel(1, "abcdefgh", "33333333333"));
       System.out.println(secureChannel(2, "aaabbbcccdddeeefffggghhh", "33333333333"));


       System.out.println(secureChannel(1, null, "9999"));
       System.out.println(secureChannel(2, null, "9999"));

       System.out.println(secureChannel(1, "", "9999"));
       System.out.println(secureChannel(2, "", "9999"));

       System.out.println(secureChannel(1, "Ope", "12345"));
       System.out.println(secureChannel(2, "Oppeee", "12345"));


       System.out.println(secureChannel(1, "open", "123"));
       System.out.println(secureChannel(2, "Oppeeen", "123"));


       System.out.println(secureChannel(1, "open", "1234"));
       System.out.println(secureChannel(2, "oppeeennnn", "123"));


       System.out.println(secureChannel(1, "o", "1234"));
       System.out.println(secureChannel(2, "opp", "123"));
   }
}


```

Round 2: coderpad:

1. give a string, find the longest uniform string in it. Ex: abcdddss here LUS is ddd
2. Given two sorted arrays, find the median. Arrays can be of different lengths

Round 3:Telephonic  
Mostly java: how hash map work, design your own hashmaps, how class loader works, what is PermGen memory, what is the memory hierarchy in jvm, define singleton pattern, how it works. Etc.

Round 4: f2f  
Given a stream of stocks share, given that find the max value of stock for any given duration window. The window can be from extreme ends of timw frams.  
Implement dictionary  
Projects discussion.

Round 5: f2f  
Full current project discussion in deep.  
Design doubletone  
Git/maven/version control/Jenkins/branching/conflict in merge

Round 6: f2f  
Project discussion in brief, technology used and why. Why each component design their usage and reason n all.  
Design banking system that supports below requirements  
. 1\) debit 2\) credit 3. Atm transaction debit / credit 4\)Third party transaction via net banking, upi, atm, 5\) balance query 6\) mini statements query  
given an array which contains number from o N, few numbers are duplicated. Find any duplicate number efficiently \(couldn’t satisfied him 100%\)  
Round 7: f2f SDLC  
brief discussion about sprint planning and progression  
Testing framework: regression testing, sanity testing, unit testing etc  
Expectation from developer  
What you expect from GS, tech stack choice etc

Round 8: f2f Behavioral questions & expectations and team behavior  
why you want to change  
Your vision Etc.  


