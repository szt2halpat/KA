package Java;

import java.util.ArrayList;
import java.util.List;

class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }
}

class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 3;
    }

    public Sponsor() {
        super("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company +
                " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}

class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super("Jane Doe", 30, "female");
        this.previousOrganization = "The School of Life";
        this.skippedDays = 3;
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization +
                " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}

class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super("Jane Doe", 30, "female");
        this.level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
    }
}

class Cohort {
    private String name;
    private List<Student> students;
    private List<Mentor> mentors;
    private List<Sponsor> sponsors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
        this.sponsors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students, " + mentors.size() + " mentors, and " + sponsors.size() + " sponsors.");
    }
}

public class Campus {
    public static void main(String[] args) {
        Cohort awesomeCohort = new Cohort("AWESOME");

        Person person1 = new Person("Mark", 45, "male");
        person1.introduce();
        person1.getGoal();

        System.out.println("--------------");
        Person person2 = new Person("Jane Doe", 30, "female");
        person2.introduce();
        person2.getGoal();

        System.out.println("--------------");


        Student student1 = new Student("John Doe", 20, "male", "BME");
        student1.introduce();
        student1.getGoal();
        awesomeCohort.addStudent(student1);


        System.out.println("--------------");


        Student student2 = new Student();
        student2.introduce();
        student2.getGoal();
        awesomeCohort.addStudent(student2);

        System.out.println("--------------");

        Mentor mentor1 = new Mentor("Gandhi", 148, "male", "senior");
        mentor1.introduce();
        mentor1.getGoal();
        awesomeCohort.addMentor(mentor1);

        System.out.println("--------------");

        Mentor mentor2 = new Mentor("Jane Doe", 30, "female", "intermediate");
        mentor2.introduce();
        mentor2.getGoal();
        awesomeCohort.addMentor(mentor2);

        System.out.println("--------------");

        Sponsor sponsor1 = new Sponsor("Jane Doe", 30 , "female", "Google");
        sponsor1.introduce();
        sponsor1.getGoal();
        awesomeCohort.addSponsor(sponsor1);

        System.out.println("--------------");

        Sponsor sponsor2 = new Sponsor("Elon Musk", 46 , "male", "SpaceX");
        sponsor2.introduce();
        sponsor2.getGoal();
        awesomeCohort.addSponsor(sponsor2);

        awesomeCohort.info();


    }
}
