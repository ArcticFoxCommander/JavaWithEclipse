package unit4.Exercise2;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];

 

 

 

    
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

 

 

 


        System.out.print("The minimum number is: " + min(number));
    }

 

 

 

    
    public static double min(double[] array) {
        double min = array[0];

 

        for (double i: array) {
            if (i < min)
                min = i;
        }
        return min;

 

    }

 

}