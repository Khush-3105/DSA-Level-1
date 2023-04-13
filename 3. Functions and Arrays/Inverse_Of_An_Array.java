/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to calculate the inverse of array a.*/
import java.util.*;

public class Inverse_Of_An_Array{

    public static int[] inverse(int[] a) {
        int[] inv = new int[a.length];
    
        for (int i = 0; i < a.length; i++) {
          int val = a[i];
          inv[val] = i;
        }
    
        return inv;
      }

public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int [] arr = new int[n];
    for (int i=0; i<n;i++){
        arr[i]=sc.nextInt();
    }
    int[] inv = inverse(arr);
    for(int val: inv){
        System.out.print(val+" ");
    }
    sc.close();

 }

}