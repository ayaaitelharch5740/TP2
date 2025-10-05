package ma.tp2;

import java.util.Scanner;

public class Ex5 {

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
			for (int val : t) {
			    if (val < 1 || val > n || vu[val]) {
			        System.out.println("→ Ce n'est PAS une permutation circulaire (valeurs invalides ou doublons).");
			        return;
			    }
			    vu[val] = true;
			}
      
			int index1 = -1;
			for (int i = 0; i < n; i++) {
			    if (t[i] == 1) {
			        index1 = i;
			        break;
			    }
			}
    
			boolean circulaire = true;
			for (int i = 0; i < n; i++) {
			    int attendu = (1 + i - index1 + n) % n + 1; 
			    if (t[(index1 + i) % n] != attendu) {
			        circulaire = false;
			        break;
			    }
			}

			if (circulaire)
			    System.out.println("→ C’est une permutation circulaire valide ");
			else
			    System.out.println("→ Ce n’est PAS une permutation circulaire ");
		}
    }

}
