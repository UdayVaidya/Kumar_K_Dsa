import java.util.*;


public class hurdleRace {
    public static void main(String args[]) {
      
        try(Scanner in = new Scanner(System.in)){
            ArrayList<Integer> arr = new ArrayList<>();
            
            int n = in.nextInt();
            int k = in.nextInt(); 
            
            for(int i=0; i<n; i++){
                int temp = in.nextInt();
                arr.add(temp);
            }
            
            int mx = Collections.max(arr);
            
            if(mx>k){
                System.out.println(mx-k);
            }else{
                System.out.println(0);
            }
        }
    }
}
