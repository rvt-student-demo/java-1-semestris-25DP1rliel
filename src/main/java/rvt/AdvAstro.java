package rvt;
import java.util.Scanner;

public class AdvAstro {
    public static void main(String[] args){
        tree(InInt("Ievadi egles garumu: "));
    }
    public static void tree(int height) {
        size(height);
        for(int i = 0; i<2;i++){
            for(int j = 2; j<height; j++) {
                space();
            }
            for(int j = 0; j<3; j++) {
                star();
            }
            System.out.println();
        }
    }
    public static void size(int size) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = size - (i+1); j>0; j--) {
                space();
            }
            for (int j = 1 - (i+1); j<1; j++) {
                star();
            }
            for (int j = 2 - (i+1); j<1; j++) {
                star();
            }
            System.out.println();
        }
    }
    public static void star() {
        System.out.print("*");
    }
    public static void space() {
        System.out.print(" ");
    }
    public static int InInt(String text) {
        var scan = new Scanner(System.in);
        System.out.print(text);
        int Int = Integer.parseInt(scan.nextLine());
        scan.close();
        return Int;
    }
}
