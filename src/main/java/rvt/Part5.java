package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Part5 {
     public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        int sum = 0;
        int num = 0;
        for(int i = 0;true;i++) {
            System.out.println("Give a number:");
            i = Integer.parseInt(scan.nextLine());
            if(i==-1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += i;
            num += 1;
            if(i%2==0) {
                even+=1;
            }
            else {
                odd+=1;
            }      
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num);
        System.out.println("Average: " + (sum/num));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
