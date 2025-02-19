import java.util.*;


public class gradingStudents {
    public static void main(String args[]) {
      
      
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            
            ArrayList<Integer> grade = new ArrayList<>();
            ArrayList<Integer> ans = new ArrayList<>();
            
            for(int i = 0; i < n; i++){
                int num  = in.nextInt();
                grade.add(num);
            }
            
            
            for(int i = 0; i < n; i++){
                int numi  = grade.get(i);
                
                if( numi >= 38 && numi%5 >= 3){
                    numi = numi + 5 - numi%5;
                }
                
                ans.add(numi);
            }
            
            
            for(int i = 0; i < ans.size(); i++){
                System.out.println(ans.get(i) );
            } }
    }
}
