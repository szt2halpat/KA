import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = 40;

        int guess = 0;

        while(guess != number)
        {
            System.out.println("Please enter your guess: ");
            guess = scanner.nextInt();
            if(guess < number)
            {
                System.out.println("The stored number is bigger than "+guess);
            }
            else if(guess > number)
            {
                System.out.println("The store number is smaller than "+guess);
            }
            else
            {
                System.out.println("You have found the stored number: "+number);
            }
        }

    }
}
