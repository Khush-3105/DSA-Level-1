/* 
                1
        2       3       2
3       4       5       4       3
        2       3       2
                1
*/
import java.util.*;
public class Pattern_15{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		sc.close();
		int i,j,k,space=n/2,star=1,v=1;
		for(i=1;i<=n;i++){
			for(j=space;j>0;j--){
				System.out.print("\t");
			}
			int cv=v;
			for(k=1;k<=star;k++){
				System.out.print(cv+"\t");
				if(k<=star/2)
					cv++;
				else
					cv--;
			}
		
			if(i<=n/2){
				star+=2;
				space--;
				v++;
			}else{
				star-=2;
				space++;
				v--;
			}
			System.out.println("");	
			}
	}
}