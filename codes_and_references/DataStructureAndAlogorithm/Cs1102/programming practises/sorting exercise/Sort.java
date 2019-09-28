import java.util.*;
class Sort{
  public static void main(String[]args){
    List<String> list = Arrays.asList(args);
    Collections.sort(list);
    System.out.println(list);
  }
}