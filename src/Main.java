import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int [] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        while (true) {
            System.out.println("Entrez l'indice de l'entier à diviser: ");
            x = sc.nextInt();
            System.out.println("Entrez le diviseur");
            y = sc.nextInt();


            try {
                System.out.println("Le résultat de la division est : " + Division(x, y));
                    if (x, y != int){
                        System.out.println("Ce n'est pas un entier qui a été entré");
                    }
                break;
            }


            //
            catch (ArithmeticException e) {
                System.out.println("Les nombres entrés ne sont pas valides !");
            }


            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("L'entrée saisi n'est pas valide !");
            }


            catch (Exception e) {
                System.out.println("Ceci n'est pas valide !");
            }
        }
    }




    static int Division(int indice, int diviseur)
    {
        return tableau[indice] / diviseur;
    }
}