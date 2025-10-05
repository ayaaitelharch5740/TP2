package ma.tp2;

import java.util.Scanner; 

public class Ex10 {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			final int n = 3;
			int[][] matrice = new int[n][n];

      
			for (int iLigne = 0; iLigne < n; iLigne++) {
			    for (int iColonne = 0; iColonne < n; iColonne++) {
			        System.out.print("Entrez l'élément [" + iLigne + "][" + iColonne + "] : ");
			        matrice[iLigne][iColonne] = sc.nextInt();
			    }
			}

      
			int sommeReference = 0;
			for (int iColonne = 0; iColonne < n; iColonne++) {
			    sommeReference += matrice[0][iColonne];
			}

			boolean magique = true;

			
			for (int iLigne = 0; iLigne < n && magique; iLigne++) {
			    int sommeLigne = 0;
			    for (int iColonne = 0; iColonne < n; iColonne++) {
			        sommeLigne += matrice[iLigne][iColonne];
			    }
			    if (sommeLigne != sommeReference) magique = false;
			}

			
			for (int iColonne = 0; iColonne < n && magique; iColonne++) {
			    int sommeColonne = 0;
			    for (int iLigne = 0; iLigne < n; iLigne++) {
			        sommeColonne += matrice[iLigne][iColonne];
			    }
			    if (sommeColonne != sommeReference) magique = false;
			}

      
			int diagPrincipale = 0, diagSecondaire = 0;
			for (int iCalcul = 0; iCalcul < n; iCalcul++) {
			    diagPrincipale += matrice[iCalcul][iCalcul];
			    diagSecondaire += matrice[iCalcul][n - 1 - iCalcul];
			}
			if (diagPrincipale != sommeReference || diagSecondaire != sommeReference) {
			    magique = false;
			}

      
			System.out.println();
			if (magique)
			    System.out.println("→ La matrice est magique (somme = " + sommeReference + ")");
			else
			    System.out.println("→ La matrice n'est PAS magique ");
		}
    }
}
