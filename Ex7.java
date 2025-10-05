package ma.tp2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Entrez la taille du tableau : ");
			int n = sc.nextInt();
			int[] t = new int[n];

			
			for (int i = 0; i < n; i++) {
			    System.out.print("Entrez un entier : ");
			    t[i] = sc.nextInt();
			}

			int majoritaire = trouverMajoritaire(t);
			if (majoritaire != -1)
			    System.out.println("→ Élément majoritaire : " + majoritaire);
			else
			    System.out.println("→ Aucun élément majoritaire trouvé.");
		}
    }

    
    public static int trouverMajoritaire(int[] t) {
        int candidat = 0;
        int compteur = 0;

       
        for (int valAnalyse : t) {
            if (compteur == 0) {
                candidat = valAnalyse;
                compteur = 1;
            } else if (valAnalyse == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }

        
        int occurences = 0;
        for (int valVerification : t) {
            if (valVerification == candidat)
                occurences++;
        }

        return (occurences > t.length / 2) ? candidat : -1;
    }
}
