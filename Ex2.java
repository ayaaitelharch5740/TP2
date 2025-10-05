package ma.tp2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Entrez la taille du tableau : ");
			int t = sc.nextInt();
			int[] tableau = new int[t];

			
			for (int iLecture = 0; iLecture < t; iLecture++) {
				System.out.print("Entrez un entier : ");
				tableau[iLecture] = sc.nextInt();
			}
			
			int[] maxGauche = new int[t];
			maxGauche[0] = tableau[0];
			for (int iMax = 1; iMax < t; iMax++) {
				maxGauche[iMax] = Math.max(maxGauche[iMax - 1], tableau[iMax]);
			}
			
			int[] minDroite = new int[t];
			minDroite[t - 1] = tableau[t - 1];
			for (int iMin = t - 2; iMin >= 0; iMin--) {
				minDroite[iMin] = Math.min(minDroite[iMin + 1], tableau[iMin]);
			}
			System.out.print("→ Pivots : ");
			boolean trouve = false;

			for (int iPivot = 0; iPivot < t; iPivot++) {
				boolean gaucheOk = (iPivot == 0) || (maxGauche[iPivot - 1] <= tableau[iPivot]);
				boolean droiteOk = (iPivot == t - 1) || (minDroite[iPivot + 1] >= tableau[iPivot]);

				if (gaucheOk && droiteOk) {
					if (trouve)
						System.out.print(", ");
					System.out.print(tableau[iPivot]);
					trouve = true;
				}
			}

			if (!trouve) {
				System.out.print("Aucun pivot trouvé");
			}
		}

		System.out.println();
	}
}
