package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {

        ArrayList<String> stuff = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String input = "";

        // read lines until blank input
        while (true) {
            input = sc.nextLine();

            // empty input = stop
            if (input.isEmpty()) {
                break;
            }
            else {
                stuff.add(input);
            }
        }

        sc.close();

        // print total size of list
        System.out.println("In total: " + stuff.size());
    }
}