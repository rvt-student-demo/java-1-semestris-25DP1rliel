package rvt;
import java.util.Scanner;


public class delicacy {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadi preci: ");
        var name = scan.nextLine();
        System.out.println("Ievadi cenu: ");
        float price = Float.parseFloat(scan.nextLine());
        System.out.println("Ekspress piegāde(0==nē, 1==jā): ");
        int express = Integer.parseInt(scan.nextLine());
        scan.close();
        float delivery = 0;
        if(price<10) {
            delivery = 2;
        }
        if(express==1) {
            delivery += 3;
        }
        System.out.println("Rēķins\n\t"+name+"\t"+(price)+"\n\tPiegāde\t"+ delivery+"\n\tKopā\t"+ (price + delivery));
    }
}
