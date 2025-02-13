package variaveis;

import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        // 1 - testando scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Ola " + nome + "!");

        // netxInt

        System.out.println("Qual sua idade? ");

        int idade = scanner.nextInt();

        System.out.println(idade + " anos.");

        // 2- Problema do nextLine
        System.out.println("Digite um numero: ");

        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um texto: ");

        String txt = scanner.nextLine();

        System.out.println("Os dados são, numero = " + numero + " e texto = " + txt);

        // Fechamento do scanner, para evitar memory leak

        scanner.close();

    }
}
