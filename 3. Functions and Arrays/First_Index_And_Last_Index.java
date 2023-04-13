/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.

Asssumption - Array is sorted. Array may have duplicate values.*/
import java.io.*;

public class First_Index_And_Last_Index{

  public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
      int n = Integer.parseInt(br.readLine());
      int[] a = new int[n];
      for(int i = 0; i < n; i++){
         a[i] = Integer.parseInt(br.readLine());
      }
      int d = Integer.parseInt(br.readLine());
      int low=0;
      int high=n-1;
      int f =-1;
      while(low<=high){
        int mid = (low+high)/2;
        if(d>a[mid])
          low=mid+1;
        else if(d<a[mid])
          high=mid-1;
        else{
          f=mid;
          high=mid-1;

        }
      }
       low=0;
      high=n-1;
      int l =-1;
      while(low<=high){
        int mid = (low+high)/2;
        if(d>a[mid])
          low=mid+1;
        else if(d<a[mid])
          high=mid-1;
        else{
          l=mid;
          low=mid+1;

        }
      }
      System.out.println(f);
      System.out.println(l);
   }
  
  }