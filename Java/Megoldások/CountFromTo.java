package Java.Megoldások;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int szam1 = scanner.nextInt();

        System.out.println("Please enter the second number:");
        int szam2 = scanner.nextInt();

        if (szam1 > szam2) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = szam1; i < szam2; i++) {
                System.out.println(i);
            }
        }
    }
}
