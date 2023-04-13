/* 
                *
        *               *
*                               *
        *               *
                *   
*/
import java.util.*;
public class Pattern_10{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j,k,inner=-1,outer=n/2;
		for(i=0;i<n;i++){
			//System.out.println(outer+" "+inner);
			for(k=0;k<outer;k++){
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(j=0;j<inner;j++){
				System.out.print("\t");
			}
			if(i>0 && i<n-1){
				System.out.print("*");
			}			
		
			if(i<n/2){
				inner+=2;
				outer--;
			}else{
				inner-=2;
				outer++;
			}
			System.out.println("");	
			}
        sc.close();
	}
}