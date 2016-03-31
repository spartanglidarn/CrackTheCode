import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Coder {

	static void coder (String input) {
	
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
	
	for (int i = 0; i < numbers.length; i++) {
		numbers[i] = codeMap.get(numbers[i]);
	}
	
	String codeResult = Arrays.toString(numbers);
	//System.out.println(codeResult);
	
}
	
}
