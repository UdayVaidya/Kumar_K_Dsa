import java.util.*;


public class beautifulDays {
    public static int beautifulDaysFunc(int s, int e,int k){
        int count = 0;
        
        for(int i = s; i<=e; i++){
            int num = i;
            int rev = 0;
            
            while(num > 0){
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            
            int diff = Math.abs(i - rev);
            if(diff % k == 0){
                count++;
            }
        }
        
        return count;
    }
    public static void main(String args[]) {
      
      
      try (Scanner in = new Scanner(System.in)) {
            int s = in.nextInt();
            int e = in.nextInt(); 
            int k = in.nextInt();

            System.out.println(beautifulDaysFunc(s,e,k));
        }
    }
}
