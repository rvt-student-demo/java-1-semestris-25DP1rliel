package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String index = "";
        while (true) {
            index = scanner.nextLine();

            if (index == "") {
                break;
            } else {
                list.add(index);
            }
        }

        scanner.close();
        System.out.println("In total: " + list.size());
    }
}