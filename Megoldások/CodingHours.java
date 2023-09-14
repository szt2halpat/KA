package Megoldások;

import java.util.Scanner;

public class CodingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dailyCodingHours = 6;    // Average coding hours per day
        int semesterWeeks = 17;      // Semester duration in weeks
        int workdaysPerWeek = 5;     // Number of workdays in a week
        int weeklyWorkHours = 52;    // Average weekly work hours

        // Calculate total coding hours in a semester
        int totalCodingHours = dailyCodingHours * workdaysPerWeek * semesterWeeks;

        // Calculate total work hours in a semester
        int totalWorkHours = weeklyWorkHours * semesterWeeks;

        // Calculate the percentage of coding hours
        double codingPercentage = (double) totalCodingHours / totalWorkHours * 100;

        System.out.println("Total coding hours in a semester: " + totalCodingHours + " hours");
        System.out.println("Percentage of coding hours in the semester: " + codingPercentage + "%");

    }
}
