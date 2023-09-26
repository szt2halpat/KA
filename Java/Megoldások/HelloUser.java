import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please enter your name: John Doe
        // Hello, John Doe!
        //

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your name down: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
