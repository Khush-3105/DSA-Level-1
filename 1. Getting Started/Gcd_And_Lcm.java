/* 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.*/
import java.util.*;
public class Gcd_And_Lcm{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int lcm=n*m;
		while(n%m !=0){
			int rem=n%m;
			n=m;
			m=rem;
		}
		System.out.println(m);
		lcm=lcm/m;
		System.out.println(lcm);
        sc.close();
	}
}