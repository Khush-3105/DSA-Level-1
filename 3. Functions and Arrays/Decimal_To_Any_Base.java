/* 1. You are given a decimal number n.
2. You are given a base b.
3. You are required to convert the number n into its corresponding value in base b.*/
import java.util.*;

public class Decimal_To_Any_Base {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
    scn.close();
 }

 public static int getValueInBase(int n, int b){
     int r=0, m=1;
     while(n>0){
      int t=n%b;
      n=n/b;
      r=r+t*m;
      m=m*10;
     }
     return r;
 }
}