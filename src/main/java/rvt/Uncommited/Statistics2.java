package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statistics stats = new Statistics();

        int input = sc.nextInt();

        // input loop, breaks on -1
        while (input != -1) {
            stats.addVal(input);
            input = sc.nextInt();
        }

        sc.close();

        // output results
        System.out.println("Sum: " + stats.getTotal());
        System.out.println("Sum of even numbers: " + stats.getEvenTotal());
        System.out.println("Sum of odd numbers: " + stats.getOddTotal());
    }

    // inner class
    public static class StatChunk {
        private int howMany;
        private int total;
        private int oddBits;
        private int evenBits;

        public StatChunk() {
            this.howMany = 0;
        }

        // adds number and updates all the things
        public void addVal(int num) {
            howMany++;
            total += num;

            if (num % 2 == 0) {
                evenBits += num;
            } else {
                oddBits += num;
            }
        }

        public int getAmt() {
            return howMany;
        }

        public int getTotal() {
            return total;
        }

        public int getEvenTotal() {
            return evenBits;
        }

        public int getOddTotal() {
            return oddBits;
        }

        public double getAvg() {
            if (howMany == 0) return 0;
            return total * 1.0 / howMany;
        }
    }

    // instance of stat chunk
    private StatChunk cruncher = new StatChunk();

    // passthrough methods
    public void addVal(int n) {
        cruncher.addVal(n);
    }

    public int getTotal() {
        return cruncher.getTotal();
    }

    public int getEvenTotal() {
        return cruncher.getEvenTotal();
    }

    public int getOddTotal() {
        return cruncher.getOddTotal();
    }

    public double getAvg() {
        return cruncher.getAvg();
    }
}