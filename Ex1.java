package ma.tp2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

		System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();
        int[] t = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez un entier : ");
            t[i] = sc.nextInt();
        }

     
        int[] lis = new int[n]; 
        for (int i = 0; i < n; i++) {
            lis[i] = 1; 
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (t[j] < t[i] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

		
		int max = lis[0];
		for (int i = 1; i < n; i++) {
			if (lis[i] > max)
				max = lis[i];
		}

		System.out.println("→ Longueur maximale : " + max);
	}
  }
}
