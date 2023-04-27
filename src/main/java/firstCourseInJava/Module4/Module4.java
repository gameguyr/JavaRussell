package firstCourseInJava.Module4;

/**
 * Directions: Create a document with your answers and save it in either .pdf or .doc format and
 * upload it by clicking on the submit button on this page.
 * Title the document with your last name and the assignment, so, for example, "Smith_Module4.pdf"
 * Although it is not necessary to include the questions in your assignment, do be sure to number your answers
 * and show all work including, but not limited to: calculations, assumptions, commentary, calculation notes,
 * screenshots, reference citations, etc.
 *
 * 1. Using the Phone class as a baseline, write a method isUSA.
 * It should return true if the country code is 1 and false otherwise.
 *
 *
 *
 * 2. Also expanding the Phone class, write a method that determines the location of an area code.
 * It should return the name of the area code's city.
 * For example,
 * if cc = 1 and area code = 510 East Bay Area,
 * 650 SF Peninsula, 415 San Francisco, 408 South Bay Area.
 * For this assignment, use literal strings as return values.
 *
 *
 *
 * 3. Write a Rectangle class.
 * Its constructor should accept length and width as a parameter.
 * It should have methods that return its length, width, perimeter and area.
 * Show a demonstration where you create two separate rectangles.
 */
public class Module4 {

    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
    }


    public static void problem1() {
        System.out.println("Problem #1");
        Phone phone = new Phone();
        int countryCode = 1;
        System.out.println("USA\t\t has country code " + countryCode + " so isUSA=" + phone.isUSA(countryCode));
        countryCode = 689;
        System.out.println("French Polynesia\t\t has country code " + countryCode + " so isUSA=" + phone.isUSA(countryCode));
        System.out.println("I wish the instructor could help me to understand how to format these lines \n" +
                "so that the countries would line up nicely");
        System.out.println("");
    }

    public static void problem2() {
        System.out.println("Problem #2");
        Phone phone = new Phone();
        int countryCode = 1;
        int areaCode = 415;
        System.out.println("Country code: " + countryCode + " and Area code: " + areaCode + " is designated for city: " + phone.returnCity(countryCode, areaCode));
        countryCode = 689;
        areaCode = 408;
        System.out.println("Country code: " + countryCode + " and Area code: " + areaCode + " is designated for city: " + phone.returnCity(countryCode, areaCode));
        System.out.println("");

    }

    public static void problem3() {
        System.out.println("Problem #3");
        Rectangle rectangleSmall = new Rectangle(2.5, 11);
        Rectangle rectangleLarge = new Rectangle(35.7, 21.7777777777);

        System.out.println("The area of the rectangleSmall is " + rectangleSmall.returnArea());
        System.out.println("The area of the rectangleLarge is " + rectangleLarge.returnArea());

        System.out.println("The perimeter of the rectangleSmall is " + rectangleSmall.returnPerimeter());
        System.out.println("The perimeter of the rectangleLarge is " + rectangleLarge.returnPerimeter());
        System.out.println("");
    }


}
