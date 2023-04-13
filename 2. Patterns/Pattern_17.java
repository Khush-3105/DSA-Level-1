/* 
		*	
		*	*		
*	*	*	*	*	
		*	*	
		*
*/
import java.util.*;
public class Pattern_17{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		sc.close();
		int i,j,star=1;
		
		for(i=1;i<=n;i++){
			if(i==(n/2)+1)
				System.out.print("*\t*\t");
			else
				System.out.print("\t\t");
			for(j=0;j<star;j++){
				System.out.print("*\t");
			}
			if(i<=n/2){
				star++;
			}
			else
				star--;
			
			
		
			
			System.out.println("");	
		}
	}
}