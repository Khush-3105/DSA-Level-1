/* 
The monuments are named as:
1    2    3    4
5    6    7    8
9    10   11   12
13   14   15   16
The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
You are required to print the path followed by the traveller to visit all the monuments.
*/
import java.util.*;
public class The_State_Of_Wakanda_2{
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

		for (int gap = 0; gap < n; gap++) {
			for (int i = 0, j = gap; j < n; i++, j++) {
			  System.out.println(arr[i][j]);
			}
		  }
		
	}
}