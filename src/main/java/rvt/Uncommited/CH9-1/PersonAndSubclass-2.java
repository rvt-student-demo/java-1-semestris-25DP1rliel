package rvt; 


public class PersonAndSubclass {

    // base class for people
    static class Person {

        private final String label;
        private final String location;

        public person(String label, String location) {
            this.label = label;
            this.location = location;
        }

        @Override
        public String toString() {
            return label + "\n  " + location;
        }
    }

    // student that extends person
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
    }

    public static void main(String[] args) {

        // basic test
        Student ollie = new Student(
            "Ollie",
            "6381 Hollywood Blvd. Los Angeles 90028"
        );

        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());

        ollie.study();

        System.out.println("Study credits " + ollie.credits());
    }
}