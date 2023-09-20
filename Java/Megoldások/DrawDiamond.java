package Java.Megoldások;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the square size: ");

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if(i % 2 == 0)
            {
                System.out.println("*");
            }
        }



    }
}
