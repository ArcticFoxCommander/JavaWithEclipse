package unit4.Exercise2;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int count = 0;
        System.out.println("Enter a list of numbers: (type '0' to quit): ");
        while (true) {
            int input = scanner.nextInt();
            if (input > 0) {
                numbers[count] = input;
                count++;
            } else {
                break;
            }
        }
        scanner.close();
        product(numbers, count);
    }
    public static int product(int[] numbers, int count) {
        int product = 1;
        for (int i = 0; i < count; i++) {
            product *= numbers[i];
        }
        System.out.println("Product of numbers is " + product);
        return product;
    }
}