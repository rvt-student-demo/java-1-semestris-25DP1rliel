package rvt.ch19;
import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadiet sākuma vērtību: ");
        int start = Integer.parseInt(scan.nextLine());
        System.out.println("Ievadiet beigu vērtību: ");
        int end = Integer.parseInt(scan.nextLine());
        scan.close();
        System.out.println("Skaitļi: ");
        num(start,end);
    }
    private static void num(int start,int end) {
        int i = start;
            while (i<end+1) {
                System.out.println(i);
                i+=1;
            }
    }
}

