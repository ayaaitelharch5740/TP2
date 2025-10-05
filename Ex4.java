package ma.tp2;

import java.util.Scanner;

public class Ex4 {
	
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				
				System.out.print("Entrez le nombre de lignes : ");
				int lignes = sc.nextInt();
				System.out.print("Entrez le nombre de colonnes : ");
				int colonnes = sc.nextInt();

				int[][] matrice = new int[lignes][colonnes];
				System.out.println("Entrez la matrice (0 ou 1) :");
				for (int iLigne = 0; iLigne < lignes; iLigne++) {
				    for (int jCol = 0; jCol < colonnes; jCol++) {
				        matrice[iLigne][jCol] = sc.nextInt();
				    }
				}

				int[] hauteur = new int[colonnes];
				int maxAire = 0;
				int meilleurHaut = 0, meilleurGauche = 0, meilleurBas = 0, meilleurDroite = 0;

				
				for (int iLigne = 0; iLigne < lignes; iLigne++) {
				    
				    for (int jCol = 0; jCol < colonnes; jCol++) {
				        if (matrice[iLigne][jCol] == 1)
				            hauteur[jCol]++;
				        else
				            hauteur[jCol] = 0;
				    }

				    
				    for (int debut = 0; debut < colonnes; debut++) {
				        if (hauteur[debut] == 0) continue; 
				        int minHauteur = hauteur[debut];

				        for (int fin = debut; fin < colonnes; fin++) {
				            if (hauteur[fin] == 0) break; 
				            if (hauteur[fin] < minHauteur)
				                minHauteur = hauteur[fin];

				            int largeur = fin - debut + 1;
				            int aire = largeur * minHauteur;

				            if (aire > maxAire) {
				                maxAire = aire;
				                meilleurHaut = iLigne - minHauteur + 1;
				                meilleurBas = iLigne;
				                meilleurGauche = debut;
				                meilleurDroite = fin;
				            }
				        }
				    }
				}

				
				System.out.println("\n→ Plus grand rectangle de 1 : aire = " + maxAire);
				System.out.println("Coordonnées : (" + meilleurHaut + "," + meilleurGauche + ") → (" +
				                   meilleurBas + "," + meilleurDroite + ")");
			}
	    }  

}
