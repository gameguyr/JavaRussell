package firstCourseInJava;

public class Module2 {
  public static void main(String[] args) {
//    boolean b = 1;
    System.out.println("This will fail because a boolean needs to be true or false");

    char c1 = 130;
//    char c2 = "a";
    System.out.println("This will fail because a char needs to be enclosed in single quotes");

//    int i1 = 4e2;
    System.out.println("This will fail because the automatic type of an exponent is double");

//    int i2 = 0xG;
    System.out.println("Looks like the hexadecimal value is not defined correctly.  I believe only A-F are valid");

    short s = 0b00011101;
    System.out.println("this is a binary value and looks to be defined correctly");

    double d = 0xCAFE;
//    double = 3.14F;
    System.out.println("this is missing the variable itself");

//    long L1 = 12.0L;
    System.out.println("12L would work but .0 at the end automatically converts to type float");
//    long L2 = 12F;
    System.out.println("This fails because can't convert float to long.  The F is explicitly making the expression value of type float");
    long L3 = 40;

    float f1 = (float)3.14;
    float f2 = (float)7e24;
//    float f3 = 7e24;
    System.out.println("This fails because the value of 7e24 is byond the range that a float can hold.");

    int i3 = (int)(1.0 * 6L) / 3;
//    int i4 = 1.0 * 6L / 3F;
    System.out.println("This fails because cannot cast a float to an int.  I thought you would just loose information so this won");


    boolean myExponent = 21000 <= 2.1e4;
    // assume that
    int year = 2001;
    boolean myYear = (year % 4) == 0;
    boolean myInt = (int)35.8 > 35;



    boolean is_empty = true;
    boolean myEmpty = is_empty && !is_empty;

    boolean isElectric = false;
    boolean myElectric = !isElectric || isElectric;


  }
}
