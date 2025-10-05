package ma.tp2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Entrez la taille du tableau : ");
			int n = sc.nextInt();
			int[] t = new int[n];

			
			for (int i = 0; i < n; i++) {
			    System.out.print("Entrez un entier : ");
			    t[i] = sc.nextInt();
			}

			
			boolean[] vu = new boolean[n + 1]; 

			
			for (int iMarquage = 0; iMarquage < n; iMarquage++) {
			    int val = t[iMarquage];
			    if (val >= 1 && val <= n)
			        vu[val] = true;
			}

			
			System.out.print("→ Nombres manquants : ");
			boolean aucunManquant = true;
			for (int iAffichage = 1; iAffichage <= n; iAffichage++) {
			    if (!vu[iAffichage]) {
			        System.out.print(iAffichage + " ");
			        aucunManquant = false;
			    }
			}

			if (aucunManquant)
			    System.out.print("Aucun (tous les nombres sont présents)");
		}

        System.out.println();
    }
}
