package String;

import java.util.Scanner;

public class intro{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // This gets input till the blank space
        String s1=scn.next();
        // This gets input till next line
        String s2=scn.nextLine();
        System.out.println(s1);
        //For getting a character at a definite position
        char b=s2.charAt(1);
        System.out.println(b);
        //s2.charAt(0)='z'; won't work
        // This will close the scanner and save resource
        scn.close();
    }
}