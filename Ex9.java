package ma.tp2;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Entrez la taille de la matrice carrée : ");
			int n = sc.nextInt();
			int[][] matrice = new int[n][n];

			
			for (int iLigne = 0; iLigne < n; iLigne++) {
			    for (int iColonne = 0; iColonne < n; iColonne++) {
			        System.out.print("Entrez l'élément [" + iLigne + "][" + iColonne + "] : ");
			        matrice[iLigne][iColonne] = sc.nextInt();
			    }
			}

    
			int sommePrincipale = 0;
			int sommeSecondaire = 0;

			for (int iCalcul = 0; iCalcul < n; iCalcul++) {
			    sommePrincipale += matrice[iCalcul][iCalcul];               
			    sommeSecondaire += matrice[iCalcul][n - 1 - iCalcul];       
			}

			int difference = Math.abs(sommePrincipale - sommeSecondaire);

			
			System.out.println("\nSomme diagonale principale : " + sommePrincipale);
			System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
			System.out.println("→ Différence absolue = " + difference);
		}
    }

}
