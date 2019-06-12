import java.util.ArrayList;
import java.util.Scanner;

/**
 * This function takes a list and puts every other option into a different list
 * @author havak
 *
 */
public class SplitList {

	public static void main(String[] args) {
		
		ArrayList<Integer> original = new ArrayList<>();
		original.add(1);
		original.add(2);
		original.add(3);
		original.add(4);
		original.add(5);
		original.add(6);
		original.add(7);
		original.add(8);
		original.add(9);
		original.add(10);
		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		
		for (Integer item : original) {
			int index = original.indexOf(item);
			if(index % 2 == 0) {
				first.add(item);
			}
			else {
				second.add(item);
			}
		}
		
		System.out.println("The first list is " + first);
		System.out.println("The second list is " + second);

	}

}
