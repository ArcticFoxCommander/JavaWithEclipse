package unit4.Exercise2;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] newNumbers = eliminateDuplicates(numbers);
        System.out.println("The list with no duplicates is: ");
        for (int e : newNumbers) {
            if (e > 0) {
                System.out.print(" " + e);
            }
        }
    }
	
    public static int[] eliminateDuplicates(int[] list) {
        int[] newList = new int[list.length];
        int i = 0;
        for (int e : list) {
            if (linearSearch(newList, e) == -1) {
                newList[i] = e;
                i++;
            }
        }
        return newList;
    }
    
    public static int linearSearch(int[] newList, int list) {
        for (int i = 0; i < newList.length; i++) {
            if (list == newList[i])
                return i;
        }
        return -1;
    }
}