package rvt;
import java.util.Random;
import java.util.Scanner;
public class guessing {
    public static void main(String[] args) {
        Random random = new Random();
        var scan = new Scanner(System.in);
        int num = random.nextInt(6);
        int lives = 3;
        System.out.println("Es domaju par skaitli no 1 līdz 10.\nTev tas jāuzmin trīs mēģinājumos\nIevadi minējumu:");
        while (true) {
            int inp = Integer.parseInt(scan.nextLine());
            if(inp == num) {
                System.out.println("Pareizi! Esi uzminējis!");
                break;
            }
            else {
                System.out.println("Nepareizi!");
                lives -= 1;
            }
            if(lives <1) {
                System.out.println("Tu esi zaudējis spēli!"); 
                break;
            }
        }
        scan.close();
    }
}
