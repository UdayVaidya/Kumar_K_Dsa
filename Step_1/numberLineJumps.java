import java.util.*;


public class numberLineJumps {
    public static String numberLineJumps1(int x1, int v1, int x2, int v2) {
        String result = "NO";

        if (v1 == v2) {
            if (x1 == x2) {
                result = "YES"; // Already at the same position
            } else {
                return result; // Never meet if speeds are the same but positions differ
            }
        } 
        // Check if they meet at the same position after the same number of jumps
        else if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) >= 0) {
            result = "YES";
        } else {
            result = "NO";
        }
        
        return result;
    }

    public static void main(String args[]) {

        try (Scanner in = new Scanner(System.in)) {
            int x1 = in.nextInt();
            int v1 = in.nextInt();
            int x2 = in.nextInt();
            int v2 = in.nextInt();
            
            String result = numberLineJumps1(x1, v1, x2, v2);
            
            System.out.println(result);
        }

    }
}
