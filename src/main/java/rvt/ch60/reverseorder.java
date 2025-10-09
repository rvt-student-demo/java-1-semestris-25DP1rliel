package rvt.ch60;

public class reverseorder {
     public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 
    int[] temp = val.clone();
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    for(int i=0;i<temp.length;i++){
        val[i] = temp[temp.length-(i+1)];
    }
 
 
    
 
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}
