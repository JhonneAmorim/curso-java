package variaveis;

public class Exercicios {
    public static void main(String[] args) {
        // Ex-1
        int numero = 10;
        int numeroDobrao = numero * 2;

        System.out.println(numeroDobrao);

        // Ex-2
        char letra = 'B';
        int codigoAscii = (int) letra;

        System.out.println(codigoAscii);

        // Ex-3
        double valorA = 15.75;
        double valorB = 20.40;

        double resultSoma = valorA + valorB;

        System.out.println(resultSoma);

        // Ex-4
        long numeroMilhao = 2_000_000L;
        int milhaoInt = (int) numeroMilhao;

        System.out.println(milhaoInt);

        // Ex-5
        String saudacao = "Olá, Mundo!";
        String mensagem = saudacao + " Bem-vindo ao Java!";

        System.out.println(mensagem);
    }
}
