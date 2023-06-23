package firstCourseInJava.finalExam;

public class TakeMoreVacation extends TakeVacation {
    void takeVacation(int numberOfDays) {
        String defaultLocation = "Lake Tahoe";
        int multiplier = 3;
        System.out.println("You should take a vacation to " + defaultLocation + "for " + numberOfDays * multiplier + " days");
    }
}
