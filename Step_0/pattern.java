import java.util.*;

public class pattern{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            pattern p = new pattern();
            p.patternNumber11(n);
        }
    }

    public void patternNumber1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                System.out.print("0"+" ");
            }
            System.out.println();
        }
    }
    
    public void patternNumber2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("0"+" ");
            }
            System.out.println();
        }
    }
    
    public void patternNumber3(int n){
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    public void patternNumber4(int n){
        
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(65+i)+" ");
                
            }
            System.out.println();
        }
    }
    
    
    public void patternNumber5(int n){
        
        
        for(int i=0; i<n; i++){
            for(int j=i; j<=2*i; j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
    
    public void patternNumber6(int n){
        
        
        for(int i=0; i<n; i++){
            for(int j=i; j>=0; j--){
                System.out.print((char)(65+n-j-1)+" ");
            }
            System.out.println();
        }
    }
    
    public void patternNumber7(int n){
        
        
        for(int i=0; i<=n; i++){
            for(int j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public void patternNumber8(int n){
        
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n-i; j++ ){
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
    
    public void patternNumber9(int n){
        
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n-i-1; j++ ){
                System.out.print(".");
            }
            
            for(int j=i+1; j<= 2*i+1; j++){
                System.out.print(j);
            }
            
            for(int j=2*i; j>= i+1; j--){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
    
    
    public void patternNumber10(int n){
        int x = (n/2) + 1;
        
        // Upper half
        for(int i = 0; i < x; i++){
            
            for(int j = 0; j < x-i-1; j++ ){
                System.out.print(" ");  
            }
            
            for(int j = 1; j <= 2*i+1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // Lower Half
        for(int i = 1; i<= (n-x); i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            
            for(int j = 1 ; j <= n - (2*i); j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
     void patternNumber11(int n) {
        int maxi = (2 * n) - 2; // Total size of the grid
        
        for (int i = 0; i <= maxi; i++) {  // Loop through rows
            for (int j = 0; j <= maxi; j++) {  // Loop through columns
                int minDistance = Math.min(Math.min(i, j), Math.min(maxi - i, maxi - j));
                System.out.print((n - minDistance) + " ");
            }
            System.out.println();  // Move to the next row
        }
    }
    
    public void patternNumber12(int n){
        
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(".");
            }
            
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void patternNumber13(int n){
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=1; j<=i+1; j++){
                System.out.print(j);
                if(j < i+1){
                    System.out.print("+");
                }
                
                sum += j;
            }
            
            System.out.println("=" + sum);
        }
    }
}