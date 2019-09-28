//A variable whose declared type is an interface type may have as its value a reference to any instance of a class which implements the 
//specified interface. It is not sufficient that the class happen to implement all the abstract methods of the interface; 
//the class or one of its superclasses 
//must actually be declared to implement the interface, or else the class is not considered to implement the interface.


class test{
  public static void main(String[]args){
    lala la = new lala();
  System.out.println(la.y);
  System.out.println(la);
  
  complex lex = la;
  System.out.println(lex.y);
  }
  
}