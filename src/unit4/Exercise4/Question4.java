package unit4.Exercise4;

import java.util.Scanner;



public class Question4 {

 

    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1: ");
        int n1 = input.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int n2 = input.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list2[i] = input.nextInt();
        }
        list1 = (selectionSort(list1));
        list2 = (selectionSort(list2));

 

        if (equals(list1, list2) == true) {
            System.out.println("Two lists are identical");
        } else
            System.out.println("Two lists are not identical");

 

    }

 

    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

 

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }

 

    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list2[i] == list1[i])
                continue;
            else
                return false;
        }
        return true;
    }
}