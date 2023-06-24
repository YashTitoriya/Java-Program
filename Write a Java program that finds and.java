Write a Java program that finds and displays the maximum number in an array of integers along with its position/index. However, if there are multiple occurrences of the maximum number, your program should display the position/index of the first occurrence only.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] num = new int[size];

        System.out.println("Enter the values of the array elements:");
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }

        int maxNumber = num[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (num[i] > maxNumber) {
                maxNumber = num[i];
                maxIndex = i;
            }
        }

        System.out.println("\nMaximum Number: " + maxNumber);
        System.out.println("Position of First Occurrence: " + maxIndex );

    }
}
