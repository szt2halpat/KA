package Java.Megoldások;

public class Quadratic {

    public static void Masodfoku(double a, double b, double c)
    {
        if (a == 0) {
            System.out.println("Az 'a' értéke nem lehet nulla. Ez nem egy másodfokú egyenlet.");
            return;
        }

        double diszkriminans = b * b - 4 * a * c;

        if (diszkriminans > 0) {
            // Két valós gyök
            double gyok1 = (-b + Math.sqrt(diszkriminans)) / (2 * a);
            double gyok2 = (-b - Math.sqrt(diszkriminans)) / (2 * a);
            System.out.println("Két valós gyök:");
            System.out.println("Gyök 1: " + gyok1);
            System.out.println("Gyök 2: " + gyok2);
        } else if (diszkriminans == 0) {
            // Egy valós gyök
            double gyok = -b / (2 * a);
            System.out.println("Egy valós gyök:");
            System.out.println("Gyök: " + gyok);
        } else {
            // Nincs valós gyök
            System.out.println("Nincs valós gyök.");
        }
    }
    public static void main(String[] args) {
        double a = 2.0;
        double b = -7.0;
        double c = 3.0;

        Masodfoku(a, b, c);
    }
}
