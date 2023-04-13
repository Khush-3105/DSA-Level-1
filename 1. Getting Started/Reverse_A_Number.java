/* 1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.*/
import java.util.*;
public class Reverse_A_Number{
	public static void digit(int n) {
		if(n==0)
			return;
		System.out.println(n%10);
		digit(n/10);
		
		
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		digit(n);
        sc.close();
	}
}