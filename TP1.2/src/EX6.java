import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;
public class EX6 {

	public static void main(String[] args) {
		Scanner l= new Scanner(System.in).useLocale(Locale.US);
		        System.out.print("Veuillez entrer le poids (en kg) : ");
		        double poids = l.nextDouble();
		        System.out.print("Veuillez entrer la taille (en m) : ");
		        double taille = l.nextDouble();
		        System.out.print("Veuillez entrer le sexe (F pour Femme, M pour Homme) : ");
		        char sexe = l.next().charAt(0);
		        double imc = poids/ (taille * taille);
		        String etatPoids = "";
		        if (sexe == 'F' && imc < 19) {
		            etatPoids = "Maigreur";
		        } else if (sexe == 'F' && imc >= 19 && imc <= 24) {
		            etatPoids = "Poids normal";
		        } else if (sexe == 'F' && imc >= 24 && imc <= 30) {
		            etatPoids = "Surcharge pondérale";
		        } else if (sexe == 'F' && imc >= 30 && imc <= 40) {
		            etatPoids = "Adiposité";
		        } else if (sexe == 'F' && imc > 40) {
		            etatPoids = "Obésité";
		        } else if (sexe == 'M' && imc < 20) {
		            etatPoids = "Maigreur";
		        } else if (sexe == 'M' && imc >= 20 && imc <= 25) {
		            etatPoids = "Poids normal";
		        } else if (sexe == 'M' && imc >= 25 && imc <= 30) {
		            etatPoids = "Surcharge pondérale";
		        } else if (sexe == 'M' && imc >= 30 && imc <= 40) {
		            etatPoids = "Adiposité";
		        } else if (sexe == 'M' && imc > 40) {
		            etatPoids = "Obésité";
		        } else {
		            etatPoids = "Sexe non reconnu";
		        }
		        System.out.println("L'IMC est : " + imc);
		        System.out.println("État de poids : " + etatPoids);
		        l.close();
		   }
}
