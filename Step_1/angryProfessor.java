import java.util.*;

public class angryProfessor {
    public static String angryProfessorFunc(int k, ArrayList<Integer> arr){
        int earlyTime = 0;
        
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) <= 0){
                earlyTime++;
            }
        }
        
        return (earlyTime >= k) ? "NO" : "YES";
    }

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt(); // Number of test cases

            for(int i = 0; i < t; i++){
                int n = in.nextInt(); // Number of students
                int k = in.nextInt(); // Minimum students needed on time
                
                ArrayList<Integer> arr = new ArrayList<>();
                for(int j = 0; j < n; j++){
                    arr.add(in.nextInt());
                }
                
                System.out.println(angryProfessorFunc(k, arr));
            }
        }
    }
}
