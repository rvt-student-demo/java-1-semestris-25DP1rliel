package rvt.ch19;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadiet N:");
        int n = Integer.parseInt(scan.nextLine());
        scan.close();
        int i = 1;
        int sum = 0;
        while(i<n+1) {
            sum += i;
            i += 1;
        }
        System.out.println("Summa: "+sum);
        System.out.println("Formulas summa: "+(n*(n+1))/2);
    }
}
