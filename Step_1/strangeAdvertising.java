import java.util.*;


public class strangeAdvertising{
    
    public static int strangeAdvertisingFunc(int n){
        int people = 5;
        int total_likes = 0;
        
        for(int i=1; i <= n; i++){
            int share = people/2 ;
            total_likes += share;
            people = share*3;
        }
        
        return total_likes;
    }
    public static void main(String args[]) {
      
      try (Scanner in = new Scanner(System.in)) {
        int n = in.nextInt();
        System.out.println(strangeAdvertisingFunc(n));
    }
    }
}
