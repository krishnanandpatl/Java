package Recursion;
public class AtoB_decreasing{
    public static void print(int a,int b) {
        if(a>b){
            return;
        }
        print(a+1, b);
        System.out.println(a);
    }
    public static void main(String[] args) {
        print(2,7);
    }
}