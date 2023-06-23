package firstCourseInJava.finalExam;

import java.io.BufferedInputStream;
import java.io.FileReader;
import java.util.Date;

public class finalExam {
    public static void main(String[] args) {
////        Date d = new Date();
////        Exception
//
////        FileReader fr = new FileReader("readme.txt");
////        BufferedInputStream bis = new BufferedInputStream(fr);
//        int i = 1;
//        double d = 2;
//        float f = 3.0f;
//        short s = 4;
//        long L = 5;
//
//        f = i;
//        System.out.println("f = " + f);
//
//        f = d;
//
//        d = f;
//
//        i = f;
//
//        f = i;
//
//        d = L;
//
//        L = s;
//
//        s = i;
//
//        s = d;
//
//        i = L;

//        finalExam.printOdd();
//        int start = 5;
//        int end = 7;
//        System.out.println("sumRange(" + start + ", " + end + ") = " + finalExam.sumRange(start, end));

        String[] testStrings = {"stone", "Bronze", "IRON", "Industrial", "INFOrmation"};
        String[] newTestStrings = newLowerStringArray(testStrings);
        System.out.printf("newLowerStringArray: %s%n", newTestStrings);

    }

    static void printOdd() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("i is odd: " + i);
            }
        }
    }

    static int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static String[] newLowerStringArray(String[] strings) {
        String[] newStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            newStrings[i] = strings[i].toLowerCase();
        }
        return newStrings;
    }

    void takeVacation(int numberOfDays) {
        String defaultLocation = "Lake Tahoe";
        System.out.println("You should take a vacation to " + defaultLocation + "for " + numberOfDays + " days");
    }

    void takeVacation(int numberOfDays, String location) {
        System.out.println("You should take a vacation to " + location + "for " + numberOfDays + " days");
    }




}
