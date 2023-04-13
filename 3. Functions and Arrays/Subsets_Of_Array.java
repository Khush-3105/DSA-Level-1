/*1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.*/
import java.io.*;

public class Subsets_Of_Array{

  public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
      int n = Integer.parseInt(br.readLine());
      int[] a = new int[n];
      for(int i = 0; i < n; i++){
         a[i] = Integer.parseInt(br.readLine());
      }
      int l = (int)Math.pow(2,n);
      for (int i = 0; i < l; i++){
      String set = "";  
      int temp = i;  
      for (int j = a.length - 1; j >= 0; --j)
      {
        int rem = temp % 2;
        temp = temp / 2;
        if (rem == 0)
        {
          set = "-	" + set;
        }
        else
        {
          set = a[j] + "	" + set;
        }
      }
      System.out.println (set); 
    }      
   }  
  }