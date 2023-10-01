package codechef;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int T = scnr.nextInt();
        scnr.nextLine();
        while(T-- >0){
            String str1 = scnr.nextLine();
            String str2 = scnr.nextLine();
            for(int i=0;i<str1.length();i++)  System.out.println((str1.charAt(i) == str2.charAt(i)) ? "G" : "B");
        }
    }
}
