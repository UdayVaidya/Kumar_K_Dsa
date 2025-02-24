import java.util.*;


public class migratoryBirds {
    public static int migratoryBirdsFunc(int n, ArrayList<Integer>arr) {
      HashMap<Integer,Integer>mp=new HashMap<>();
      for(int i=0;i<arr.size();i++){
          int num=arr.get(i);
          if(mp.containsKey(num)){
              mp.put(num,mp.get(num)+1);
          }else{
              mp.put(num,1);
          }
      }
      int mx=0;
      int ans=0;
      for(Integer key:mp.keySet()){
          int value=mp.get(key);
          if(value>mx){
              mx=value;
              ans=key;
          }
      }
      return ans;
    }
    public static void main(String args[]) {
      
      
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      ArrayList<Integer>arr=new ArrayList<>();
      for(int i=0;i<n;i++){
        int value=in.nextInt();
        arr.add(value);
      }
      
      int result = migratoryBirdsFunc(n,arr);
      System.out.println(result);
    }
}
