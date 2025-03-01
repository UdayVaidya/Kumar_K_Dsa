import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class designerPdfViewer {
    public static int designerPdfViewerFunc(String word, ArrayList<Integer> arr){
        int mx = 0;
        
        for(int i = 0; i<word.length(); i++){
            int height = arr.get(word.charAt(i) - 'a'); // Convert character to index
            if (height > mx) {
                mx = height; // Update max height
            }
        }
        
        return mx*word.length();
    }
    public static void main(String args[]) {
            
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> arr = new ArrayList<>();
      
      int n = 26;
      
      for(int i = 0; i < n; i++){
        int temp = in.nextInt();
        arr.add(temp);
      }
      in.nextInt();
      
      String word = in.nextLine();
      
      int result = designerPdfViewerFunc(word,arr); 
      
      System.out.println(result);
    }
}
