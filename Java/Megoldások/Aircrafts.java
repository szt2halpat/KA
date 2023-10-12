package Java.Megoldások;

public class Aircrafts {
    public static class F16 {
        private static final String TYPE = "F16";
        private static final int MAX_AMMO = 8;
        private static final int BASE_DAMAGE = 30;

        private int ammo;

        public F16() {
            this.ammo = 0;
        }

        public int fight() {
            int damage = ammo * BASE_DAMAGE;
            ammo = 0;
            return damage;
        }

        public int refillAmmo(int amount) {
            int remainingAmmo = Math.min(amount, MAX_AMMO - ammo);
            ammo += remainingAmmo;
            return amount - remainingAmmo;
        }

        public String getType() {
            return TYPE;
        }

        public String getStatus() {
            return "Type " + TYPE + ", Ammo: " + ammo + ", Base Damage: " + BASE_DAMAGE + ", All Damage: " + (ammo * BASE_DAMAGE);
        }

        public boolean isPriority() {
            return TYPE.equals("F35");
        }
    }

    public static class F35 {
        private static final String TYPE = "F35";
        private static final int MAX_AMMO = 12;
        private static final int BASE_DAMAGE = 50;

        private int ammo;

        public F35() {
            this.ammo = 0;
        }

        public int fight() {
            int damage = ammo * BASE_DAMAGE;
            ammo = 0;
            return damage;
        }

        public int refillAmmo(int amount) {
            int remainingAmmo = Math.min(amount, MAX_AMMO - ammo);
            ammo += remainingAmmo;
            return amount - remainingAmmo;
        }

        public String getType() {
            return TYPE;
        }

        public String getStatus() {
            return "Type " + TYPE + ", Ammo: " + ammo + ", Base Damage: " + BASE_DAMAGE + ", All Damage: " + (ammo * BASE_DAMAGE);
        }

        public boolean isPriority() {
            return TYPE.equals("F35");
        }
    }

    public static void main(String[] args) {
        F16 f16 = new F16();
        F35 f35 = new F35();

        System.out.println(f16.getStatus());
        System.out.println(f35.getStatus());
    }

}
