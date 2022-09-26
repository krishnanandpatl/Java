package Recursion;
public class AtoB_EvenOdd{
    public static void evenOdd(int a,int b) {
        if(a>b){
            return;
        }
        if(a%2==0){
            System.out.println(a);
        }
        evenOdd(a+1, b);
        if(a%2!=0){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        evenOdd(1,10);
    }
}