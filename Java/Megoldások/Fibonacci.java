package Java.Megoldások;




public class Fibonacci {

    public static int fib(int szam)
    {
        if(szam < 0)
        {
            throw new IllegalArgumentException("A szám nem lehet negatív.");
        }
        if(szam <= 1)
        {
            return szam;
        }
        else
        {
            return fib(szam-1) + fib(szam-2);
        }
    }

    public static int fibRec(int szam)
    {
        if(szam < 0)
        {
            throw new IllegalArgumentException("A szám nem lehet negatív.");
        }
        if(szam == 0)
        {
            return 0;
        }
        if(szam == 1)
        {
            return 1;
        }

        return fibRec(szam - 1) + fibRec(szam - 2);
    }

    public static void main(String[] args) {

        System.out.println("Ciklussal");
        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }

        System.out.println("Rekurzív");

        for (int i = 0; i < 10; i++) {
            System.out.println(fibRec(i));
        }
    }
}
