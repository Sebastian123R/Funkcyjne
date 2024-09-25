package Euler;

public class Euler_06 {
    public static void main(String[] args) {
        int num=0;
        int num2=0;
        for(int i=1;i<=100;i++){
            num=num+i*i;
            num2 = num2+i;
        }
        int resut= num2*num2-num;
        System.out.println(resut);
    }
}