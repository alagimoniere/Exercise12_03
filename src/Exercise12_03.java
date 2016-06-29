import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner keyboard = new Scanner(System.in);
		
		/** Create list of random numbers */
		for (int i = 0; i < 100; i++) {
			Random randomNumberGenerator = new Random();
			list.add(randomNumberGenerator.nextInt(9));
			System.out.println(i + ". " + list.get(i) + ", ");
		}

		/** Ask for index of array from user */
		System.out.println("Enter index: ");
		int index = keyboard.nextInt();


		/** Check for out of bounds exception */
		try {
			System.out.println("Number at index " + index + ": " + list.get(index));
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	
	}

}
