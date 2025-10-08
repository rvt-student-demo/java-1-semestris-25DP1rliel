package rvt;

import java.util.Scanner;

public class grade {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Score:");
        int rez = Integer.parseInt(scan.nextLine());
        scan.close();
        System.out.println("");
        if(rez > 100) {
            System.out.println("Increaible!");
        }
        else if(rez > 89) {
            System.out.println("5");
        }
        else if(rez > 79) {
            System.out.println("4");
        }
        else if(rez > 69) {
            System.out.println("3");
        }
        else if(rez > 59) {
            System.out.println("2");
        }
        else if(rez > 49) {
            System.out.println("1");
        }
        else if(rez > 0) {
            System.out.println("Failed");
        }
        else if(rez < 0) {
            System.out.println("Impossible!");
        }
    }
}
