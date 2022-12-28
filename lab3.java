import java.util.Formatter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Arrays;
import java.util.Random;

public class app_3 {
    public static void main(String[] args){

        // 1 ____________________________________________
        Calendar today = Calendar.getInstance();        
        Formatter data = new Formatter();
        Formatter data1 = new Formatter();
        Formatter data2 = new Formatter();
        Formatter data3 = new Formatter();
        
        data.format("%td", today);
        System.out.println(data);
        data.close();

        data1.format("%tm", today);
        System.out.println(data1);
        data1.close();

        data2.format("%tY", today);
        System.out.println(data2);
        data2.close();

        data3.format("%tR", today);
        System.out.println(data3);
        data3.close();

        // 2 ____________________________________________
        Scanner name = new Scanner(System.in);
        System.out.println("Give me your name");
        String frase1 = name.next();

        Scanner surname = new Scanner(System.in);
        System.out.println("Give me your surname");
        String frase2 = surname.next();

        System.out.println(frase1.toUpperCase() + " " + frase2.toUpperCase());

        // 3 ____________________________________________
        double dzielenie, liczba = 1.0;
        for(int i=1; i<=5; i++){
            dzielenie=liczba/i;
            Formatter lForm = new Formatter();
            lForm.format("%1.05f %n", dzielenie);
            System.out.print(lForm);
        }

        // 4 ____________________________________________
        Scanner text = new Scanner(System.in);
        System.out.println("Give me the word");
        String word = text.next();
        int len = word.length();

        for(int i=0; i<len/2; i++){
            if(word.charAt(i)!=word.charAt(len-i-1))
                System.out.println("not polindrome");
            else{
                System.out.println("polindrome");
            }
        }  

        // 5 ____________________________________________ 
        Scanner wyraz1 = new Scanner(System.in);
        System.out.println("Give me the 1st word");
        String word1 = wyraz1.next();

        Scanner wyraz2 = new Scanner(System.in);
        System.out.println("Give me the 2nd word");
        String word2 = wyraz2.next();

        char[] chars = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        word1 = new String(chars);
        word2 = new String(chars2);
        if (word1.equalsIgnoreCase(word2)) {
        System.out.println("Anagram");
        } else {
        System.out.println("Not Anagram");
        }

        // 6 ____________________________________________
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Give me the number:");
        int number = scanner.nextInt();

        Random liczba = new Random();
        int res;
        int result;
        for (int i=1; i<=10; i++){
            res = 1+liczba.nextInt(10);
            result = res-number;
           if(result>=0){
            System.out.println(result + " (+)");
           }
           else{
            System.out.println(result + " (-)");
           }
        }
    }
}




