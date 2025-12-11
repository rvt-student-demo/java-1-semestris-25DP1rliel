package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        // read until empty line
        while (true) {
            if (line.isEmpty()) {
                break;
            } else {
                nums.add(Integer.valueOf(line));
            }
            line = sc.nextLine();
        }

        // range selection
        System.out.print("First: ");
        int start = Integer.valueOf(sc.nextLine());

        System.out.print("Last: ");
        int end = Integer.valueOf(sc.nextLine());

        // print nums in selected range
        for (int i = start; i <= end; i++) {
            System.out.println(nums.get(i));
        }

        sc.close();
    }
}