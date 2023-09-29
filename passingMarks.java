package codechef;
import java.util.*;

public class passingMarks {
    public static void main(String ... aaa ){
        Scanner scnr = new Scanner(System.in);
        int T = scnr.nextInt();
        while(T-- >0){
            int N = scnr.nextInt();
            int P = scnr.nextInt();
            int [] arr = new int [N];
            for(int i=0;i<N;i++)    arr[i] = scnr.nextInt();
            Arrays.sort(arr);
            if(N == P)
            System.out.println(arr[0]-1);
            else
            System.out.println(arr[arr.length-P]-1);
        }
    }
}
