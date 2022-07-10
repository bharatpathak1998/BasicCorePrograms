package basiccoreprograms;

import java.util.Scanner;

public class PrimeFactorsOfNumber {

    public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number for prime factorization : ");
        int number = sc.nextInt();
        
        for (int i = 2; i*i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        
        if (number > 2) {
            System.out.println(number);
        }
    }
}
