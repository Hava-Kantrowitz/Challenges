import java.util.ArrayList;
import java.util.Scanner;

/**
 * This function takes a list and puts every other option into a different list
 * @author havak
 *
 */
public class SplitList {

	public static void main(String[] args) {
		
		ArrayList<Integer> originalHard = new ArrayList<>();
		ArrayList<Integer> originalInput = new ArrayList<>();
		originalHard.add(1);
		originalHard.add(2);
		originalHard.add(3);
		originalHard.add(4);
		originalHard.add(5);
		originalHard.add(6);
		originalHard.add(7);
		originalHard.add(8);
		originalHard.add(9);
		originalHard.add(10);
		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			char myChar = input.charAt(i);
			int myInt = Character.getNumericValue(myChar);
			originalInput.add(myInt);
		}
		
		
		if(originalInput.size() == 0) {
		for (Integer item : originalHard) {
			int index = originalHard.indexOf(item);
			if(index % 2 == 0) {
				first.add(item);
			}
			else {
				second.add(item);
			}
		}
		}
		
		else {
			for (Integer item : originalInput) {
				int index = originalInput.indexOf(item);
				if(index % 2 == 0) {
					first.add(item);
				}
				else {
					second.add(item);
				}
			}
		}
		
		System.out.println("The first list is " + first);
		System.out.println("The second list is " + second);

	}

}