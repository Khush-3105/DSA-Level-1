/* 
0
1       1
2       3       5
8       13      21      34
55      89      144     233     377
*/
import java.util.*;
public class Pattern_12{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j,a=0,b=1,c;
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print(a+"\t");
				c=a+b;
				a=b;
				b=c;
				
			}
			System.out.println("");
		}
		
        sc.close();
	}
}
