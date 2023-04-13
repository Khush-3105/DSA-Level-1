/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to calculate the inverse of array a.*/
import java.util.*;

public class Rotate_An_Array{

public static void reverse(int[] arr,int i , int j ){
    while(i<j){
        int t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        i++;
        j--;
    }
}

public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int [] arr = new int[n];
    for (int i=0; i<n;i++){
        arr[i]=sc.nextInt();
    }
    int k= sc.nextInt();
    reverse(arr,n-k,n-1);
    reverse(arr,0,n-k-1);
    reverse(arr,0,n-1);
    for(int val: arr){
        System.out.print(val+" ");
    }
    sc.close();

 }

}