package Java.Megoldások;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        //// Set the 3 sides to 10.4, 13.5, 8.2 and your program should
        //// produce the following output:
        Scanner scanner = new Scanner(System.in);

        System.out.println("'a' oldal:");
        int a = scanner.nextInt();
        System.out.println("'b' oldal:");
        int b = scanner.nextInt();
        System.out.println("'c' oldal:");
        int c = scanner.nextInt();

        int felszin = 2*(a*b+a*c+c*b);

        System.out.println("Téglatest felszíne: "+ felszin);

    }
}
