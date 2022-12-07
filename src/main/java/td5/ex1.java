package td5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entre un nombre entier : ");
        int nbEntier = clavier.nextInt();

        System.out.print("Les nombres entiers entre 1 et " + nbEntier + " : ");
        for (int i = 1; i <= nbEntier; i = i + 1) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println("");

        System.out.print("Les nombres pairs entre 1 et " + nbEntier + " : ");
        for (int i =2; i<= nbEntier; i = i+2) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println("");

        System.out.print("Les nombres de - " + nbEntier + " à " + nbEntier + " : ");
        for (int i = -nbEntier; i<=nbEntier; nbEntier--) {
            System.out.print(i);
            System.out.print("\t");

        System.out.println("");

            System.out.print("Les multiples de 5 entre 1 et " + nbEntier + " : ");
            for (int i1 = 5; i<=nbEntier; i+=5) {
                System.out.print(i);
                System.out.print("\t");
            }
        }
    }
}
