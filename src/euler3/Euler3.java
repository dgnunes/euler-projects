package euler3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

//Largest prime factor
//Problem 3
//
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

public class Euler3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Long PROBLEM_NUMBER = 600851475143L;

		long start = Calendar.getInstance().getTimeInMillis();
		List<Long> primeFactors = getPrimeFactors(PROBLEM_NUMBER);
		long end = Calendar.getInstance().getTimeInMillis();

		
		
		
		Collections.sort(primeFactors);
		System.out.println("Fatores primos: " + primeFactors);
		System.out.println("Duração: " + (end-start) + "ms");
		
		
		
		
		System.out.println("Testando Resposta:");
		Long result = 1L;
		for (Long factor:primeFactors){
			result *= factor;

		}
			
		System.out.println("A:" + PROBLEM_NUMBER);
		System.out.println("B:" + result);
		
	}

	public static List<Long> getPrimeFactors(long bigNumber){
		System.out.println(bigNumber);
		List<Long> primeFactors = new ArrayList<>();
		
		long factor = 1L;
		
		if (bigNumber % 2L == 0){
			factor = 2L;
		}
		else {
			for (long i = 3L; i <= Math.sqrt(bigNumber); i += 2L){
				if (bigNumber % i == 0){
					factor = i;
					break;
				}
			}	
		}

		if (factor > 1L){
			System.out.println("Factor:" + factor);
			primeFactors.add(factor);
			primeFactors.addAll(getPrimeFactors(bigNumber/factor));
		}else {
			primeFactors.add(bigNumber);
		}
		
		return primeFactors;
	}
}
