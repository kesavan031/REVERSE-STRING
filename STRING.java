package javaapplication1;

import java.util.Scanner;

public class REVERSE_STRING {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String a = s.nextLine();
        String b = " ";
        int l = a.length();

        for (int i = l - 1; i >= 0; i--) {
            b = b + a.charAt(i);

        }
        System.out.println("REVERSED STRING IS " + b);


    }
}
