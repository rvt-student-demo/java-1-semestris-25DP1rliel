package rvt;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(SumOfNumbersInArray());

        }
    public static int SumOfNumbersInArray() {
        int[] num = {5,1,3,4,2};
        int snum = 0;
        for(int i = 0;i<num.length;i++) {
            snum += num[i];
        }
        return snum;
    }
}
