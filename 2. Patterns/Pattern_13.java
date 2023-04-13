/* 
1
1       1
1       2       1
1       3       3       1
1       4       6       4       1
*/
import java.util.*;
public class Pattern_13{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		sc.close();
		int i,j;
		for(i=0;i<n;i++){
			int val=1;
			for(j=0;j<=i;j++){
				System.out.print(val+"\t");
				val=(val*(i-j))/(j+1);	
			}
			System.out.println("");
		}
        
	}
}