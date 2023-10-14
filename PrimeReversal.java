import java.util.Scanner;

public class PrimeReversal {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String A = scnr.nextLine();
        String B = scnr.nextLine();
        int Aone = 0;
        int Azero = 0;
        int Bone = 0;
        int Bzero = 0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == '1')
                Aone++;
            else
                Azero++;

            if(B.charAt(i) == '1')
                Bone++;
            else
                Bzero++;
        }
        if(Aone == Bone && Azero == Bzero)
            System.out.println("YES");
            else
            System.out.println("NO");
    }
}
