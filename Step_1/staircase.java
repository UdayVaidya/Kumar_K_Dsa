import java.util.*;


public class staircase {
    public static void main(String args[]) {
      
      
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= (n-i); j++){
                    System.out.print(" ");
                }
                
                for(int j = 1; j <= i; j++){
                    System.out.print("#");
                }
                
                System.out.println();
            } }
      
    }
}
