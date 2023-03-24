import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, a = 0, b = 1, c = 0, count = 2;
        boolean pertence = false;

        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();

        System.out.print("Sequência de Fibonacci: " + a + " " + b);

        while (count < 10) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            count++;
        }

        if (c > num) {
            pertence = true;
        }

        if (pertence) {
            System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
        }

        input.close();
    }
}
