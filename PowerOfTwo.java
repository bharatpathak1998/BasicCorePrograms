package basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
		
	System.out.println("Enter a number for power of 2 : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int num = 2;
        
        for (int i=1; i<number; i++)
        {
             num*= 2;
        }
        System.out.println(num);
    }
}