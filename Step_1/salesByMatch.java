import java.util.*;


public class salesByMatch {
    public static int salesByMatchFunc(ArrayList<Integer> arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.size();

        for(int i = 0; i<n; i++){
            int color  = arr.get(i);
            if(map.containsKey(color)){
                map.put(color,map.get(color)+1);
            }else{
                map.put(color,1);
            }
        }

        int pairs = 0; 

        for(int key: map.keySet()){
            int value = map.get(key);
            pairs += (value/2);
        }

        return pairs;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr;
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            arr = new ArrayList<>();
            for(int i=0; i<n; i++){
                int temp = in.nextInt();
                arr.add(temp);
            }
        }
        int result = salesByMatchFunc(arr);
        
        System.out.println(result);
    }
}
