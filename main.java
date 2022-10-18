import java.util.Scanner;

class main {
  public static void main(String[] args) {
    // get user input
    Scanner in = new Scanner(System.in);

    while (true) {
      // prompt user for input
      System.out.println(
          "type 't' to see if the collatz conjecture is ever false for as long as you are willing to wait. \nOr type 'c' to check if a specific number supports the collatz conjecture.\n");
      String choice;
      choice = in.nextLine();
      if ("t".equals(choice)) { // test numbers starting at 1 and going to infinity
        int testingNumber = 1;
        while (true) {
          System.out.println(collatzConjecture(testingNumber));
          testingNumber += 1;
        }
      }
      if ("c".equals(choice)) { // test a specific number
        // prompt user
        System.out.println("Type an integer greater than or equal to 1.");
        // get user input
        String testingNumber = in.nextLine();
        System.out.println(collatzConjecture(Integer.parseInt(testingNumber)));
      }
    }
  }

  static int odd(int initNumber) {
    // 3n + 1
    int newNumber = 3 * initNumber + 1;
    return newNumber;
  }

  static int even(int initNumber) {
    // n / 2
    int newNumber = initNumber / 2;
    return newNumber;
  }

  static String collatzConjecture(int n) {
    int currentNumber = n; // holds the value of n after all transformations
    int steps = 0;
    while (currentNumber != 1) {
      if (currentNumber % 2 == 0) { // even
        currentNumber = even(currentNumber);
      } else { // odd
        currentNumber = odd(currentNumber);
      }
      steps += 1;
    }
    String result = "The integer: " + Integer.toString(n) + " results in 1 in " + Integer.toString(steps) + " steps.";
    return result;
  }
}
