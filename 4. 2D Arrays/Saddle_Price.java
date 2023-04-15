/* 
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
*/
import java.util.*;
public class Saddle_Price{
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
        sc.close();

		int colno = 0, min = 0;
		for (int i = 0; i < n; i++) {   // rows
		min = arr[i][0];
		for (int j = 0; j < n; j++) {   // columns
			if (min > arr[i][j]) {
			min = arr[i][j];
			colno = j;
			}
		}
		boolean potentialAns = true;
		for (int r = 0; r < n; r++) {
			if (min < arr[r][colno]) {
			potentialAns = false;
			break;
			}
		}
		if (potentialAns == true) {
			System.out.print(min);
			return;
		}
		}
		System.out.print("Invalid Input");
		
	}
}