package mod3Day1Lab2;

public class Lab2 {

//	Question # 1 
	public static void printingString(String str) {

		int lengthStr = str.length();
		int i = 0;
		while (i < lengthStr) {
			System.out.println(str.charAt(i));
			i++;
		}
	}

//	Question # 2

	public static void duplicateChar(String str) {

		int counter = 0;

		char[] characters = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (characters[i] == characters[j]) {
					System.out.println(characters[j]);
					counter++;
					break;
				}
			}
		}

	}
//	Question # 3

	public static int addNumbers(int num) {
		int i = 0;
		int sum = 0;
		while (i <= num) {
			sum = sum + i;
			i++;
		}
		return sum;
	}

//	Question # 4

	public static void printEvenNumbers() {
		int i = 1;
		while (i < 20) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

//	Question # 5 

	public static void givenOutput() {

		int[] numbers = { 1, 1, 3, 5, 7, 9 };

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] + 1;
			System.out.println(numbers[i]);
		}

	}

//	Question # 6 

	public static void evenNumbersPrint(int number) {

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

//	Question # 7 

	public static void callPrime(int numberGiven) {

		System.out.println("1 is Odd");

		for (int number = 2; number <= numberGiven; number++) {
			
			int count = 0;
			if (number == 3) {
				System.out.println(number + " is Odd");
			} else if (number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				for (int i = 2; i < (number / 2 + 1); i++) {
					if (number % i == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.println(number + " Is Prime ");
				} else {
					System.out.println(number + " is Odd");
				}
			}
			
//			typeOfNumbers(i);
		}
	}

//	public static void typeOfNumbers(int number) {
//		int count = 0;
//		if (number == 3) {
//			System.out.println(number + " is Odd");
//		} else if (number % 2 == 0) {
//			System.out.println(number + " is even");
//		} else {
//			for (int i = 2; i < (number / 2 + 1); i++) {
//				if (number % i == 0) {
//					count++;
//					break;
//				}
//			}
//			if (count == 0) {
//				System.out.println(number + " Is Prime ");
//			} else {
//				System.out.println(number + " is Odd");
//			}
//		}
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		printingString("Hello World");
//		duplicateChar("extraordinary");
//		System.out.println(addNumbers(10));
//		printEvenNumbers();
//		givenOutput();
//		evenNumbersPrint(10);
		callPrime(20);
	}

}
