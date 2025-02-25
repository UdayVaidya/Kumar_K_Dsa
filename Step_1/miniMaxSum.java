import java.util.*;

public class miniMaxSum{
    public static void miniMaxSumFunc(ArrayList<Integer> arr){
        long sum = 0;  // Use 'long' to avoid integer overflow for large numbers
        int minVal = arr.get(0);
        int maxVal = arr.get(0);
            
        for(int num : arr){
            sum += num;
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }
            
        long mn = sum - maxVal;  // Excluding the largest number
        long mx = sum - minVal;  // Excluding the smallest number
            
        System.out.println(mn + " " + mx);
    }
    public static void main(String args[]) {
      
        Scanner in = new Scanner(System.in);
        int n = 5;
            
        ArrayList<Integer> arr = new ArrayList<>();
            
        for(int i = 0; i < n; i++){
            int value = in.nextInt();
            arr.add(value);
        }
            
        in.close();
            
        miniMaxSumFunc(arr);
    }
}
