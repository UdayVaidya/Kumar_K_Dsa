import java.util.*;



public class drawingBook {
    public static int drawingBookFunc(int n,int p){
        int totalFlips = n/2;
        int targetFlipsFront = p/2;
        int targetFlipsBack = totalFlips - targetFlipsFront;
        
        int result = Math.min(targetFlipsFront,targetFlipsBack);
        
        return result;
    }
    public static void main(String args[]) {
      
        int n;
        int p;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
            p = in.nextInt();
        }
      
      int ans = drawingBookFunc(n,p);
      
      System.out.println(ans);
    }
}
