package rvt;
import java.util.ArrayList;

public class Statistics {

    public static void main(String[] args) {
        // init stats tracking
        Statistics stats = new Statistics();
        stats.addVal(3);
        stats.addVal(5);
        stats.addVal(1);
        stats.addVal(2);

        System.out.println("Count: " + stats.getAmt());
        System.out.println("Sum: " + stats.getTotal());
        System.out.println("Average: " + stats.getAvg());
    }

    // removes the last item from a list
    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size() - 1);
    }

    // inner class
    public static class StatChunk {
        private int howMany;
        private int total;

        public StatChunk() {
            this.howMany = 0;
        }

        // adds one number to the stats
        public void addVal(int num) {
            howMany++;
            total += num;
        }

        // returns how many numbers added
        public int getAmt() {
            return howMany;
        }

        // get total sum of all nums
        public int getTotal() {
            return total;
        }

        // get average (float)
        public double getAvg() {
            if (howMany == 0) {
                return 0;
            }
            return total * 1.0 / howMany;
        }
    }

    // instance of stat chunk
    private StatChunk tracker = new StatChunk();

    // passthrough methods
    public void addVal(int num) {
        tracker.addVal(num);
    }

    public int getAmt() {
        return tracker.getAmt();
    }

    public int getTotal() {
        return tracker.getTotal();
    }

    public double getAvg() {
        return tracker.getAvg();
    }
}