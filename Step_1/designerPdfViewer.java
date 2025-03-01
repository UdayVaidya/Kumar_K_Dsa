import java.util.*;


public class designerPdfViewer {
    public static int designerPdfViewerFunc(String word, ArrayList<Integer> arr){
        int mx = 0;
        
        for(int i = 0; i<word.length(); i++){
            if (arr.get(word.charAt(i) - 'a') > mx) {
                mx = arr.get(word.charAt(i) - 'a'); // Update max height
            }
        }
        
        return mx*word.length();
    }
    public static void main(String args[]) {
            
      try (Scanner in = new Scanner(System.in)) {
        ArrayList<Integer> arr = new ArrayList<>();
          
          int n = 26;
          
          for(int i = 0; i < n; i++){
            int temp = in.nextInt();
            arr.add(temp);
          }
          
          in.nextLine(); // Consume the newline character
          String word = in.nextLine();
          
          int result = designerPdfViewerFunc(word,arr); 
          
          System.out.println(result);
    }
    }
}
