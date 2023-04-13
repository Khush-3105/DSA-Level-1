/* 
1                                                               1     
1       2                                               2       1     
1       2       3                               3       2       1     
1       2       3       4               4       3       2       1     
1       2       3       4       5       4       3       2       1 
*/
import java.util.*;
public class Pattern_16{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		sc.close();
		int i,j,k,l,space=2*n-3,star=1;
		
		for(i=1;i<=n;i++){
			int v=1;
			for(k=1;k<=star;k++){
				System.out.print(v+"\t");
				v++;
			}
			for(j=0;j<space;j++){
				System.out.print("\t");
			}
			space-=2;
			if(i==n){
				star--;
				v--;
			}
			for(l=1;l<=star;l++){
				v--;
				System.out.print(v+"\t");
			}
			star++;
			
		
			
			System.out.println("");	
		}
	}
}