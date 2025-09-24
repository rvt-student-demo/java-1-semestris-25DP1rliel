package rvt;
import java.util.Scanner;
public class screws {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadiet skrūvju skaitu:");
        int screw = Integer.parseInt(scan.nextLine());
        System.out.println("Ievadiet uzgriežņu skaitu:");
        int nut = Integer.parseInt(scan.nextLine());
        System.out.println("Ievadiet paplākšņu skaitu:");
        int  plate = Integer.parseInt(scan.nextLine());
        scan.close();
        System.out.println("");
        System.out.println("Skrūvju skaits: " + screw);
        System.out.println("Uzgriežņu skaits: " + nut);
        System.out.println("Paplāksņu skaits: " + plate);       
        System.out.println("");
        if(plate>=screw) {
            if(plate >= 2*screw) {
                System.out.println("Pasūtijums Kārtībā");
            }
            else {
                System.out.println("Pārbaudi pasūtijumu: Par maz uzgriežņi");
            }
        }
        else {
            System.out.println("Pārbaudi pasūtjum: Par maz paplāksnes");
        }
        System.out.println("");
        System.out.println("Kopējā cena: " + (screw*5 + nut*3 + plate));
    }
}
