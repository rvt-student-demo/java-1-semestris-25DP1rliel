package rvt.ch19;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadiet vārdu:");
        var word = scan.nextLine();
        scan.close();
        for(int w = 0;w<word.length();w++) {
            System.out.println(word.charAt(w));
        }
    }
}
