import java.util.Scanner;

public class BasicInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name:");
        String name = scanner.nextLine();
        System.out.println("Your age:");
        int age = scanner.nextInt();
        System.out.println("Your height:");
        double height = scanner.nextDouble();
        System.out.println("Your marriage:");
        boolean married = false;

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your height: " + height);
        System.out.println("Your marriage: " + married);


    }
}
