package Gamos;
import java.util.Scanner;
public class Exercice_Gamos {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bienvenue au garage des gamos,");
        System.out.println("Parmis Audi (1) & Bmw (2),  laquelle veux-tu ? ");
        int nb = clavier.nextInt();
        if (nb == 1) {
            System.out.println("Audi ? Très bon choix !");
        } else if (nb == 2) {
            System.out.println("Bmw ? Très bon choix !");
            System.out.println("Et maintenant, quel modèle veux-tu : M3 (3), M4 (4), M5 (5), M6 (6), M7 (7) ?  ");
            int nbr = clavier.nextInt();
            if (nbr == 3) {
                System.out.println("Parfait ton M3 sera prête !");
            } else if (nbr == 4) {
                System.out.println("Parfait ton M4 sera prête !");
            } else if (nbr == 5) {
                System.out.println("Parfait ton M5 sera prête !");
            } else if (nbr == 6) {
                System.out.println("Parfait ton M6 sera prête !");
            } else if (nbr == 7) {
                System.out.println("Parfait ton M7 sera prête !");
            }
        }
    }
}
