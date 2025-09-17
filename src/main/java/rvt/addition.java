package rvt;
import java.util.Scanner;


public class addition {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli:");
        int i1 = Integer.parseInt(scan.nextLine());
        System.out.println("Ievadiet otro skaitli:");
        int i2 = Integer.parseInt(scan.nextLine());
        int sum = i1 + i2;
        System.out.println("Summa:");
        System.out.println(sum);
    }
}
