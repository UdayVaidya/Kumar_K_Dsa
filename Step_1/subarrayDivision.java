import java.util.*;


public class subarrayDivision {
    public static int subarrayDivisionFunc(int d, int m, ArrayList<Integer> arr){
        int n = arr.size();
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            int length_count = 0;
            for(int j=i; j<j+m; j++){
                if(j>=n || sum >= d){
                    break;
                }
                
                sum += arr.get(j);
                length_count++ ;
            }
            
            if(sum == d && length_count == m){
                count++;
            }
        }
        
        return count;
    }
    public static void main(String args[]) {
      
      
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> arr = new ArrayList<Integer>();
      int n = in.nextInt();
      
      for(int i= 0; i<n ; i++){
        int temp = in.nextInt();
        arr.add(temp);
      }
      
      int d = in.nextInt();
      int m = in.nextInt();

      in.close();
      
      int result = subarrayDivisionFunc(d,m,arr);
      
      System.out.println(result);
    }
}
