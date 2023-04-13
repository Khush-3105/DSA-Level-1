/* 1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.*/
import java.util.*;
public class Count_Digits_In_A_Number{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int digits=0;
		while(n>0){
			digits++;
			n/=10;
		}
		System.out.println(digits);
        sc.close();
	}
}