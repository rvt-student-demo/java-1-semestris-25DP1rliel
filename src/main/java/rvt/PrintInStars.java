package rvt;

public class PrintInStars {
    public static void main(String[] args) {
        StarsInArray();
        }
    public static void StarsInArray() {
        int[] num = {5,1,3,4,2};
        for(int i = 0;i<num.length;i++) {
            for(int s = 0; s<num[i]; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
