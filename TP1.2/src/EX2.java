import java.util.Scanner;
public class EX2 {
public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer l'heure : ");
		        int heure = l.nextInt();
		        System.out.print("Veuillez entrer les minutes : ");
		        int minutes = l.nextInt();
		        minutes++;
		        if (minutes == 60) {
		            minutes = 0;
		            heure++;
		        }
		        if (heure == 24) {
		            heure = 0;
		        }
		        System.out.println("L'heure suivante sera : " + heure + " heure(s) " + minutes + " minute(s)");
		        l.close();
}

}
