/* 
*  *  *  *  *
   *  *  *  *
      *  *  *
         *  *
            *
*/
import java.util.*;
public class Pattern_4{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j,k;
		for(i=n;i>0;i--){
			for(k=0;k<n-i;k++){
				System.out.print("   ");
			}
			for(j=0;j<i;j++){
				System.out.print("*  ");
			}
			System.out.println("");
		}
		
        sc.close();
	}
}