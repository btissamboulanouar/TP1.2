import java.util.Scanner;
public class EX3 {

	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer un entier positif supérieur à 1 : ");
		        int n = l.nextInt();
		        if (n <= 1) {
		            System.out.println("Veuillez entrer un entier positif supérieur à 1.");
		        } else {
		            int sommeDiviseurs = 1; 
		            for (int i = 2; i * i <= n; i++) {
		                if (n % i == 0) {
		                    sommeDiviseurs += i;
		                    if (i * i != n) {
		                        sommeDiviseurs += n / i;
		                    }
		                }
		            }
		            if (sommeDiviseurs == n) {
		                System.out.println(n + " est un nombre parfait.");
		            } else {
		                System.out.println(n + " n'est pas un nombre parfait.");
		            }
		        }
		       l.close();
		    }
		}
