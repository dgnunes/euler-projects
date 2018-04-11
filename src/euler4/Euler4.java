package euler4;

//Largest palindrome product
//Problem 4
//
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Euler4 {
	static final int MIN_3_DIGIT = 100;
	static final long MIN_POSSIBLE_PALINDROME = MIN_3_DIGIT*MIN_3_DIGIT;
	
	static final int MAX_3_DIGIT = 999;
	static final long MAX_POSSIBLE_PALINDROME = MAX_3_DIGIT*MAX_3_DIGIT;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(MIN_POSSIBLE_PALINDROME);
		System.out.println(MAX_POSSIBLE_PALINDROME);

		for (long i = MAX_POSSIBLE_PALINDROME; i > MIN_POSSIBLE_PALINDROME; i--){
			System.out.println(i);
			
			if (isPalindrome(i) && isMultipleFrom3Digit(i)){
				System.out.println("FOUND:" + i);
				break;
			}
			
		}
		
		
		
	}
	
	public static boolean isPalindrome(long candidate){
		
		String parsed = Long.toString(candidate);
		
		for (int i = 0; i <= parsed.length()/2; i++){
			int j = parsed.length() - i - 1;
			
			if (parsed.charAt(i) != parsed.charAt(j)){
				return false;
			}
		}
		
		return true;
	}
	
	static boolean isMultipleFrom3Digit(long candidate){
		
		for (int i = MAX_3_DIGIT; i > MIN_3_DIGIT; i--){
			if (candidate%i == 0 && (candidate/i) >= 100 && (candidate/i) <= 999){
				System.out.println("FACTOR: " + i);
				return true;
			}
		}
		
		return false;
	}
		

}
