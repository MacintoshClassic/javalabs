
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cw9 {

    public static void meaning_func(){
        Map<String, String> sms = new HashMap<String, String>();
            
        sms.put("bd", "Bardzo dobrze");
        sms.put("nwm", "Nie wiem");
        sms.put("3m", "Trzymaj sie");
        sms.put("xoxo", "Usciski i caluski");
        sms.put("fb", "Facebook");
    
        System.out.println("\n" + sms + "\n");

        System.out.println("Type here the SMS shortcut: ");
        Scanner skrot = new Scanner(System.in);

        boolean isKeyPresent = sms.containsKey(skrot.nextLine());

        if(isKeyPresent){
            System.out.println("This shortcut means: " + sms.get(skrot.nextLine()));
        }else{
            System.out.println("There's no shortcut like that, please try one again");
        }
    }
    public static void main (String[] args) {
        meaning_func();
    }
}