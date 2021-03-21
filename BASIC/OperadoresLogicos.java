package BASIC;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;

        System.out.println(System.lineSeparator());
        System.out.println("&& AMBOS PRECISAM SER VERDADEIRO PARA UM RESULTADO VERDADEIRO ");

        boolean result1 = (num1 == 1) && (num2 == 2);
        System.out.println("num1 é 1 AND num2 é 2 ? " + result1);

        boolean result2 = (num1 == 1) && (num2 == 3);
        System.out.println("num1 é 1 AND num2 é 3 ? " + result2);

        boolean result3 = (num1 == 2) && (num2 == 3);
        System.out.println("num1 é 2 AND num2 é 3 ? " + result3);

        System.out.println(System.lineSeparator());
        System.out.println("OR SÓ DA FALSO QUANDO AMBOS SÃO FALSOS");

        boolean result4 = (num1 == 1) || (num2 == 2);
        System.out.println("num1 é 1 OR num2 é 2 ? " + result4);

        boolean result5 = (num1 == 1) || (num2 == 3);
        System.out.println("num1 é 1 OR num2 é 3 ? " + result5);

        boolean result6 = (num1 == 2) || (num2 == 3);
        System.out.println("num1 é 1 OR num2 é 3 ? " + result6);

        System.out.println(System.lineSeparator());
        System.out.println("XOR SÓ DA FALSO QUANDO AMBOS SÃO VERDADEIROS OU FALSOS");

        boolean result7 = (num1 == 1) ^ (num2 == 2);
        System.out.println("num1 é 1 XOR num2 é 2 ? " + result7);

        boolean result8 = (num1 == 1) ^ (num2 == 3);
        System.out.println("num1 é 1 XOR num2 é 3 ? " + result8);

        boolean result9 = (num1 == 2) ^ (num2 == 3);
        System.out.println("num1 é 2 XOR num2 é 3 ? " + result9);

        boolean result10 = (num1 == 1) != (num2 == 2);
        System.out.println("num1 é 1 NOT num2 é 2 ? " + result10);

    }

}
