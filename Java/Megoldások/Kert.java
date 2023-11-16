class Noveny
{
    public double vizmennyiseg;

    public Noveny(double vizmennyiseg)
    {
        this.vizmennyiseg = vizmennyiseg;
    }

    public boolean VizSzukseglet()
    {
        return false;
    }

    public void ontoz(int mennyiseg)
    {

    }

}

class Virag extends Noveny
{
    public Virag(double vizmennyiseg)
    {
        super(vizmennyiseg);
    }

    public boolean VizSzukseglet()
    {
        if(vizmennyiseg < 5)
        {
            return true;
        }
        return false;
    }

    public void ontoz(int mennyiseg)
    {
        double novekves = mennyiseg * 0.75;
        vizmennyiseg += novekves;
    }

}
class Fa extends Noveny
{
    public Fa(double vizmennyiseg)
    {
        super(vizmennyiseg);
    }

    public boolean VizSzukseglet()
    {
        if(vizmennyiseg < 10)
        {
            return true;
        }
        return false;
    }

    public void ontoz(double mennyiseg)
    {
        double novekedes = mennyiseg * 0.40;
        vizmennyiseg = vizmennyiseg + novekedes;
    }

}

public class Kert {

    Fa fak = new Fa(4);
    Virag viragok = new Virag(4);



    public void KertAllapot()
    {
        if(fak.vizmennyiseg < 5)
        {
            System.out.println("A fának vízre van szüksége.");
        }
        else
        {
            System.out.println("A fának nincs szüksége vízre.");
        }

        if(viragok.vizmennyiseg < 5)
        {
            System.out.println("A virágoknak vízre van szüksége.");
        }
        else
        {
            System.out.println("A virágoknak nincs szüksége vízre.");
        }
    }

    public void ontoz(int mennyiseg){
        fak.vizmennyiseg += mennyiseg;
        viragok.vizmennyiseg += mennyiseg;

    }

    public static void main(String[] args) {

        Fa fak = new Fa(6);
        Noveny novenyek = new Noveny(10);

        Kert kert = new Kert();

        System.out.println("Vízmennyiség: " + fak.vizmennyiseg);
        fak.ontoz(10);
        System.out.println("Vízmennyiség: " + fak.vizmennyiseg);
    }
}
