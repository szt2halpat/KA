package Java.Megoldások;

public class AVariableModifications {
    public static void main(String[] args) {
        int a = 3;
        // increase the value of variable "a" by 10 and print the new value
        a = a + 10;
        System.out.println(a);

        int b = 100;
        // decrease the value of b by 7 and print the new value
        b = b - 7;
        System.out.println(b);

        int c = 44;
        // double the value of c and print the new value
        c = c * 2;
        System.out.println(c);

        int d = 125;
        // divide the value of d by 5 and print the new value
        d = d / 5;
        System.out.println(d);

        double e = 8;
        // cube the value of e and print the new value
        e = Math.pow(e,3);
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // determine if f1 is greater than f2 (print as a boolean)
        boolean nagyobbe = false;
        if(f1 > f2)
        {
            nagyobbe = true;
        }
        else
        {
            nagyobbe = false;
        }
        System.out.println(nagyobbe);


        int g1 = 350;
        int g2 = 200;
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)

        boolean bool = false;
        if(g1*2 > g2)
        {
            bool = true;
        }
        else
        {
            bool = false;
        }
        System.out.println(bool);

        int h = 135798745;
        // determine if h has 11 as a divisor (print as a boolean)



        int i1 = 10;
        int i2 = 3;
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)
        boolean allitas = false;

        if(i1 > Math.pow(i2,2) && i1 < Math.pow(i2,3))
        {
            allitas = true;
            System.out.println(allitas);
        }
        else
        {
            allitas = false;
            System.out.println(allitas);
        }

        int j = 1521;
        // determine if j is divisible by 3 or 5 (print as a boolean)
        if ( j % 3 == 0) {
            System.out.println(j + " osztható 3-mal.");
        } else {
            System.out.println(j + " nem osztható 3-mal.");
        }

        // Ellenőrizzük, hogy osztható-e 5-tel
        if ( j % 5 == 0) {
            System.out.println(j + " osztható 5-tel.");
        } else {
            System.out.println(j + " nem osztható 5-tel.");
        }


    }
}
