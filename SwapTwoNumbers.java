package basiccoreprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter a Number num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter a Number num2 :");
        int num2 = sc.nextInt();
        int temp;
        System.out.println("Number before swapping:" +num1+" "+num2);
      
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping:" +num1+" "+num2);

    }

}   
