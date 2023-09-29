package codechef;
import java.lang.reflect.Array;
import java.util.*;

public class AndrewandMeatball {
    public static void main(String ... abc){
        Scanner scnr = new Scanner(System.in);
        int T = scnr.nextInt();
        while(T-- >0){
            int P = scnr.nextInt();
            int N = scnr.nextInt();
            int [] arr = new int [P];
            for(int i=0;i<arr.length;i++)   arr[i] = scnr.nextInt();
            Arrays.sort(arr);
            int temp = 0;
            int count = 0;
            for(int j=arr.length-1;j>=0;j--){
                temp += arr[j];
                count += 1;
                if(temp >= N){
                    System.out.println(count);
                    break;
                }
            } 
            if(temp < N)    System.out.println("-1");
        }
    }
}
