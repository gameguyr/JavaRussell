package firstCourseInJava.Module8;

public class UseSearchFile {
    public static void main(String[] args) {
        if (args.length == 2) {
            SearchFile searchFile = new SearchFile(args[0], args[1]);
            if (searchFile.readFile()) {
                searchFile.printNumberOfMatches();
            }

        } else {
            System.out.println("Usage: % UseSearchFile filePath stringPattern");
            return;
        }
    }
}
