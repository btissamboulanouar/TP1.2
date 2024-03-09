import java.util.Scanner;
public class EX4 {

	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer le premier entier (n) : ");
		        int n =l.nextInt();
		        System.out.print("Veuillez entrer le deuxième entier (m) : ");
		        int m = l.nextInt();
		        int sommeDiviseursN = 0;
		        for (int i = 2; i <= n / 2; i++) {
		            if (n % i == 0) {
		                sommeDiviseursN += i;
		            }
		        }
		        int sommeDiviseursM = 0;
		        for (int i = 2; i <= m / 2; i++) {
		            if (m % i == 0) {
		                sommeDiviseursM += i;
		            }
		        }
		        if (sommeDiviseursN == m && sommeDiviseursM == n) {
		            System.out.println(n + " et " + m + " sont des nombres amis.");
		        } else {
		            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
		        }
		        l.close();
	}
}
