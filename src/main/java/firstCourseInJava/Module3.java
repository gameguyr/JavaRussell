package firstCourseInJava;

/**
 * Directions: Create a document with your answers and save it in either .pdf or .doc format and upload it by clicking on the submit button on this page. Title the document with your last name and the assignment, so, for example, "Smith_Module3.pdf"
 * <p>
 * What does the following do?
 * for (int i = 0; i < 100; i = i + 3) {
 * <p>
 * for (int j = 0; j < 100; j = j + 4) {
 * <p>
 * if (i == j) System.out.println(j);
 * <p>
 * }
 * <p>
 * }
 * <p>
 * Rewrite the following to use while loop instead of a for loop.
 * int sum = 0;
 * <p>
 * for (int n = 0; n < 100; n++) {
 * <p>
 * sum = sum + n;
 * <p>
 * }
 * <p>
 * System.out.println(sum);
 * <p>
 * Write a program that will print numbers from 0 to 200. Use any of the iteration statements.
 * <p>
 * <p>
 * Write a loop from 0 to 100. It should do the following:
 * print all numbers less than 10
 * print numbers divisible by 10
 * if the number is => 90 exit the loop
 * Extra Credit:
 * <p>
 * Take the roulette example and expand it. Using brute force large numbers, try to determine what the average number of spins it will take to land on the number 37.
 */
public class Module3 {
  public static void main(String[] args) {
    problemFour();

  }

  void problemOne() {
    for (int i = 0; i < 100; i = i + 3) {

      for (int j = 0; j < 100; j = j + 4) {

        if (i == j)
          System.out.println(j);

      }

    }
  }

  static void problemTwo() {
    int sum = 0;
    for (int n = 0; n < 100; n++) {
      sum = sum + n;
    }
    System.out.println(sum);

  }

  static void alternateProblemTwo() {
    int sum = 0;
    int n = 0;
    while (n < 100) {
      sum = sum + n;
      n++;
    }
    System.out.println(sum);
  }

  static void problemThree() {
    for (int i = 1; i < 201; i++) {
      System.out.println(i);
    }
  }

  static void problemFour() {
    for (int i = 0; i < 100; i++) {
      if (i < 10) {
        System.out.println(i);
      }
      else if (i >= 90) {
        break;
      }
      else if (i % 10 == 0) {
        System.out.println(i);

      }
    }
  }

}
