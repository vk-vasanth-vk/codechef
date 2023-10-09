import java.util.Scanner;

public class BearandCandies {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int T = scnr.nextInt();
        while(T-- >0){
            int A = scnr.nextInt();
            int B = scnr.nextInt();
            int Limak = 0;
            int Bob = 0;
            for(int i=1;i<=(A+B);i++){
                if(i%2 != 0){
                    if(i+Limak > A){
                        System.out.println("Bob");
                        break;
                    } 

                    else    Limak += i;
                }
                if(i%2 == 0){
                    if(i+Bob > B){
                        System.out.println("Limak");
                        break;
                    }   

                    else    Bob+= i;
                }
            }
        }
    }
}
