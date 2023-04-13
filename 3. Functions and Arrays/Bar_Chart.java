/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.*/
import java.util.*;

public class Bar_Chart{

public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int [] arr = new int[n];
    for (int i=0; i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for (int i=1; i<n;i++){
        if(arr[i]>max)
            max=arr[i];
    }
    while(max>=0){
    for (int i=0; i<n;i++){
        if(arr[i]>max){
            System.out.print("*\t");
        }else{
            System.out.print(" \t");
        }
    }
    System.out.println("");
    max--;
}
    


    sc.close();

 }

}