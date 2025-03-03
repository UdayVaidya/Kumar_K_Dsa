import java.util.*;


public class findDigits {
    public static int findDigitsFunc(int num){
        int temp = num;
        int count = 0;
        
        while(num > 0){
            int digit = num % 10;
            if (digit != 0 && temp % digit == 0) { // Avoid division by zero
                count++;
            }
            num = num / 10;
        }
        
        return count;
    }
    public static void main(String args[]) {
      
      
      try (Scanner in = new Scanner(System.in)) {
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
          
        for(int i = 0; i < n; i++){
            int num = in.nextInt();
            arr.add(num);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(findDigitsFunc(arr.get(i)));
        }
    }
      
    }
}
