/* 
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
*/
import java.util.*;
public class Spiral_Display{
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
		int minr = 0;
		int minc = 0;
		int maxr = n-1;
		int maxc = m-1;
		int c=0;

		while(c<n*m){
			// left wall
			for(int i = minr ; i<=maxr && c<n*m; i++){
				System.out.println(arr[i][minc]);
				c++;
			}
			minc++;

			// bottom wall
			for(int j = minc ; j<=maxc && c<n*m; j++ ){
				System.out.println(arr[maxr][j]);
				c++;
			}
			maxr--;

			// right wall
			for(int i = maxr ; i>=minr && c<n*m; i-- ){
				System.out.println(arr[i][maxc]);
				c++;
			}
			maxc--;

			//top wall
			for(int j = maxc ; j>=minc && c<n*m; j-- ){
				System.out.println(arr[minr][j]);
				c++;
			}
			minr++;

		}
        
	}
}