/* 1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.*/
import java.util.*;
public class Digits_Of_A_Number{
	public static void digit(int n) {
		if(n==0)
			return;
		digit(n/10);
		System.out.println(n%10);
		
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		digit(n);
        sc.close();
	}
}