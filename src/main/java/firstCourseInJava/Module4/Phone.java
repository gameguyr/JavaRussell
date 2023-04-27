package firstCourseInJava.Module4;

public class Phone {

    public boolean isUSA(int countryCode) {
        if (countryCode == 1) {
            return true;
        } else {
            return false;
        }
    }

    public String returnCity(int countryCode, int areaCode) {
        if (isUSA(countryCode)) {
            switch (areaCode) {
                case 510:
                    return "East Bay Area";
                case 650:
                    return "SF Peninsula";
                case 408:
                    return "408 South Bay Area";
                default:
                    return "Unknown City";

            }
        } else {
            System.out.println("Only USA country code: 1 is supported for cities.");
            return "Unknown City";
        }
    }
}


//510 East Bay Area,
// * 650 SF Peninsula, 415 San Francisco, 408 South Bay Area
