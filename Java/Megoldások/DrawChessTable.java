package Java.Megoldások;

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

        System.out.println("Please enter a chess table size: ");
        int szam = scanner.nextInt();

        for (int i = 0; i < szam; i++) {
            if(i % 2 == 0)
            {
                System.out.println("% % % %");    
            }
            else
            {
                System.out.println(" % % % %");   
            }
            
        }
    
    }
    
}
