import java.util.Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class app_4 {
    public static void main(String[] args) {

        // 1 ____________________________________________        
        Random los = new Random();
        int[] tablica = new int[21];
        double num = 2.0;
        
        System.out.print("Przed dzieleniem: ");
        for(int i=0; i<21; i++){
            tablica[i]=los.nextInt(100);
            System.out.print(tablica[i]+" ");
        }
        
        System.out.println();
        System.out.print("Po dzieleniu: ");
        for(int element : tablica){
            System.out.print(element/num+" ");
        }
        System.out.println();
        
        // 2 ____________________________________________
        int tablica[];
        tablica = new int[101];
        
        for(int i=0; i<100+1; i++){
            tablica[i]=+i;
            // System.out.print(tablica[i]+" ");

            if(tablica[i]%4==0){
                System.out.print(tablica[i]+" ");
            }
        }

        // 3 ____________________________________________
        int[] tablica = new int[101];
        Random los = new Random();

        for(int i=0; i<100+1; i++){
            tablica[i]=los.nextInt(100);
            // System.out.print(tablica[i]+" ");

            if(tablica[i]>=50){
                System.out.print(tablica[i]+" ");
            }
        }

        // 4 ____________________________________________       
        Random los = new Random();
        int wiersze = 4, kolumny = 7;
        int tablica1 [][]= new int[wiersze][kolumny];
        System.out.println("Godziny spedzone za nauka w lutym:");
        for(int i=0; i<wiersze; i++)
        {
            for(int j=0; j<kolumny; j++)
            {   
                tablica1[i][j]=los.nextInt(8);
                System.out.format("%4d",tablica1[i][j]);
            }
            System.out.println();
        }

        // 5 ____________________________________________  
        Random los = new Random();
        int wiersze = 5+los.nextInt(6), kolumny=3; 
        int tablica[][]= new int[wiersze][kolumny];
        for(int i=0; i<wiersze; i++)
        {
            for(int j=0; j<kolumny; j++)
            {   
                tablica[i][j] = los.nextInt(10);
                System.out.format("%4d",tablica[i][j]);
            }
            System.out.println();
        }


        // 6 ____________________________________________
                int m = 5;
                int n = 5;

                int s = 1;

                int[][] array = new int[m][n];

                for (int x = 0; x < m; x++) {
                    array[x][0] = s;
                    s++;
                }
                for (int y = 1; y < n; y++) {
                    array[m - 1][y] = s;
                    s++;
                }
                for (int x = m - 2; x >= 0; x--) {
                    array[x][n - 1] = s;
                    s++;
                }
                for (int y = n - 2; y >= 1; y--) {
                    array[0][y] = s;
                    s++;
                }
                int c = 1;
                int d = 1;
         
                while (s < m * n) {
                    while (array[c + 1][d] == 0) {
                        array[c][d] = s;
                        s++;
                        c++;
                    }

                    while (array[c][d + 1] == 0) {
                        array[c][d] = s;
                        s++;
                        d++;
                    }
         
                    while (array[c - 1][d] == 0) {
                        array[c][d] = s;
                        s++;
                        c--;
                    }
         
                    while (array[c][d - 1] == 0) {
                        array[c][d] = s;
                        s++;
                        d--;
                    }
         
                }
         
                for (int x = 0; x < m; x++) {
                    for (int y = 0; y < n; y++) {
                        if (array[x][y] == 0) {
                            array[x][y] = s;
                        }
                    }
                }
         
                for (int x = 0; x < m; x++) {
                    for (int y = 0; y < n; y++) {
                        if (array[x][y] < 10) {
                            System.out.print(array[x][y] + ",  ");
                        } else {
                            System.out.print(array[x][y] + ", ");
                        }
                    }
                    System.out.println("");
                }


// 7 ____________________________________________
Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for(int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();

			int[] arr = new int[N];

			for(int j = 0; j < N; j++) {
				int num = scanner.nextInt();
				arr[j] = num;
			}

			boolean check = checkSubArray(N, arr, K);
			if(check) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

    }
    public static boolean checkSubArray(int a, int[] arr, int b) {
		if(a == b) {
			return true;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a; i++) {
			map.put(arr[i], i);
		}

		if(map.size() > b) {
			return false;
		}

		int x = a / b;
		for(int key : map.keySet()) {
			if(map.get(key) % x != 0) {
				return false;
			}
		}
		return true;
    }
}

