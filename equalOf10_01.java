import java.util.*;
class equalOf10_01 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int test = scnr.nextInt();
        while(test-- >0){
            int N = scnr.nextInt();
            for(int i=1;i<=N;i++)   System.out.print((i==1 || i==N) ? ("1") : ("0"));
            System.out.println();
        }
    }
}