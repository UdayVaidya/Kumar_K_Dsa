import java.util.*;

public class cutSticks {
    public static void cutSticksFunc(int n, ArrayList<Integer> arr) {
        Collections.sort(arr);
        
        int totalstick = n;
        System.out.println(totalstick); // Print initial stick count
        
        int curr = arr.get(0);
        int curr_count = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == curr) {
                curr_count++;
            } else {
                totalstick -= curr_count;
                System.out.println(totalstick);
                curr = arr.get(i);
                curr_count = 1;
            }
        }
    }

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                arr.add(in.nextInt());
            }
            
            cutSticksFunc(n, arr);
        }
    }
}
