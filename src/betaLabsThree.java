
public class betaLabsThree {

	public static void main(String[] args) {
		int [] array = {1, 5, 2, 8, -3, 13, 6};//better way to write out
		
		System.out.println(array [0]); //print out first element
		System.out.println(array[array.length -1]);//print out the last element in the array
		//System.out.println(array[6]);//both of these are out of the array bounds and will be an error
		//System.out.println(array[-1]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int number : array) {
			System.out.println(number);
		}
		double sum = 0;
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);
		
		double average = sum / array.length;
		System.out.println(average);
		
		for (int number : array) {
			if (number % 2 == 1) {
			System.out.println(number);
			}
		}
		
		String [] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
		greet("Tom");//the print out is in this method
		greet("Sally");
		
		String greeting = greet2("Beau");//created a string and this allows us to call the method and return the value but not print
		System.out.println(greeting);
		
		System.out.println(isStringLongerThanNumber ("Hello", 3));
		
		System.out.println(doesArrayContainString (names, "Sam"));
		
		System.out.println(findSmallestNumber(array));
		
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(calculateAverage(doubles));
		
		
		int [] nameLengths = extractStingLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
		System.out.println(hasMoreEvenWordCharacters(names));
		
		System.out.println(isPalindrome ("racecar"));
	}

	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
		
	}
	
	public static String greet2 (String name) {
		return "Hi, " + name + "!";
	}
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		return (string.length() > number); //it will return the boolean
			
	}
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	public static int findSmallestNumber (int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;

	}
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum /array.length;
	}
	public static int[] extractStingLengths (String[] strings) {
		int[] results = new int[strings.length];
		for (int i =0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	
	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLetters =0;
		int oddLetters = 0;
		
		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			}else {
				oddLetters += string.length()
;			}
			
		}
		return evenLetters > oddLetters;
	}
	public static boolean isPalindrome (String string) {
		//racecar, mom, wow
		for (int i = 0; i <string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i -1)) {
				return false;
			}
		}
		return true;
	}

}
