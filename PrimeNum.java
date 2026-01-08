// write a java program to prime number check without using function
/*
import java.util.Scanner;   
/*public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}*/
// optimize the above code
import java.util.Scanner;   
public class PrimeNum { 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();
        
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else if (num == 2) {
            System.out.println(num + " is a prime number.");
        } else if (num % 2 == 0) {
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        scanner.close();
    }
}