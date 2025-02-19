import java.util.*;


class timeConversion {


    public static void conversionFunction(String s){

      if(s.charAt(8) == 'P'){
        String portion = s.substring(0,8);
        String[] time = portion.split(":");
        if(time[0].equals("12")){
            System.out.println(time[0] + ":" +time[1] + ":" +time[2]);
        }else{
            time[0] = String.valueOf(Integer.parseInt(time[0]) + 12);
            System.out.println(time[0] + ":" +time[1] + ":" +time[2]);
        }
      }else{
        String portion = s.substring(0,8);
        String[] time = portion.split(":");
        
        if(time[0].matches("12")){
            time[0] = "00";
            System.out.println(time[0] + ":" +time[1] + ":" +time[2]);
        }else{
            System.out.println(portion);
        }
      }

    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
      
      
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();

      in.close();
      
      conversionFunction(s);
    }
}
