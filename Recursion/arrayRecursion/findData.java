package Recursion.arrayRecursion;

public class findData {
    public static boolean find(int[] arr,int data,int i) {
        if(arr[i]==data){
            return true;
        }
        if(i>=arr.length){
            return false;
        }
        return find(arr, data, i+1);
    }
    public static void main(String[] args) {
            int[] arr={1,3,6,9,11,655,890,0,567,-23,-33};
            int i=0;
            int data=50;
            System.out.println(find(arr,data,i));
            
    }
}
