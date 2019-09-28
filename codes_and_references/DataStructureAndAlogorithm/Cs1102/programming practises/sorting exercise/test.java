import java.util.*;

class test {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    Integer[] array = {1, 2 ,3 , 4 , 5, 6,7};
    
    System.out.println(Arrays.toString(array));
    //[1, 2, 3, 4, 5, 6, 7]

    
    List<Integer> list = Arrays.asList(array);
  
    
    for(int i:list){  // try not to use asList to save trouble
      System.out.println(i);
    }
    
   // Arrays.fill(array,0,7,5); // startIndex inclusive , endIndex exclusive
    
    for(int i :array){
      System.out.println(i);
    } // 5 5 5 5 ....
    
    System.out.println(Arrays.binarySearch(array, 5));
    //3 good when no duplicates in it...
    
    Integer[] temp = Arrays.copyOf(array, 8);
    
    for(int i:temp){
      System.out.println(i);
    }
    
    //Arrays.sort(array);
    
    
  }
  
  
}
    