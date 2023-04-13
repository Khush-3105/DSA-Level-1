/* 
1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .
*/
import java.util.*;
public class Rotate_By_90_Degree{
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

		//Transpose first

		for(int i =0 ; i<n; i++){
			for(int j=i; j<m; j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}

		//Reverse columns

		for(int i =0 ; i<n; i++){
			int li=0;
			int ri=m-1;
			while(li<ri){
				int temp=arr[i][li];
				arr[i][li]=arr[i][ri];
				arr[i][ri]=temp;
				li++;
				ri--;
			}
		}



		//Display
		for(int i =0 ; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}


		
	}
}