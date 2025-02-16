import java.util.*;


public class electronicShop {
    public static int electronicShop1(int budget,ArrayList<Integer> keyBoards, ArrayList<Integer> drives){
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
      
      
        int b;
        ArrayList<Integer> keyBoards ;
        ArrayList<Integer> drives ;
        try (Scanner in = new Scanner(System.in)) {
            int n ;
            int k ;
            b= in.nextInt();
            n = in.nextInt();
            k = in.nextInt();
            keyBoards = new ArrayList<>();
            drives = new ArrayList<>();
            for(int i=0; i<n; i++){
                int num = in.nextInt();
                keyBoards.add(num);
            }     for(int i=0; i<k; i++){
                int numi = in.nextInt();
                drives.add(numi);
            } }
      
        int result = electronicShop1(b,keyBoards,drives);
      
      
      
        System.out.println(result);
    }
}
