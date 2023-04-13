/* 1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.*/
import java.util.*;
public class Prime_Factorization_Of_A_Number{
	public static boolean isPrime(int x) {
		if(x==1)
				return false;
		for(int i =2; i*i<=x;i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			for(int i=2;i*i<=n;i++){
				if(isPrime(i)){
					while(n%i==0){
						n/=i;
						System.out.print(i+" ");
					}
				}
			}
			if(n!=1){
				System.out.print(n);
			}
        sc.close();
	}
}