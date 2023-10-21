package Java.Megoldások;

import java.util.Random;

// Reservation osztály
class Foglalas {
    private String code;
    private DayOfWeek dayOfWeek;

    // Konstruktor a foglalási kód és hét napjának generálásához
    public Foglalas() {
        // Foglalási kód generálása
        this.code = generateBookingCode();
        // Véletlenszerű nap kiválasztása
        this.dayOfWeek = DayOfWeek.getRandomDayOfWeek();
    }

    // Metódus a foglalási kód generálásához
    private String generateBookingCode() {
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder bookingCode = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            bookingCode.append(characters.charAt(index));
        }

        return bookingCode.toString();
    }

    @Override
    public String toString() {
        return "Booking# " + code + " for " + dayOfWeek;
    }


    public static void main(String[] args) {
        // Tesztelés
        for (int i = 1; i <= 5; i++) {
            Foglalas reservation = new Foglalas();
            System.out.println(reservation);
        }
    }

}

// Enum az hét napjainak tárolásához
enum DayOfWeek {
    MON, TUE, WED, THU, FRI, SAT, SUN;

    // Metódus véletlenszerű nap kiválasztásához
    public static DayOfWeek getRandomDayOfWeek() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}