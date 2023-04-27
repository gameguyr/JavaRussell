package firstCourseInJava.Module5;

import java.util.Arrays;

/**
 * Directions: Create a document with your answers and save it in either .pdf or .doc format and upload it by clicking on the submit button on this page. Title the document with your last name and the assignment, so, for example, "Smith_Module5.pdf"
 *
 * 1. Initialize a two dimensional array with any type and values of your choosing.
 *
 * 2. Write a method that returns the average of an int array. The array has one dimension and can be of any size.
 *
 * 3. Write a method to print all of the strings that contain the substring "ware" in the following array:
 *
 * term[] = { "software", "hardware", "firmware", "summer wear", "warehouse", "whereabouts", "dinnerware", "wearable", "somewhere" };
 */
public class Assignment5 {

    public static void main(String[] args) {
        System.out.println("Problem 1");
        init2DArray();

        System.out.println("Problem 2");
        int[] intArray = {23, 45, 2, 0, 65536, 90};
        System.out.println("The average is: " + findAvg(intArray));
        System.out.println("\n");

        System.out.println("Problem 3");
        printWare();
    }


    public static void init2DArray() {
        String[][] string2DArray = new String[][]{
                {"blue", "cow"},
                {"green", "leopard"},
                {"violet", "lizard"},
                {"green", "donkey"}
        };
        for (String[] stringArray : string2DArray) {
            System.out.println(Arrays.toString(stringArray));
        }
        System.out.println("\n");
    }

    public static double findAvg(int[] intArray) {
        double sum = 0;
        for (int integer: intArray){
            sum  = sum + integer;
        }
        double numberOfElements = intArray.length;
        return sum / numberOfElements;
    }

    public static void printWare() {
        String[] term = {
                "software",
                "hardware",
                "firmware",
                "summer wear",
                "warehouse",
                "whereabouts",
                "dinnerware",
                "wearable",
                "somewhere"};

        for (String string: term){
            if (string.contains("ware")) {
                System.out.println(string);
            }
        }


    }


}
