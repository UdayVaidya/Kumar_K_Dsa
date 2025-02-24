import java.util.*;


public class breakingRecords {

  public static void breakingRecordsFunc(ArrayList<Integer> arr){
    int mx = arr.get(0);
    int mn = arr.get(0);
    int mx_count = 0;
    int mn_count = 0;

    for(int i = 1; i<arr.size(); i++){
      if(arr.get(i) > mx){
        mx = arr.get(i);
        mx_count++;
      }
      if(arr.get(i) < mn){
        mn = arr.get(i);
        mn_count++;
      }
    }

    System.out.println(mx_count + " " + mn_count);
  }
  public static void main(String args[]) {
      
      
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    int n = in.nextInt();

    for(int i=0; i<n; i++){
      int temp = in.nextInt();
      arr.add(temp);
    }

    in.close();
    breakingRecordsFunc(arr);
    
  }
}
