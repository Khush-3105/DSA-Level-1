/* 1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to subtract n1 from n2 and print the value.*/
import java.util.*;

public class Any_Base_Subtraction {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getDifference(b, n1, n2);
    System.out.println(d);
    scn.close();
 }

 public static int getDifference(int b, int n1, int n2){
  int result=0,diff=0,carry=0,multi=1;
  while(n2>0){
    int d1= n1%10;
    int d2=n2%10;
    diff=d2-d1-carry;
    if(diff<0){
      carry=1;
      diff+=b;
    }else{
      carry=0;
    }


    result += diff*multi;
    multi*=10;

    n1/=10;
    n2/=10;
  }
  return result;
}
}