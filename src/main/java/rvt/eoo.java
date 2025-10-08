package rvt;

import java.util.Scanner;

public class eoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = Integer.parseInt(scan.nextLine());
        scan.close();
        if(n%2==0) {
            System.out.println("The number " + n + " is even");
        }
        else {
            System.out.println("The number " + n + " is odd");
        }
    }
}
