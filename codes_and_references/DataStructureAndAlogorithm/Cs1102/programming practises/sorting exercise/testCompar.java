import java.util.*;

class testCompar{
  
  public static void main(String[]args){
    ArrayList<Person> list = new ArrayList<Person>();
    
    ArrayList<Person> temp = new ArrayList<Person>();
    temp.add(new Person("shhh",15,188));
    
    Person pp = new Person("lala",15,198);
    Person gg = new Person("lala",15,198);
    System.out.println(pp.equals(gg));
    
    
    Scanner scanner = new Scanner(System.in);
    for ( int i = 1; i <=3; i++){
      
      int height = scanner.nextInt();
      String name = scanner.next();
      int age = scanner.nextInt();
      
      Person p = new Person(name, age, height);
      
      list.add(p);
    }
    
    
    
    NameComparator NameComp = new NameComparator();
    
    Collections.sort(list,NameComp);
    System.out.println(Collections.max(list,NameComp).name);
    // return the max based on the comparator...
    // if wan natrual ordering...just max(list);
             
    System.out.println(Collections.disjoint(list,temp));    
    //return true if two lists have elements in common
    
    Person qq = new Person("shhh",15,188);
    System.out.println(Collections.frequency(temp,qq));
    // need to override the equals method
    
    for(Person p : list){
      System.out.println(p.name);
    }
  }
}


class NameComparator implements Comparator<Person>{
  public int compare(Person one, Person two){
    return one.name.compareTo(two.name);
  }
  
  
  public boolean equals(NameComparator obj){
    return this==obj;
  }
  
}
