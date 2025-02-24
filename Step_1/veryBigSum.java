import java.util.*;


public class veryBigSum {
    public static void main(String args[]) {
      
      
      try (Scanner in = new Scanner(System.in)) {
        int n = in.nextInt();
        
        long sum = 0;
        for(int i = 0; i < n; i++){
          long value = in.nextLong();
          sum += value;
        } 
        
        System.out.println(sum);
      }
    }
}
