/* 
            *
         *  *
      *  *  *
   *  *  *  *
*  *  *  *  *
*/
import java.util.*;
public class Pattern_3{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j,k;
		for(i=0;i<n;i++){
			for(k=i;k<n-1;k++){
				System.out.print("   ");
			}
			for(j=0;j<=i;j++){
				System.out.print("*  ");
			}
			System.out.println("");
		}
		
        sc.close();
	}
}