/* 
*       *       *               *       *       *     
*       *                               *       *     
*                                               *     
*       *                               *       *     
*       *       *               *       *       *     
*/
import java.util.*;
public class Pattern_6{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j,k,space=1,star=n%2==0?n/2:(n/2)+1;
		for(i=0;i<n;i++){
			//System.out.println(star+" "+space);
			for(k=0;k<star;k++){
				System.out.print("*\t");
			}
			for(j=space;j>0;j--){
				System.out.print("\t");
			}
			for(k=0;k<star;k++){
				System.out.print("*\t");
			}
		
			if(i<n/2){
				space+=2;
				star--;
			}else{
				space-=2;
				star++;
			}
			System.out.println("");	
			}
        sc.close();
	}
}