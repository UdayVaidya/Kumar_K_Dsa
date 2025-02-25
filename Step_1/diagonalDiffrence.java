import java.util.*;


public class diagonalDiffrence {
    public static int diagonalDiffrenceFunc(ArrayList<ArrayList<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(n - i - 1);
        }
        return Math.abs(sum1 - sum2);

    }

    public static int diagonalDiffrenceFunc1(ArrayList<ArrayList<Integer>> arr) {
      int left_sum = 0;
      int right_sum = 0;
      int n = arr.size();
      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          if(i == j){
            left_sum += arr.get(i).get(j);
          }
        }
      }

      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          if(i+j == n-1){
            right_sum += arr.get(i).get(j);
          }
        }
      }

      return Math.abs(left_sum - right_sum);
    }
    @SuppressWarnings("Convert2Diamond")
    public static void main(String args[]) {
      
      
        ArrayList<ArrayList<Integer>> arr;
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            arr = new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<n;i++){
                arr.add(new ArrayList<>());
                for(int j=0;j<n;j++){
                    int num=in.nextInt();
                    arr.get(i).add(num);
                }
            } }

      System.out.println(diagonalDiffrenceFunc1(arr));
    }
}
