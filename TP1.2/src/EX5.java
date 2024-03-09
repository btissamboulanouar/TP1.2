import java.util.Scanner;
public class EX5 {
public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
         int[] butsParJoueur = new int[22];
         //buts de chaque joueurs
		        for (int i = 0; i < 22; i++) {
		            System.out.print("Entrer le nombre de buts pour le joueur n°" + (i + 1) + " : ");
		            butsParJoueur[i] = l.nextInt();
		        }
		        //numéro du buteur 
		        System.out.print("Les numéros des buteurs de l'équipe sont : ");
		        for (int i = 0; i < butsParJoueur.length; i++) {
		            if (butsParJoueur[i] > 0) {
		                System.out.print((i + 1) + " ");
		            }
		        }
		        System.out.println();
		        //total des buts
		        int totalButs = 0;
		        for (int buts : butsParJoueur) {
		            totalButs += buts;
		        }
		        System.out.println("Le nombre total des buts inscrits par l'équipe est : " + totalButs);
		        //joueurs qui n'ont pas marqué
		        int joueursSansButs = 0;
		        for (int buts : butsParJoueur) {
		            if (buts == 0) {
		                joueursSansButs++;
		            }
		        }
		        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansButs);
		        //le nombre de buts pour le joueur n°9
		        butsParJoueur[8] +=2;
		        System.out.print("le nombre de buts pour le joueur n°9 : "+butsParJoueur[8]);
		        l.close();
		    }
}

