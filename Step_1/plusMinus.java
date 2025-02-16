import java.util.*;



public class plusMinus {

    public static void main(String args[]) {
      
      
        ArrayList<Integer> nums;
        float numPostive;
        float numNegative;
        float numZero;
        try (Scanner in = new Scanner(System.in)) {
            nums = new ArrayList<>();
            int n = in.nextInt();
            numPostive = 0;
            numNegative = 0;
            numZero = 0;
            for(int i = 0; i < n; i++){
                int num = in.nextInt();
                nums.add(num);
                
                if(num > 0){
                    numPostive += 1;
                }else if(num < 0){
                    numNegative += 1;
                }else if(num == 0){
                    numZero += 1;
                }
            }
        }
        numPostive /= nums.size();
        numNegative /= nums.size();
        numZero /= nums.size();
            
            
        System.out.println(String.format("%.6f",numPostive));
        System.out.println(String.format("%.6f",numNegative));
        System.out.println(String.format("%.6f",numZero));
    }
}
