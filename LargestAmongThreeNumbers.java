package basiccoreprograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

    public static void main(String[] args) {
		
        Scanner sc =new Scanner(System.in);
	System.out.println("Enter the first number");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        
        if (a>b && a>c) {
            System.out.println("Largest number among three number is " + a);
        }
        else
        if (b>c) {
            System.out.println("Largest number among three number is " + b);
        }
        else
        {
            System.out.println("Largest number among three number is " + c);
        }

    }

}
