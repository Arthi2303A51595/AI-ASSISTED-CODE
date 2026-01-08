// write a java program to duplicate an array
import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        
        int[] duplicatedArray = duplicateArray(originalArray);
        
        System.out.println("Duplicated array: ");
        for (int i : duplicatedArray) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
    
    public static int[] duplicateArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}