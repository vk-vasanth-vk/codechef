import java.util.*;
class easyPronounciation{
    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    s.nextLine();
	    while(T-- >0){
	        int strLength = s.nextInt();
	        s.nextLine();
	        String str = s.nextLine();
	        int consecutiveConsonants = 0;
	        for(char ch : str.toCharArray()){
	            if("aeiou".indexOf(ch) >= 0){
	                consecutiveConsonants = 0;
	            }
	            else {
	                consecutiveConsonants++;
	                if(consecutiveConsonants >= 4){
	                    System.out.println("No");
	                    break;
	                }
	            }
	        }
	        if(consecutiveConsonants<4)
	        System.out.println("YES");
	    }
	    s.close();

    }
}