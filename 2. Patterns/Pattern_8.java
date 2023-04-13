/* 
                                *
                        *
                *
        *
*   
*/
import java.util.*;
public class Pattern_8{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(i+j==n+1)
					System.out.print("*\t");
				else	
					System.out.print("\t");
			}
			System.out.println("");	
			}
        sc.close();
	}
}