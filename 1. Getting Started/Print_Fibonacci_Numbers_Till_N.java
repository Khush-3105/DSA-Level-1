/* 1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.*/
import java.util.*;
public class Print_Fibonacci_Numbers_Till_N{
public static void fib(int a, int b,int n) {
	if(n==0)
		return;
	int c= a+b;
	System.out.println(c);
	fib(b,c,n-1);
}

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();	
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		fib( a, b, n-2);
        sc.close();
	}
}