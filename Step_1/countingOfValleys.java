import java.util.*;

public class countingOfValleys {
    
    public static int countingOfValleysFunc(String line) {
        int level = 0;
        int valleysCount = 0;
        
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'U') {
                level++;
            } else if (line.charAt(i) == 'D') {
                if (level == 0) {
                    valleysCount++;
                }
                level--;
            }
        }
        
        return valleysCount;
    }

    @SuppressWarnings("unused")
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();  // Fix: Consume leftover newline
            String s = in.nextLine();
            int result = countingOfValleysFunc(s);
            System.out.println(result);
            // Fix: Close Scanner to prevent resource leaks
        }
    }
}
