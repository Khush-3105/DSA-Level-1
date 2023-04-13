/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a. */
import java.io.*;

public class Reverse_An_Array{
    public static void display(int[] a){
      StringBuilder sb = new StringBuilder();
  
      for(int val: a){
        sb.append(val + " ");
      }
      System.out.println(sb);
    }
  
    public static void reverse(int[] a){
      int i=0;
      int j=a.length-1;
      while(i<j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
        i++;
        j--;
      }
    }
  
  public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
      int n = Integer.parseInt(br.readLine());
      int[] a = new int[n];
      for(int i = 0; i < n; i++){
         a[i] = Integer.parseInt(br.readLine());
      }
      reverse(a);
      display(a);
   }
  
  }