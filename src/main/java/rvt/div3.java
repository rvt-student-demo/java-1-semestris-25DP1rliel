package rvt;
import java.util.Scanner;

public class div3 {
    
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ievadiet sākuma vērtību: ");
        int start = Integer.parseInt(scan.nextLine());
        System.out.println("Ievadiet beigu vērtību: ");
        int end = Integer.parseInt(scan.nextLine());
        scan.close();
        System.out.println("Skaitļi kas dalās ar 3: ");
        Div3(start,end);
    }
        private static void Div3(int start,int end) {
            for(int i=start;i<=end;i++) {
                if(i%3==0) {
                    System.out.println(i);
                }
            }
    }
}
