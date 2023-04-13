/* 
1  2  3
4  5  6
7  8  9

Path followed by traveler: 1->4->7->8->5->2->3->6->9

You are required to print the path that this traveler follows to visit all places.
*/
import java.util.*;
public class The_State_Of_Wakanda_1{
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
		for(int j =0 ; j<m; j++){
			if(j%2==0)
				for(int i=0; i<n; i++){
					System.out.println(arr[i][j]);
				}
			else
				for(int i=0; i<n; i++){
					System.out.println(arr[i][j]);
				}
		}
        sc.close();
	}
}