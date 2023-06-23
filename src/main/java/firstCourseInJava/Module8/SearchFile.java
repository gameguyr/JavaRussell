package firstCourseInJava.Module8;

import java.io.*;
import java.util.ArrayList;

/**
 * Directions: Create a document with your answers and upload it by clicking "Submit."
 *
 *  Write a program that will search a given file for a string. It should:
 *
 * Take a string and a file as a command-line argument
 * Handle various exceptions such as file not found
 * Print the number of occurrences of the given string after reading the file.
 * *Note: The search string does not have to handle spaces or special characters (such as quotes).
 */
public class SearchFile {
    String filePath = "";
    String stringPattern = "";
    ArrayList<String> matchedStrings = new ArrayList<>();

    SearchFile(String filePath, String stringPattern) {
        setFilePath(filePath);
        setStringPattern(stringPattern);
    }

    boolean readFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getFilePath()))) {
            String tempLine;
            String tempString;
            do {
                tempLine = bufferedReader.readLine();
                if (tempLine != null) {
                    for (int i = 0; i < tempLine.length() - getStringPattern().length(); i++) {
                        tempString = tempLine.substring(i, i + getStringPattern().length());
                        if (tempString.equals(getStringPattern())) {
                            matchedStrings.add(tempString);
                        }
                    }
                }

            } while (tempLine != null);

            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Could not find file: " + fileNotFoundException.getMessage());
            return false;
        } catch (IOException ioException) {
            System.out.println("Something happened while reading: " + ioException.getMessage());
            return false;
        }
    }

    void printNumberOfMatches() {
        System.out.printf("Matches for %s: %d%n \n", getStringPattern(), matchedStrings.size());
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getStringPattern() {
        return stringPattern;
    }

    public void setStringPattern(String stringPattern) {
        this.stringPattern = stringPattern;
    }
}
