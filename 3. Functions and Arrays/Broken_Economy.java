/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of the array a.
3. You are given another number d.
4. You are required to find the ceil and floor of d in array a.*/
import java.io.*;

public class Broken_Economy{

  public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
      int n = Integer.parseInt(br.readLine());
      int[] a = new int[n];
      for(int i = 0; i < n; i++){
         a[i] = Integer.parseInt(br.readLine());
      }
      int d = Integer.parseInt(br.readLine());
      int low=0;
      int high=n;
      //int l1,l2;
      while(low<=high){
        int mid = (low+high)/2;
        if(d>a[mid])
          low=mid+1;
        else if(d<a[mid])
          high=mid-1;
      }
      System.out.println(a[low]);
      System.out.println(a[high]);
   }
  
  }