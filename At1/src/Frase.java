import java.util.Scanner;

public class Frase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        int contadorVogais = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caractere = Character.toUpperCase(frase.charAt(i));
            if (caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais na frase: " + contadorVogais);
    }
}
