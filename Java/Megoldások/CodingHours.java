package Java.Megoldások;

import java.util.Scanner;

public class CodingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int napiora = 6;    // Average coding hours per day
        int szemeszter = 17;      // Semester duration in weeks
        int hetinap = 5;     // Number of workdays in a week
        int hetioraszam = 52;    // Average weekly work hours

        // Calculate total coding hours in a semester
        int osszkodoltora = napiora * hetinap * szemeszter;

        // Calculate total work hours in a semester
        int osszmunkaora = hetioraszam * szemeszter;

        // Calculate the percentage of coding hours
        double szazalek = (double) osszkodoltora / osszmunkaora * 100;

        System.out.println("Total coding hours in a semester: " + osszkodoltora + " hours");
        System.out.println("Percentage of coding hours in the semester: " + szazalek + "%");

    }
}
