package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    if(n<0){
      System.out.println("Negative values not supported yet.")
    }
    else{
     int rem=0;
     int num=n;
     string  output_num="";
     while(num!=0){
      rem = n%2;
      num = num/2;
      output_num = rem+output_num
     }   
    }
    return ouput_num;
  }
}
