/* 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340*/
import java.util.*;
public class Rotate_A_Number{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int digit=0;
		int temp=n;
		while(temp>0){
			digit++;
			temp=temp/10;
		}
		int div= 1;
		int mult=1;
		for (int i = 1; i <= digit; i++)
			{
			if (i <= k)
				//while the iterator is less than k
			{
				//we increase the value of divisor
				div *= 10;
			}
			else
				//or else we increase the value of multiplier
				mult *= 10;
			}
		
		int quo = n / div; // extracting the quotient 
		int rem = n % div; // extracting the remainder
		int r = rem * mult + quo;
		//forming the rotated number
		System.out.println(r);
        sc.close();
	}
}