package rvt.ch19;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadiet 1. vārdu:");
        var word1 = scan.nextLine();
        System.out.println("Ievadiet 2. vārdu:");
        var word2 = scan.nextLine();
        scan.close();
        int dot = 30-(word1.length()+word2.length());
        System.out.print(word1);
        for(int i = 0;i<dot;i++) {
            System.out.print(".");
        }
        System.out.print(word2);
    }
}
