package Java.Megoldások;

// Absztrakt Instrument osztály
public abstract class Hangszerek {
    protected String name;

    public abstract void play();
}

// Absztrakt StringedInstrument osztály, ami kiterjeszti az Instrument-et
abstract class StringedInstrument extends Hangszerek {
    protected int numberOfStrings;

    public abstract void sound();
}

// ElectricGuitar osztály, ami egy StringedInstrument leszármazottja
class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        this.name = "Electric Guitar";
        this.numberOfStrings = 6;
    }

    @Override
    public void sound() {
        System.out.println("Twang");
    }

    @Override
    public void play() {
        System.out.println(name + " with " + numberOfStrings + " strings makes a " + name + " sound: ");
        sound();
    }
}

// BassGuitar osztály, ami egy StringedInstrument leszármazottja
class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        this.name = "Bass Guitar";
        this.numberOfStrings = 4;
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }

    @Override
    public void play() {
        System.out.println(name + " with " + numberOfStrings + " strings makes a " + name + " sound: ");
        sound();
    }

    public static void main(String[] args) {
        Hangszerek[] instruments = new Hangszerek[]{
                new ElectricGuitar(),
                new BassGuitar(),
                new Violin()
        };

        for (Hangszerek instrument : instruments) {
            instrument.play();
        }
    }

}

// Violin osztály, ami egy StringedInstrument leszármazottja
class Violin extends StringedInstrument {
    public Violin() {
        this.name = "Violin";
        this.numberOfStrings = 4;
    }

    @Override
    public void sound() {
        System.out.println("Screech");
    }

    @Override
    public void play() {
        System.out.println(name + " with " + numberOfStrings + " strings makes a " + name + " sound: ");
        sound();
    }
}
