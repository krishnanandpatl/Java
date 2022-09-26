package Recursion;

public class AtoB_increasing {
    static void print(int a,int b){
        if(a>b){
            return;
        }
        System.out.println(a);
        print(a+1, b);
    }
   public static void main(String[] args) {
    print(2,7);
   }
}
