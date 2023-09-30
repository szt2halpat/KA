package Java.Megoldások;

import java.util.Scanner;

public class SumDigits {

    public static int sumOfDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }
        else
        {
            //Utolsó számjegy kiválasztása
            int utolso = n % 10;

            //A számot osztjuk tízzel, így az utolsó számjegy előtti rész megmarad
            int maradek = n / 10;

            return utolso + maradek;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy nem negatív egész számot: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("A megadott szám negatív, kérjük adjon meg egy nem negatív egész számot.");
        } else {
            int osszeg = sumOfDigits(n);
            System.out.println("A számjegyek összege: " + osszeg);
        }

        scanner.close();

    }
}
