class Person{
  protected String name;
  protected int age;
  protected int height;
  
  public Person(String nam, int ag, int hei){
    name = nam;
    age = ag;
    height = hei;
  }
  
  public boolean equals(Object obj){
    // overides equals method
    if(obj instanceof Person){
      Person p = (Person) obj;
      return this.name.equals (p.name);
    }
    else{
      return false;
    }
  }
}
  