package codechef;
import java.util.*;

public class maxMin {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int T = scnr.nextInt();
        while(T-- >0){
            int A = scnr.nextInt();
            int B = scnr.nextInt();
            int C = scnr.nextInt();
            int max = Math.max(A, B);
            max = Math.max(max,C);
            int min = Math.min(A,B);
            min = Math.min(min,C) ;
            System.out.println(max - min);
        }
    }
}
