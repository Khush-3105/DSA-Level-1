/* 1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.*/
import java.util.*;

public class Sum_Of_Two_Arrays{

public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int [] a1 = new int[n];
    for (int i=0; i<n;i++){
        a1[i]=sc.nextInt();
    }
    int m= sc.nextInt();
    int [] a2 = new int[m];
    for (int i=0; i<m;i++){
        a2[i]=sc.nextInt();
    }
    int sum[]=new int [n>m?n:m];
    int i = n - 1;
    int j = m - 1;
    int k = sum.length - 1;
    int c = 0;
    while (i >= 0 || j >= 0) {
      int d = c;

      if (i >= 0)
        d += a1[i];

      if (j >= 0)
        d += a2[j];

      c = d / 10;
      d = d % 10;
      sum[k] = d;

      i--;
      j--;
      k--;
    }

    if (c > 0) {
      System.out.println(c);
    }
    for (int val : sum) {
      System.out.println(val);
    }
     


    sc.close();

 }

}