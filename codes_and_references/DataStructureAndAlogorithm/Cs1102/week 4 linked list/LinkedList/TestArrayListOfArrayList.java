import java.util.*;

class TestArrayListOfArrayList{
  
  public static void main(String[] args){
    
    List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    
    for (int i=4; i<20; i++)
      list1.add(i);
    
    for (int i=0; i<10; i++)
      list2.add(i);
    
    list.add((ArrayList<Integer>)list1);
    list.add((ArrayList<Integer>)list2);
    
    System.out.println(getMin(list0));
    
  } //end main()
  
  public static int getMin(List<ArrayList<Integer>> aList){
    
    int min;
    boolean setMin = true;
    
    for (int i=0; i<aList.size(); i++){
      for (int j=0; j<aList.get(i).size(); j++){
        
        if (setMin){
          min = aList.get(i).get(j);
          setMin = false;
          continue;
        }
        
      } //end for
    } //end for
    
    return min;
    
  } //end getMin()
  
}
          
        
