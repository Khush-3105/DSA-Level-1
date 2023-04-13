/* 1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to display the contents of 2d array as suggested by output format below.*/
import java.util.*;
public class _2d_Arrays_Demo{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i =0 ; i<n; i++){
			for(int j=0; j<m; j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0 ; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
        sc.close();
	}
}