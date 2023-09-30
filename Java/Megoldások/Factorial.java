package Java.Megoldások;

public class Factorial {

    //Rekurzív
    public static int Fact(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("Az n nem lehet negatív.");
        }
        if(n == 0 ||n == 1)
        {
            return 1;
        }

        return n * Fact(n - 1);

    }


    public static void main(String[] args) {


        //Ciklussal
        int eredmeny = 1;

        for (int i = 1; i <= 5; i++) {
            eredmeny *= i;
        }

        System.out.println(eredmeny);

        //Rekurzív
        int n = 5;
        int fact = Fact(n);
        System.out.println("fact: "+ fact );

    }
}
