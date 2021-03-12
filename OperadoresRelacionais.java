public class OperadoresRelacionais {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;

        boolean result1 = (num1 == num2);
        System.out.println("1 é igual a 2 ? " + result1);

        boolean result2 = (num1 != num2);
        System.out.println("1 é diferente de 2 ? " + result2);

        boolean result3 = (num1 > num2);
        System.out.println("1 é maior que 2 ? " + result3);

        boolean result4 = (num1 >= num2);
        System.out.println("1 é maior ou igual a 2 ? " + result4);

        boolean result5 = (num1 < num2);
        System.out.println("1 é menor que 2 ? " + result5);

        boolean result6 = (num1 <= num2);
        System.out.println("1 é menor ou igual a 2 ? " + result6);

    }

}
