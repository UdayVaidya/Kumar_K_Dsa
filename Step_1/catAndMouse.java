import java.util.*;


public class catAndMouse {
    public static String catAndMouseFunc(int x, int y, int z){
        int distA = Math.abs(z-x);
        int distB = Math.abs(z-y);
        
        String result;
        
        if(distA > distB){
            result = "Cat B";
        }else if(distA < distB){
            result = "Cat A";
        }else{
            result = "Mouse C";
        }
        
        return result;
    }
    public static void main(String args[]) {
      
      
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            
            for(int i = 0; i<n; i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                
                String result = catAndMouseFunc(a,b,c);
                System.out.println(result);
            } }
    }
}
