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

    public static void main(String[] args) {

        // init people
        Person ada = new person(
            "Ada Lovelace",
            "24 Maddox St. London W1S 2QN"
        );

        Person esko = new person(
            "Esko Ukkonen",
            "Mannerheimintie 15 00100 Helsinki"
        );

        System.out.println(ada);
        System.out.println();
        System.out.println(esko);
    }
}
