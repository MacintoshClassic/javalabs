import java.util.Random;
import java.util.Scanner;

public class app_2 {
    public static void main(String[] args){
        
        // 1 ____________________________________________
        Random num = new Random();
        int res;
        for ( int i = 1; i <= 20; i++){
           res = 1 + num.nextInt(1000);
           System.out.print(res/6 + " ");
        }

        // 2 ____________________________________________
        for(int i=2; i<=9; i++){
            int num = 666;
            if(num%i==0){
                System.out.println(i);
            }
            else{
                System.out.println("Cannot be devided");
            }
        }

        // 3 ____________________________________________
        int sum = 0;
        for(int i=0; i<=50; i+=5){
            System.out.println(i+" ");
            sum += i;
            System.out.println(sum); //275 na samym koncnu jest suma
        }

        // 4 ____________________________________________
        int num = 55;
        System.out.println((num%5==0) ? "True" : "False");
        System.out.println((num%7==0) ? "True" : "False");

        // 5 ____________________________________________
        int ile=5;
        for(int i=1; i<=ile; i++)
        {
            for(int j=ile-i+1; j>=1; j--)
            {   
                if((i==1&&j==5)
                ||(i==2&&j==4)
                ||(i==3&&j==3)
                ||(i==4&&j==2)
                ||(i==5&&j==1)){
                    System.out.print(i+" ");
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

        // 6 ____________________________________________
        Random los = new Random();
        int liczba;
        liczba = los.nextInt(5)+1;
        switch(liczba){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
            System.out.println("Undefied choice");
        }

        // 7 ____________________________________________
        int n1=0, n2=1, sum=0;
        System.out.print(n1+" "+n2);

        for(int i=2;i<10;i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }

        // 8 ____________________________________________
        try (Scanner in = new Scanner(System.in)) {
			int winA = 0;
			int winB = 7;
			int x=2;
			int wybor;
			for (int i = 1; i <= x; i++) {
			    System.out.println("Ktore pietro wybierasz ?");
			    wybor = in.nextInt();
			    if (Math.abs(winA - wybor) < Math.abs(winB - wybor)) {
			        System.out.println("A");
			        winA = wybor;
			    } else if (Math.abs(winA - wybor) > Math.abs(winB - wybor)) {
			        System.out.println("B");
			        winB = wybor;
			    } else {
			        if (winA<winB) {
			            System.out.println("A");
			            winA = wybor;
			        }
			        else{
			            System.out.println("B");
			            winB=wybor;
			        }
			    }
			}
		}
        
        // 9 ____________________________________________
        int N=25;
        int sum=0;
        for (int i=1; i<=N; i++){
            sum=sum+i;
            if (sum>=N)
            {
                System.out.println("Patlu wygrywa i kladzie ostatnia cegle");
                break;
            }
            sum=sum+2*i;
            if (sum>=N)
            {
                System.out.println("Motu wygrywa i kladzie ostatnia cegle");
                break;
            }
        }
    }    
}
