import java.util.*;


public class electronicShop {
    public static int electronicShopFunc(int budget,ArrayList<Integer> keyBoards, ArrayList<Integer> drives){
        int n = keyBoards.size();
        int k = drives.size();
        
        int mx = -1;
        int sum;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                sum = keyBoards.get(i) + drives.get(j);
                if( sum <= budget){
                    mx = Math.max(sum,mx);
                }
            }
        }
        
        return mx;
    }
    public static void main(String args[]) {
      
      
      try (Scanner in = new Scanner(System.in)) {
        int b ; 
        int n ;
        int k ;
        b= in.nextInt();
        n = in.nextInt();
        k = in.nextInt();
        
        ArrayList<Integer> keyBoards = new ArrayList<>();
        
        ArrayList<Integer> drives = new ArrayList<>();
        
        for(int i=0; i<n; i++){
          int num = in.nextInt();
          keyBoards.add(num);
        }
        
        for(int i=0; i<k; i++){
          int numi = in.nextInt();
          drives.add(numi);
        }
        
        int result = electronicShopFunc(b,keyBoards,drives);
        
        System.out.println(result);
      }
    }
}
