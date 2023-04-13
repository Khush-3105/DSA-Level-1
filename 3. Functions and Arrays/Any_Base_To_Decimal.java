/*1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.*/
import java.util.*;
public class Any_Base_To_Decimal {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int d = getValueIndecimal(n, b);
    System.out.println(d);
    scn.close();
 }

 public static int getValueIndecimal(int n, int b){
    int ans=0,m=0;
    while(n>0){
      int t=n%10;
      n=n/10;
      ans=ans+t*(int)Math.pow(b,m);
      m++;
    }

    return ans;
 }
}