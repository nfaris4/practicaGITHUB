//Escriure un programa que pasem com a parametre d'entrada (num1, num2, num3), separats per comes, i la sortida ens mostri la suma dels 3 n�meros i si es parell o imparell
public class SumaITipus {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Cal passar tres nombres com a paràmetres.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int suma = num1 + num2 + num3;
        String tipus = (suma % 2 == 0) ? "parell" : "imparell";

        System.out.printf("La suma dels tres nombres és %d i és %s.\n", suma, tipus);
    }
}
