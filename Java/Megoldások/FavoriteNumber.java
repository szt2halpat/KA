import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your favorite number: ");
        int number = scanner.nextInt();

        System.out.println("My favorite number is: " + number);

    }
}
