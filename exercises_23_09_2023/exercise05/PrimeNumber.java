package exercises_23_09_2023.exercise05;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type an integer number: ");
        
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            
            if (number <= 1) {
                System.out.println(number + " is not a prime number.");
            } else if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } else {
            System.out.println("Error!! Not an integer number.");
        }
        scan.close();

    }

    // Função para verificar se um número é primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}