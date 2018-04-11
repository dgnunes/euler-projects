package euler7;

//10001st prime
//Problem 7
//
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

public class Euler7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 6;
		int prime = 13;
		
		while (count < 10001){
			prime += 2;
			
			if (isPrime(prime)){
				count++;
			}
			
		}
		
		System.out.println("POS:" + count);
		System.out.println("PRIME:" + prime);

	}

	public static boolean isPrime(long candidate){
		
		if (candidate % 2 == 0){
			return false;
		}
		
		for (long i = 3L; i <= Math.sqrt(candidate); i+=2){
			if (candidate % i ==0 ) return false;
		}
		
		return true;
	}
}
