package BASIC;

public class While {

    public static void main(String[] args) {

        int count = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while (count <= max) {
            System.out.println("O valor é: " + count);
            count++;
        }

    }
}
