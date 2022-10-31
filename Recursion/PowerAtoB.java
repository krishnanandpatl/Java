package Recursion;

public class PowerAtoB {
    public static double power(double a,int b) {
        if(b==0){
            return 1;
        }
        double half=power(a, b/2);
        half*=half;
        return b%2==0?half:half*a;
    }
    public static void main(String[] args) {
        double a=2;
        int b=2;
        System.out.println(power(a, b));
    }
}
