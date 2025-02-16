import java.util.ArrayList;
import java.util.Scanner;

public class divisiblePairSum {
    public static int arrSum(int n, int k, ArrayList<Integer> arr){
        int count = 0; 
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int sum = arr.get(i) + arr.get(j);
                if(sum % k == 0){
                    count += 1;
                }
            }
        }
            
        return count;
    }
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt(); 
      
      ArrayList<Integer> arr = new ArrayList<>();
      
      for(int i = 0; i < n; i++ ){
        int num = sc.nextInt();
        arr.add(num);
      }
      
      int result = arrSum(n,k,arr);
      
      System.out.println(result);
    }
}
