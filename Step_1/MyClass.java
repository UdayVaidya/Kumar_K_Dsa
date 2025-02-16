import java.util.*;



public class MyClass {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
      
      int n = 3;
      int[] arrA;
      int[] arrB;

      int alice = 0;
      int bob = 0;
      
      arrA = new int[n];
      arrB = new int[n];
      
      Scanner in = new Scanner(System.in);
      
      for(int i = 0; i<n; i++){
        arrA[i] = in.nextInt();
      }
      
      for(int i = 0; i<n; i++){
        arrB[i] = in.nextInt();
      }
      
      for(int i = 0; i<n; i++){
        if(arrA[i] > arrB[i]){
            alice += 1;
        }else if(arrA[i] < arrB[i]){
            bob += 1;
        }
      }

      in.close();
      
      System.out.println(alice +" "+ bob);
    }
}
