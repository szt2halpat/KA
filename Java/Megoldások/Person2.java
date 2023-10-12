package Java.Megoldások;

public class Person2 {
    public static class Person
    {
        public String name;
        public int age;
        public String gender;

        public Person(String name, int age, String gender)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public Person()
        {

        }

        public String getGoal()
        {
            return "My goal is: Live for the moment!";
        }

        public String introduce()
        {
            return "Hi, I'm " + name + ", a " + age + " year old " + gender;
        }
    }
    public static void main(String[] args) {

        Person person1 = new Person("Lona", 12, "female");


        System.out.println(person1.introduce());
    }
}
