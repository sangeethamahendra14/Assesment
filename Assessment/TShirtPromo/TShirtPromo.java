package CricketTournamentPromo;

import java.util.Scanner;

public class TShirtPromo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] prices = {200, 250, 300};
	        int[] cart = new int[3];
	        int totalCost = 0;
	        int discount = 0;
	        int finalAmount;
	        
	       
	        System.out.println("Enter the number of round-neck T-Shirts in cart: ");
	        cart[0] = sc.nextInt();
	        System.out.println("Enter the number of collared T-Shirts in cart: ");
	        cart[1] = sc.nextInt();
	        System.out.println("Enter the number of hooded T-Shirts in cart: ");
	        cart[2] = sc.nextInt();
	        
	     
	        for (int i = 0; i < 3; i++) {
	            totalCost += cart[i] * prices[i];
	        }
	        System.out.println("Total cost: " + totalCost + " Rs.");
	        
	        
	        int totalTShirts = cart[0] + cart[1] + cart[2];
	        if (totalTShirts < 5) {
	            discount = 0;
	        } else if (totalTShirts >= 5 && totalTShirts <= 10) {
	            discount = 10;
	        } else if (totalTShirts > 10) {
	            discount = 20;
	        }
	        System.out.println("Discount: " + discount + " %");
	        
	    
	        finalAmount = totalCost - (totalCost * (discount / 100));
	        System.out.println("Final amount: " + finalAmount + " Rs.");
	    }
	}


