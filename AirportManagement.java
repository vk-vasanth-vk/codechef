import java.util.*;
class AirportManagement {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int N = scnr.nextInt();
        int [] arr = new int [N*2];
        for(int i=0;i<(N*2)-1;i++)    arr[i] = scnr.nextInt();
        Arrays.sort(arr);
        int count = 0;
        int max_Count = 0;
        for(int i=0;i<(N*2)-1;i++){
            if(arr[i] == arr[i+1])
                count++;
            else {
                max_Count = Math.max(max_Count,count);
                count = 0;
            }
        }
        max_Count = Math.max(max_Count,count);
        System.out.println(max_Count+1);
    }
}