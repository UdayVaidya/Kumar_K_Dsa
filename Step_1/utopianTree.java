import java.util.*;


public class utopianTree {
    public static int utopianTreeFunc(int n){
        int height = 1;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                height *= 2;
            }else{
                height += 1;
            }
        }
        
        return height;
    }
    public static void main(String args[]) {
      
      
      try (Scanner in = new Scanner(System.in)) {
        int a = in.nextInt();
          
          for(int i = 0; i<a; i++){
            int n = in.nextInt();
            int c = utopianTreeFunc(n);
            System.out.println(c);
          }
    }
    }
}
