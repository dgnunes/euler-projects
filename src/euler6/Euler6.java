package euler6;

//Sum square difference
//Problem 6
//
//The sum of the squares of the first ten natural numbers is,
//1²+ 2² + ... + 10² = 385
//
//The square of the sum of the first ten natural numbers is,
//(1 + 2 + ... + 10)² = 55² = 3025
//
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Euler6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long sum_square = 0;
		long square_sum = 0;
		
		for (long i = 1L; i < 101L; i++){
			sum_square += (i*i);
			square_sum += i;
		}

		square_sum *= square_sum;
		
		System.out.println(square_sum - sum_square);
		
		
	}

}
