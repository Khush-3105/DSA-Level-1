/* 
                *
        *       *       *
*       *       *       *       *
        *       *       *
                *
*/
import java.util.*;
public class Pattern_5{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j,k,space=n/2,star=1;
		for(i=0;i<n;i++){
			for(j=space;j>0;j--){
				System.out.print("\t");
			}
			for(k=0;k<star;k++){
				System.out.print("*\t");
			}
		
			if(i<n/2){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;
			}
			System.out.println("");	
			}
        sc.close();
	}
}