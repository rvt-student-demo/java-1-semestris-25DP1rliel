package rvt.ch19;

import java.util.Scanner;

public class ex4 {
        public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadiet Zemāko:");
        int low = Integer.parseInt(scan.nextLine());
        System.out.println("Ievadiet Augstāko:");
        int high = Integer.parseInt(scan.nextLine());
        scan.close();
        int i = low;
        int sum = 0;
        while(i<high+1) {
            sum += i;
            i += 1;
        }
        System.out.println("Summa: "+sum);
        System.out.println("Formulas summa: "+((high*(high+1))/2-(low*(low-1))/2));
    }
}
