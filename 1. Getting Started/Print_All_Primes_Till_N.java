/*1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included). */
import java.util.*;
public class Print_All_Primes_Till_N{
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
	    Scanner sc=new Scanner(System.in);
	    int low = sc.nextInt();
	    int high = sc.nextInt();		
		for (int i=low; i<=high;i++){
			if(isPrime(i))
				System.out.println(i);
		}
        sc.close();
	}
}