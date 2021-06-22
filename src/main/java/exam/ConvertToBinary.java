package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    if(n<0){
      System.out.println("Negative values not supported yet.")
    }
    else{
     int rem=0;
     string  output_num="";
     while(n!=0){
      rem = n%2;
      n = n/2;
      output_num = rem+output_num
     }   
    }
    return ouputnum;
  }
}
