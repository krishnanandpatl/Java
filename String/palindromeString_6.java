package String;

public class palindromeString_6 {
    public static void main(String[] args) {
        String s="ajay";
        int i=0,j=s.length()-1;
        while(i<=j){
            char a=s.charAt(i);
            char b=s.charAt(j);
            if(a!=b){
                System.out.println("False");
                break;
            }
            i++;
            j--;
        }
        //correct the print statement later
        System.out.println("True");
    }
}
