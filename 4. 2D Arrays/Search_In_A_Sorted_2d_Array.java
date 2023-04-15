/* 
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a. 
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".
*/
import java.util.*;
public class Search_In_A_Sorted_2d_Array{
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
		int x = sc.nextInt();
        sc.close();
		int r=0;
		int c=n-1;
		while(r<n && c>=0){
			if (arr[r][c]==x){
				System.out.println(r);
				System.out.println(c);
				return;
			}
			if(arr[r][c]>x){
				c--;
			}else{
				r++;
			}
		}
	}
}