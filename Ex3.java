package ma.tp2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Entrez la taille de la matrice (n) : ");
			int n = sc.nextInt();

			int[][] matrice = new int[n][n];
			int nombre = 1;
			int debutLigne = 0, finLigne = n - 1;
			int debutCol = 0, finCol = n - 1;

			
			while (debutLigne <= finLigne && debutCol <= finCol) {
				
				
				for (int j = debutCol; j <= finCol; j++) {
					matrice[debutLigne][j] = nombre++;
				}
				debutLigne++;

				
				for (int i = debutLigne; i <= finLigne; i++) {
					matrice[i][finCol] = nombre++;
				}
				finCol--;

				
				if (debutLigne <= finLigne) {
					for (int j = finCol; j >= debutCol; j--) {
						matrice[finLigne][j] = nombre++;
					}
					finLigne--;
				}

				
				if (debutCol <= finCol) {
					for (int i = finLigne; i >= debutLigne; i--) {
						matrice[i][debutCol] = nombre++;
					}
					debutCol++;
				}
			}
			
			System.out.println("\nMatrice en spirale :");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%3d ", matrice[i][j]); // formaté pour l'alignement
				}
				System.out.println();
			}
		}
	}

}
