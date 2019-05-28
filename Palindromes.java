import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your first word.");
		String word1 = sc.nextLine();
		System.out.println("Input your second word.");
		String word2 = sc.nextLine();
		
		int length1 = word1.length();
		int length2 = word2.length();
		StringBuilder reverse = new StringBuilder();
		for (int i = length2-1; i >= 0; i--) {
			reverse.append(word2.charAt(i));
		}
		reverse.toString();
		if (length1 != length2) {
			System.out.println("Not palindromes.");
		}
		else {
			for(int i = 0; i < length1; i++) {
				if (word1.charAt(i) != reverse.charAt(i)) {
					System.out.println("Not palindromes.");
					return;
				}
			}
			
			System.out.println("Palindrome!");
		}

	}

}
