package rvt;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int[] num = {1,3,5,7,9};
        for(int i = 0;i<num.length;i++) {
            System.out.println(num[i]);
        }
        System.out.println();
        var scan = new Scanner(System.in);
        System.out.println("Input Index 1:");
        int i1 = Integer.parseInt(scan.nextLine());
        System.out.println("Input Index 2:");
        int i2 = Integer.parseInt(scan.nextLine());
        System.out.println();
        scan.close();
        num = Swap(num,i1,i2);
        for(int i = 0;i<num.length;i++) {
            System.out.println(num[i]);
        }
    }
    public static int[] Swap(int[] num, int i1,int i2) {
        int temp = num[i1];
        num[i1] = num[i2];
        num[i2] = temp;
        return num;
    }
}
