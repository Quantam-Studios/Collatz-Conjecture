class main {
	public static void main(String[] args) {
		int testingNumber = 1;
		while (true) {
			
			int currentNumber = testingNumber;
			int steps = 0;
			while (currentNumber != 1) {
				if (currentNumber % 2 == 0) {
					currentNumber = even(currentNumber);
				}else {
					currentNumber = odd(currentNumber);
				}
				steps += 1;
				System.out.println("#: " + Integer.toString(currentNumber));
			}
			System.out.println("Number: " + Integer.toString(testingNumber) + " obeyed the Collatz Conjecture in " + Integer.toString(steps) + " steps.");
			testingNumber += 1;
		}
	}
	
	static int odd(int initNumber) {
		int newNumber = 3 * initNumber + 1;
		return newNumber;
	}
	
	static int even(int initNumber) {
		int newNumber = initNumber / 2;
		return newNumber;
	}
}
