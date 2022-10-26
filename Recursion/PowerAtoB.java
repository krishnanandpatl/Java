package Recursion;

public class PowerAtoB {
    public static int power(int a,int b) {
        if(b==0){
            return 1;
        }
        int half=power(a, b/2);
        half*=half;
        return b%2==0?half : half*a;
    }
    public static void main(String[] args) {
        int a=10,b=-2;
        System.out.println(power(a,b));
    }
}
