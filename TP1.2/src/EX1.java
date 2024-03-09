
	import java.util.Scanner;
	import java.lang.Math;
	public class EX1 {
	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer un entier positif : ");
		        int nombre = l.nextInt();
		        if (nombre <= 0) {
		            System.out.println("Veuillez entrer un entier positif.");
		            return; 
		        }
		        System.out.print("Les diviseurs de " + nombre + " sont : ");
		        int nombreDiviseurs = 0;
		        int sommeDiviseurs = 0;
                for (int i = 1; i <= nombre; i++) {
		            if (nombre % i == 0) {
		                System.out.print(i + " ");
		                nombreDiviseurs++;
		                sommeDiviseurs += i;
		            }
		        }
		        System.out.println("\nNombre de diviseurs : " + nombreDiviseurs);
		        System.out.println("Somme des diviseurs : " + sommeDiviseurs);
		        l.close();
	 }
}

