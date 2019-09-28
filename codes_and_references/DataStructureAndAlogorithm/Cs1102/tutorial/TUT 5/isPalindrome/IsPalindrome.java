class IsPalindrome {
  public static void main(String[]args){
    String x = "ababa";
    
    System.out.println(checkP(x,0,4));
  }
  
  public static boolean checkP(String x, int start, int end){
    
    //start - start index  end - end index
    
    if(start==end||start>end){return true;}
    else{
      if(checkP(x,start+1,end-1)==false|| x.charAt(start)!=x.charAt(end)){
        return false;
      }
      else {
        return true;
      }
    }
    
  }
}
    