/* 1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.*/
import java.util.*;
public class Is_A_Number_Prime{
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
	    int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i=0; i<n;i++){
			arr[i]= sc.nextInt();
		}
		for (int i=0; i<n;i++){
			if(isPrime(arr[i]))
				System.out.println("prime");
			else
				System.out.println("not prime");
		}
		
        sc.close();
	}
}