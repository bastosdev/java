package BASIC;

public class For {

    public static void main(String[] args) {


        for (int count = 0; count <= 10; count++){
            System.out.println("O valor é " + count);
        }

        System.out.println("-------------------------------------------------");

        for (int count = 0, count2 = 10; count <= count2 ; count++, count2--){
            System.out.println("O valor de count é: " + count + " e O valor de count2 é: " + count2);
        }

    }

}
