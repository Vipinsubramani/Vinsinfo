package sample;
import java.util.Scanner;

public class DupilcateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Duplicate numbers are:");
        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;

            // check if this number was already printed before
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            // if not already printed, check for duplicates ahead
            if (!alreadyPrinted) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        System.out.println(array[i]);
                        break; // print only once
                    }
                }
            }
        }
    }
}
