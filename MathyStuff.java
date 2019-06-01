import java.util.Scanner;

public class MathyStuff {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		calculateFibonacci(limit);//calculates fibonacci to the nth number
		
		int limitPi = sc.nextInt();
		determinePiDigit(limitPi);//calculates pi to the nth digit, limit is 100
		
		int limitCalc = sc.nextInt();
		double pi = calculatePiNilakantha(limitCalc);//still need to get this working maybe!!
		double pi2 = calculatePiLeibniz(limitCalc);
		System.out.println(pi);
		System.out.println(pi2);
		

	}
	
	public static void calculateFibonacci(int limit) {
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
		
		for (int i = 0; i < limit; i++) {
			thirdNum = firstNum + secondNum;
			System.out.println(firstNum);
			firstNum = secondNum;
			secondNum = thirdNum;
			
		}
	}
	
	public static void determinePiDigit(int limit) {
		
		String pi = "1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
		System.out.print("3." + pi.substring(0, limit));
		
		
	}
	
	public static double calculatePiNilakantha(int limit) {
		double pi = 3;
		int multiplier = 4/(2*3*4);
		int lastDigMult = 4;
		int nextDig;
		int lastDig;
		int plusOrMinus = 1;//1 means to add
		//pi++;
		
		for (int i = 0; i < limit; i++) {
			if (plusOrMinus == 1) {
				pi = pi + multiplier;
				plusOrMinus = 0;
			}
			else {
				pi = pi - multiplier;
				plusOrMinus = 1;
				//pi++;
			}
			
			nextDig = lastDigMult + 1;
			lastDig = lastDigMult + 2;
			
			multiplier = 4/(lastDigMult * nextDig * lastDig);
			lastDigMult = lastDig;
			//pi++;
			
		}
		
		
		
		return pi;
	}
	
	public static double calculatePiLeibniz(int limit) {
		double pi = 1;
		int denom = 3;
		double multiplier = 1/denom;
		int plusOrMinus = 0;
		
		for (int i = 0; i < limit; i++) {
			if (plusOrMinus == 1) {
				pi = pi + multiplier;
				plusOrMinus = 0;
			}
			else {
				//pi = pi - multiplier;
				//pi = pi + 10;
				plusOrMinus = 1;
				//pi++;
			}
			
			denom = denom + 2;
			multiplier = 1/denom;
		}
		
		
		return pi;
	}

}

