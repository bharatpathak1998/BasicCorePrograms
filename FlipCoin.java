package basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many times do you want to flip coin : ");
	int numOffFlips = sc.nextInt();
        int tailCount = 0;
        int headCount = 0;
        
        for(int i=1;i<=numOffFlips;i++) 
        {
        double random = Math.random();
            
        if (random< 0.5) {
        	tailCount++;         
        }
        else
        {
        	headCount++;    
        }
        }
        System.out.println("Num of Head is " +headCount);
	System.out.println("Num of Tail is " +tailCount);
	double perhead = (headCount*100)/numOffFlips;
	double pertail=(tailCount*100)/numOffFlips;

	System.out.println(perhead);
	System.out.println(pertail);
    }
}