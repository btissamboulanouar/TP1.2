import java.util.Scanner;
public class EX8 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		System.out.print("Veuillez entrer l'âge : ");
		        int age = l.nextInt();
		        System.out.print("Veuillez entrer le sexe (H pour Homme, F pour Femme) : ");
		        char sexe = l.next().charAt(0);
		        boolean estImposable = false;
		        if (sexe == 'H' && age > 20) {
		            estImposable = true;
		        } else if (sexe == 'F' && age >= 18 && age <= 35) {
		            estImposable = true;
		        }
		        if (estImposable) {
		            System.out.println("La personne est imposable.");
		        } else {
		            System.out.println("La personne n'est pas imposable.");
		        }
		        l.close();
		    }
	}
