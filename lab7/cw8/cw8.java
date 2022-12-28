
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cw8 {

    // creating the function in which we ask for the keyword and check whether it's in the map. If yes -> the meaning in output will be shown off
    public static void check_func(){            
        Map<String, String> skrot = new HashMap<String, String>();
        
        skrot.put("omg", "O moj boze");
        skrot.put("nwm", "Nie ma znaczenia");
        skrot.put("hb", "100 lat");
        skrot.put("gg", "Dobra gra");
        skrot.put("idn", "Nie wiem");

        System.out.println("\n" + skrot + "\n");

        // Asking the user to input desired word in the map
        System.out.println("Type the shortcut you're looking for in the vocabulary: ");
        Scanner word = new Scanner(System.in);

        // Check is key exists in the Map
        boolean isKeyPresent = skrot.containsKey(word.nextLine());

        // Print the result
        // System.out.println("Does key " + word.nextLine() + " exists: " + isKeyPresent);

       // condition: if word exists in the map, than show up the meaning
        if(isKeyPresent){
            System.out.println("The meaning is: " + skrot.get(word.nextLine()));
        }else{
            System.out.println("There's no shortcut like that, please try one again");
        }
    }

    public static void main (String[] args) {
        
        // running check function
        check_func();
    }
}
