package BASIC;

public class Matriz {

    public static void main(String[] args) {

        double[][] numbers = new double [2][2];
        numbers[0][0] = 0.0;
        numbers[0][1] = 0.1;

        numbers[1][0] = 1.0;
        numbers[1][1] = 1.1;

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }

    }

}
