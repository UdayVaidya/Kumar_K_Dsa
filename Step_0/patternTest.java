
import java.util.Scanner;

public class patternTest {
    public static void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i;j++){
                System.out.print("*");
            }

            for(int j = 2; j <= 2 * (n-i) - 1;j++){
                System.out.print(".");
            }

            for(int j = 0; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            pattern1(n);
        }
    }
}
