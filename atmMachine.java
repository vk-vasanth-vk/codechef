import java.util.Scanner;

public class atmMachine {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int test = scnr.nextInt();
        scnr.nextLine();
        while(test-- >0){
            int people = scnr.nextInt();
            //scnr.nextLine();
            int money = scnr.nextInt();
            int [] array = new int [people];
            for(int i=0;i<people;i++)   array[i] = scnr.nextInt();
            for(int i=0;i<people;i++){
                if(array[i]>money){
                    System.out.print("0");
                }
                else if(array[i]<=money){
                    money -= array[i];
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
