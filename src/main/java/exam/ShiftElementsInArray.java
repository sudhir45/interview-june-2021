package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int last_elem = arr[arr.length-1];
    for(int i=arr.length-1; i>0; i--){
      arr[i] = arr[i-1];
    }
    arr[0] = last_elem ;
    //for printing array.
    for(int i=0; i<=arr.length-1; i++){
      System.out.print(arr[i]+", ");
    }
  }

}
