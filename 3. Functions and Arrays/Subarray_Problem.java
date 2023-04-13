/* 1. You are given an array of size 'n' and n elements of the same array.
2. You are required to find and print all the subarrays of the given array. 
3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output. */
import java.io.*;

public class Subarray_Problem{

  public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
      int n = Integer.parseInt(br.readLine());
      int[] a = new int[n];
      for(int i = 0; i < n; i++){
         a[i] = Integer.parseInt(br.readLine());
      }
      for (int i=0;i<n;i++){
        int m=n-i;
        while(m>0){
          for(int j =i;j<n-m+1;j++){
            System.out.print(a[j]+" ");
          }
          System.out.println("");
          m--;
        }
        
      }
   }
  
  }