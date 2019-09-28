class ReverseInt{
  public static void main(String[]args){
    int[] array = new int[6];
    
    int count = 1;
    for(int i = 0; i < 6; i++){
      array[i] = count;
      count++;
    }
    
    reverseArray(array,0,5);
    
    for( int i =0; i<6; i++){
      System.out.println(array[i]);
    }
  }
  
  
  public static void reverseArray(int[]array,int start, int end){
    
    //start is the beginning index to switch with the end index
    //start==end base case for odd size, start>end for even size
    
    if(start==end||start>end){return;}
    else{
      int temp =array[start];
      array[start]=array[end];
      array[end]=temp;
      reverseArray(array,start+1,end-1);
      }
  }
}