package ma.tp2;

import java.util.Scanner;

public class Ex6 {
	
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Entrez la taille du tableau : ");
				int n = sc.nextInt();
				int[] t = new int[n];

				
				for (int i = 0; i < n; i++) {
				    System.out.print("Entrez un entier : ");
				    t[i] = sc.nextInt();
				}

				
				int maxCourant = t[0];
				int maxTotal = t[0];
				int debutTemp = 0, debut = 0, fin = 0;

				for (int iAnalyse = 1; iAnalyse < n; iAnalyse++) {
					
				    if (t[iAnalyse] > maxCourant + t[iAnalyse]) {
				        maxCourant = t[iAnalyse];
				        debutTemp = iAnalyse;
				    } else {
				        maxCourant += t[iAnalyse];
				    }

				    
				    if (maxCourant > maxTotal) {
				        maxTotal = maxCourant;
				        debut = debutTemp;
				        fin = iAnalyse;
				    }
				}	
    
				System.out.println("\n→ Somme maximale : " + maxTotal);
				System.out.print("→ Sous-suite : ");
				for (int iAffichage = debut; iAffichage <= fin; iAffichage++) {
				    System.out.print(t[iAffichage] + (iAffichage < fin ? ", " : ""));
				}
			}

	        System.out.println();
	    }
	      

}
