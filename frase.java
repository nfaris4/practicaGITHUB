import java.util.Scanner;

public class SubstituirCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introdueix un caràcter: ");
        String caracter = sc.nextLine();

        // Assegurem que el caràcter introduït té longitud 1
        if (caracter.length() != 1) {
            System.out.println("El caràcter ha de tenir longitud 1");
            return;
        }

        String resultat = frase.replace(caracter, "*");
        System.out.println(resultat);
    }
}






