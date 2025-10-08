package rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class numbers {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int i = Integer.parseInt(scan.nextLine());
        List<Integer> inputs = new ArrayList<Integer>();
        inputs.add(i);
        int sum = i;
        while(i!=0) {
            System.out.println("Give a number:");
            i = Integer.parseInt(scan.nextLine());
            inputs.add(i);
            sum += i;
        }
        scan.close();
        System.out.println("Number of numbers: " + (inputs.size()-1));
        System.out.println("Sum of numbers: " + sum);
    }
}