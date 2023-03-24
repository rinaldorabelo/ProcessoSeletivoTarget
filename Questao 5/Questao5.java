import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra, invertida = "";

        System.out.print("Digite uma palavra: ");
        palavra = input.nextLine();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + invertida);

        input.close();
    }
}
