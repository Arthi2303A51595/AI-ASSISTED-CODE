// write a java program to reverse an array
import java.util.Scanner;  
public class ReverseArray {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of elements in the array: ");  
        int n = scanner.nextInt();  
        int[] array = new int[n];  
        
        System.out.println("Enter the elements of the array: ");  
        for (int i = 0; i < n; i++) {  
            array[i] = scanner.nextInt();  
        }  
        
        reverseArray(array);  
        
        System.out.println("Reversed array: ");  
        for (int i : array) {  
            System.out.print(i + " ");  
        }  
        
        scanner.close();  
    }  
    
    public static void reverseArray(int[] arr) {  
        int left = 0;  
        int right = arr.length - 1;  
        
        while (left < right) {  
            int temp = arr[left];  
            arr[left] = arr[right];  
            arr[right] = temp;  
            left++;  
            right--;  
        }  
    }  
}