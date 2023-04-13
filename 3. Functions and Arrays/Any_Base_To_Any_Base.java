/* 1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.*/
import java.util.*;

public class Any_Base_To_Any_Base {

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();
      int de = getValueIndecimal( n, b1);
      int dn = getValueInBase(de, b2);
      System.out.println(dn);
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