import java.util.*;


public class birthdayCakeCandles {
    public static int birthdayCakeCandles1(int mx, ArrayList<Integer> candles){
        int count = 0; 
        for(int i = 0; i < candles.size(); i++){
            if (candles.get(i) == mx){
                count += 1;
            }
        }
        
        return count;
    }

    public static void main(String args[]) {
      
      
        ArrayList<Integer> candles;
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            candles = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int num = in.nextInt();
                candles.add(num);
            } }
      
      int mx = Collections.max(candles);
      
      int result =  birthdayCakeCandles1(mx,candles);
      
      System.out.println(result);
    }
}
