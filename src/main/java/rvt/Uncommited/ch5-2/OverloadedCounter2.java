package rvt;

public class Counter {

    private int val;

    public Counter(int startVal) {
        this.val = startVal;
    }

    public Counter() {
        this.val = 0;
    }

    public int getVal() {
        return this.val;
    }

    // adds given value (if positive)
    public void bumpUp(int amount) {
        if (amount > 0) {
            this.val += amount;
        }
    }

    // subtracts if amount is positive
    public void bumpDown(int amount) {
        if (amount > 0) {
            this.val -= amount;
        }
    }
}

// test
public class Main {

    public static void main(String[] args) {

        Counter c1 = new Counter(5);
        Counter c2 = new Counter();

        System.out.println("Counter 1 starts at: " + c1.getVal());
        System.out.println("Counter 2 starts at: " + c2.getVal());

        c1.bumpUp(10);
        c1.bumpDown(3);
        c2.bumpUp(4);
        c2.bumpDown(2);

        System.out.println("Counter 1 now: " + c1.getVal());
        System.out.println("Counter 2 now: " + c2.getVal());
    }
}

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public double bodyMassIndex() {
        double hMeters = this.height / 100.0;
        return this.weight / (hMeters * hMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int w) {
        this.weight = w;
    }

    public String getName() {
        return this.name;
    }
}