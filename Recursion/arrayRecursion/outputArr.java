package Recursion.arrayRecursion;

public class outputArr {
    public static void output(int[] arr,int i) {
        if(i>=arr.length){
            return;
        }
        System.out.println(arr[i]);
        output(arr,i+1);
        
    }
    public static void main(String[] args) {
        int[] arr={1,3,6,9,11,655,890,00,567,-23,-33};
        int i=0;
        output(arr,i);
    }
}
