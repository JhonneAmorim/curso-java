// Receber um número pelo scanner, exibir a tabuada do mesmo.

package ProjetoTabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para a multiplicação: ");

        double numero = scanner.nextDouble();

        scanner.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + "= " + numero * i);
        }

        scanner.close();
    }
}
