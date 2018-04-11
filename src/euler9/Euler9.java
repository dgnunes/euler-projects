package euler9;


//Special Pythagorean triplet
//Problem 9
//
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a² + b² = c²
//
//For example, 3² + 4² = 9 + 16 = 25 = 5².
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class Euler9 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DADO O SISTEMA COM AS EQUAÇÕES 
		//a + b + c = 1000 
		//a² + b² = c²
		//E utilizando o menor número (a) para iteração
		//obtemos
		//b = (10⁶ - 2000a)/(2000 - 2a)
		//c = sqrt(a² + b²)

		int count = 0;
		int a = 1;
		int b = 1;
		int c = 1;
		
		while (!isPythagoreanTriplet(a,b,c)){
			count++;
			
			a++;
			
			if ((1000000 - 2000*a)%(2000 - 2*a) != 0) continue;
			
			b = (1000000 - 2000*a)/(2000 - 2*a);
			
			if (b < a){
				System.out.println("B MENOR");
				break;
			}
			
			c = (int) Math.sqrt(a*a + b*b);

//			System.out.println("Iteração: " + count);
//			System.out.println("A: " + a);
//			System.out.println("B: " + b);
//			System.out.println("C: " + c);
			
		}
		System.out.println("RESULTADO: " + a*b*c);
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
		
		
		
		
	}
	
	private static boolean isPythagoreanTriplet(int a, int b, int c) {
		return (a+b+c==1000 && ((a*a) + (b*b) == (c*c)));
	}
	

}
