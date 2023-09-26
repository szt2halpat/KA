import java.util.Scanner;

public class HelloOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write 3 names: ");

        for (int i = 0; i < 3; i++) {
            String name = scanner.nextLine();
            System.out.println("Hello " + name);
        }
        

    }
}
