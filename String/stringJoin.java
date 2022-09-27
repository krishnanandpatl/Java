package String;

public class stringJoin {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";
        String s3=s1+" "+s2;
        System.out.println(s3);
        s1+=" ";
        s1+="K";
        s1+="N";
        s1+="P";
        s1+=10;
        System.out.println(s1);
        System.out.println("Hello"+10+20);
        System.out.println(10+20+"Hello");
    }
}
