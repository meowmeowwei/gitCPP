class FindSmallest{
  public static void main(String[]args){
    int[] array = new int[6];
    
    int count = 1;
    for(int i = 0; i < 6; i++){
      array[i] = count;
      count++;
    }
    
    System.out.println(findSmallest(array,0,5));
    
  }
  
  public static int findSmallest(int[]array,int start, int end){
    
    if(start==end){return array[end];}
    else{
      if(array[start]<findSmallest(array,start+1,end)){
        return array[start];        
      }
      else{
        return findSmallest(array, start+1,end);
      }
    }
  }
}
         