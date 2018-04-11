package euler10;

import euler7.Euler7;

//Summation of primes
//Problem 10
//
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.


public class Euler10 {
	private static int PRIME_LIMIT = 2000000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long sum = 17;
		for (int i = 9; i < PRIME_LIMIT; i +=2){
			
			if (Euler7.isPrime(i)){
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
