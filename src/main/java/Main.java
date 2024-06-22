public class Main {

	public static void main(String[] args) {
		System.out.println("I love Java!");
		int a = 7;
		int b = 2;
		int sum = a + b;

		System.out.println("a + b = c");
		System.out.println(a + " + " + b + " = " + sum);

		float pi = 3.14159f;
		double eulersMacaroni = 0.5772156f;

		//THE NEXT LINE HAS BEEN COMMANDEERED BY AN EVIL COMMENT!! HELP US FIX IT!!
		String[] myWords = {"According", "to", "all", "known", "laws", "of", "aviation"};
		for (int i = 0; i < 7; i++) {
			System.out.println("Word at index i: " + myWords[i]);
		}

		int myNumber = 33000;
		if (myNumber < 0) {
			System.out.println("My number is less than 0");
		}
		else if (myNumber >= 0){
			System.out.println("My number is greater than or equal to 0");
		}
		else {
			System.out.println("This statement will never print!");
		}

		if (('A' == 'A') && (42 == 42)) {
			System.out.println("The character A is equal to the character A, and the number 42 is equal to the number 42!");
		}

		int illFloatToo = 30;
		
		if (.1 + .2 == .3) {
			System.out.println("Obviously, .1 + .2 == .3!");
		}
		else {
			System.out.println("Wait, it doesn't?!");
		}


		boolean[] trueIfOdd = new boolean[10];
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) trueIfOdd[i] = true;
		}

		
		
	}
}