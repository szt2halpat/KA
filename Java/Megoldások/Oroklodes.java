package Java.Megoldások;

// Az abstract Animal osztály
public abstract class Oroklodes {
    private String name;
    private int age;

    // Konstruktor
    public Oroklodes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter a név lekérdezéséhez
    public String getName() {
        return name;
    }

    // Absztrakt metódus a szaporodáshoz
    public abstract void breed();

    // Getter az életkor lekérdezéséhez
    public int getAge() {
        return age;
    }
}

// Bird osztály, ami az Animal osztály leszármazottja
class Bird extends Oroklodes {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Birds lay eggs.");
    }
}

// Mammal osztály, ami az Animal osztály leszármazottja
class Mammal extends Oroklodes {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Mammals give live birth.");
    }
}

// Reptile osztály, ami az Animal osztály leszármazottja
class Reptile extends Oroklodes {
    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Reptiles lay eggs.");
    }
}

class ZooApp {
    public static void main(String[] args) {
        // Példa az osztályok használatára
        Bird eagle = new Bird("Eagle", 5);
        Mammal lion = new Mammal("Lion", 7);
        Reptile snake = new Reptile("Snake", 3);

        System.out.println(eagle.getName() + " is " + eagle.getAge() + " years old.");
        eagle.breed();

        System.out.println(lion.getName() + " is " + lion.getAge() + " years old.");
        lion.breed();

        System.out.println(snake.getName() + " is " + snake.getAge() + " years old.");
        snake.breed();
    }
}
