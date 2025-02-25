
import java.util.ArrayList;
import java.util.Scanner;

public class billDivision {
    public static void billDivisionFunc(int index, ArrayList<Integer> arr, int b_charge){
        int b_actual = 0;
        int n = arr.size();
        for(int i=0; i<n; i++){
            if(i != index){
                b_actual += arr.get(i);
            }
        }
        b_actual = b_actual/2;
        if(b_actual == b_charge){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b_charge - b_actual);
        }
    }
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<n; i++){
                arr.add(in.nextInt());
            }
            int b_charge = in.nextInt();
            billDivisionFunc(k, arr, b_charge);

        }
    }
}
