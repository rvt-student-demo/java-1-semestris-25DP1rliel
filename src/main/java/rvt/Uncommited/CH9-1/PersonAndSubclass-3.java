package rvt;


public class PersonAndSubclass {

    // main base class
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

    // student class with credits
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

    public static void main(String[] args) {

        Student ollie = new Student(
            "Ollie",
            "6381 Hollywood Blvd. Los Angeles 90028"
        );

        System.out.println(ollie);

        ollie.study();

        System.out.println(ollie);
    }
}