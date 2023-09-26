
import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("5 numbers");
        for (int i = 0; i < 5; i++) {
            System.out.print("Szám:\n");
            int szam = scanner.nextInt();
            sum = sum + szam;
            count++;
        }

        System.out.println("Sum of numbers:" + sum);
        System.out.println("Average" + sum/count);

    }
}
