/* 
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
*/
import java.util.*;
public class Pattern_11{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j,c=1;
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print(c+"\t");
				c++;
			}
			System.out.println("");
		}
		
        sc.close();
	}
}