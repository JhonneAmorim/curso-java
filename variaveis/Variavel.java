package variaveis;

public class Variavel {
    public static void main(String[] args) {
        // String nome = "Jhonne";
        // int idade = 25;

        // System.out.println(nome);
        // System.out.println(idade);

        // 4 - Strings
        String firstName = "Jhonne";
        String lastName = "Oliveira";

        System.out.println(firstName + " " + lastName);

        // 5 - Char
        char letra = 'Y';

        System.out.println(letra);

        // 6 - Int
        int numero = 42;

        System.out.println(numero);

        // 7 - long
        long tempo = 259595952959259L;

        System.out.println(tempo);

        // 8 - double

        double decimal = 5.2;

        System.out.println(decimal);

        // 9 - OP. Aritmeticos

        int soma = 12 + 5;

        System.out.println(soma);
        System.out.println(22 + 3);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 / 2.5);
        System.out.println(10 % 2);

        // incremento

        int num = 2;

        num++;

        System.out.println(num);

        // decremento

        int num2 = 5;

        num--;

        System.out.println(num2);

        num += num2;

        num -= num2;

        System.out.println(num);
        System.out.println(num2);

        // 11 - Type casting

        // implicito (widening)
        int numero2 = 41;

        long numeroLong = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        // explicito (narrowing)
        double valorDouble = 9.74;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        // casting de char para int
        int codigoAscii = (int) letra;

        System.out.println(codigoAscii);

        // 12 - constantes
        final int DIAS_DA_SEMANA = 7;
        System.out.println("Dias da semana " + DIAS_DA_SEMANA);

        // 13 - var
        var z = 10;

        System.out.println(z);

        // z = "teste";
        z = 15;

        var texto = "teste";

        System.out.println(texto);
    }
}
