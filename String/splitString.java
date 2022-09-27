package String;

public class splitString {
    public static void main(String[] args) {
        String s="Hello, this a sample for splitting";
        String[] parts=s.split(" ");
        for(int i=0;i<parts.length;i++){
            System.out.println(parts[i]);
        }
    }
}
