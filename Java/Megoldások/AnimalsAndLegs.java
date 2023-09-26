import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of chicken legs\n");

        int Chickens = scanner.nextInt();

        System.out.print("Number of pig legs");

        int Pigs = scanner.nextInt();

        int Sum = Chickens + Pigs;

        System.out.print("Sum of both legs: " + Sum);

    }
}
