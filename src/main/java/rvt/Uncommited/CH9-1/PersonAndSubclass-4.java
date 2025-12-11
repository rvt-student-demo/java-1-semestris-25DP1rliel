package rvt;    


public class PersonAndSubclass {

    // main class for humans
    static class Person {

        private final String label;
        private final String location;

        public person(String label, String location) {
            this.label = label;
            this.location = location;
        }

        public String getLabel() {
            return this.label;
        }

        public String getLocation() {
            return this.location;
        }

        @Override
        public String toString() {
            return label + "\n  " + location;
        }
    }

    // student with study credits
    static class Student extends Person {

        private int creds;

        public Student(String label, String location) {
            super(label, location);
            this.creds = 0;
        }

        public int credits() {
            return this.creds;
        }

        public void study() {
            this.creds++;
        }

        @Override
        public String toString() {
            return getLabel() + "\n  " + getLocation() + "\n  Study credits " + creds;
        }
    }

    // teacher with salary
    static class Teacher extends Person {

        private final int money;

        public Teacher(String label, String location, int money) {
            super(label, location);
            this.money = money;
        }

        @Override
        public String toString() {
            return getLabel() + "\n  " + getLocation() + "\n  salary " + money + " euro/month";
        }
    }

    public static void main(String[] args) {

        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);

        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int x = 0;
        while (x < 25) {
            ollie.study();
            x++;
        }

        System.out.println(ollie);
    }
}