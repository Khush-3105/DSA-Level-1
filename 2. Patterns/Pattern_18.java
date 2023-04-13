/* 
*       *       *       *       *       *       *
        *                               *
                *               *
                        *
                *       *       *
        *       *       *       *       *
*       *       *       *       *       *       *
*/
import java.util.*;
public class Pattern_18{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		sc.close();
		int i,j,k,star=n,space=0;
		
		for(i=1;i<=n;i++){
			for(j=1;j<=space;j++){
				System.out.print("\t");
			}
			for(k=1;k<=star;k++){
				if(i>1 && i<=n/2 && k>1 && k<star )
					System.out.print("\t");
				else
					System.out.print("*\t");
			}
			if(i<=n/2){
				space++;
				star-=2;
			}else{
				space--;
				star+=2;
			}
			
			
		
			
			System.out.println("");	
		}
	}
}