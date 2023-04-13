/* 
*  *  *  *  *
*  *  *  *
*  *  *
*  *
*
*/
import java.util.*;
public class Pattern_2{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j;
		for(i=n;i>0;i--){
			for(j=0;j<i;j++){
				System.out.print("*  ");
			}
			System.out.println("");
		}
		
        sc.close();
	}
}