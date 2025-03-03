import java.util.*;


public class sequenceEquation {
    public static void sequenceEquationFunc(int n,HashMap<Integer,Integer> arr){
        for(int i = 1; i<=n; i++){
            int x = arr.get(i);
            int y = arr.get(x);
            System.out.println(y);
        }
    }
    public static void main(String args[]) {
      
      
      try (Scanner in = new Scanner(System.in)) {
        HashMap<Integer,Integer> arr=new HashMap<>();

          int n = in.nextInt();
          
          for(int i = 1; i <= n; i++){
            int temp = in.nextInt();
            arr.put(temp,i);
          }
          
          sequenceEquationFunc(n,arr);
    }
      
    }
}
