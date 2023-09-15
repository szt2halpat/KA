package Java.Megoldások;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        //80 kg súlyú 1,65 m magasságú személy esetén:
        //80/(1,65x1,65)=29,38 kg/m2

        double bmi = massInKg/(heightInM*heightInM);

        System.out.println("BMI érték:" + bmi);

    }
}
