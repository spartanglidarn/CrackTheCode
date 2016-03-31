import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Gui gui = new Gui();
	gui.showTextFieldDemo();
	
		
	boolean alive = true;	
		while (alive){	
			System.out.println("Write the numbers here: ");
			Scanner userInput = new Scanner(System.in);
			String input = userInput.next();
			//System.out.println(input);
			
			int [] numbers = new int[input.length()];
			for (int x = 0; x < input.length(); x++) {
				numbers[x] = input.charAt(x) - '0';
			}
			
			HashMap<Integer, Integer> codeMap = new HashMap<>();
			
			codeMap.put(0, 5);
			codeMap.put(1, 9);
			codeMap.put(2, 8);
			codeMap.put(3, 7);
			codeMap.put(4, 6);
			codeMap.put(5, 0);
			codeMap.put(6, 4);
			codeMap.put(7, 3);
			codeMap.put(8, 2);
			codeMap.put(9, 1);
			
			for (int x = 0; x < numbers.length; x++) {
				numbers[x] = codeMap.get(numbers[x]);
			}
			
			String codeResult = Arrays.toString(numbers);
			System.out.println(codeResult);
			
			System.out.println("Press enter to countinue, write quit to quit the program: ");
			Scanner q = new Scanner(System.in);
			String quitting = q.nextLine();
			if (quitting.equals("quit")) {
				alive = false;
				System.out.println("Thank you for playing!");
			} 
		}
	}
}
