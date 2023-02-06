package SelectionControlStructure;


	import java.util.Scanner;

	public class LoanCalculator {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter account number: ");
	    int accountNumber = sc.nextInt();

	    System.out.print("Enter account balance: ");
	    double accountBalance = sc.nextDouble();

	    System.out.print("Enter salary: ");
	    double salary = sc.nextDouble();

	    System.out.print("Enter loan type (car/business/house): ");
	    String loanType = sc.next();

	    System.out.print("Enter expected loan amount: ");
	    double expectedLoanAmount = sc.nextDouble();

	    System.out.print("Enter expected number of EMIs: ");
	    int expectedEmis = sc.nextInt();

	    double eligibleLoanAmount = 0;
	    int eligibleEmis = 0;

	 
	    if (String.valueOf(accountNumber).length() != 4 || String.valueOf(accountNumber).charAt(0) != '1') {
	      System.out.println("Invalid account number. Account number should be 4 digits long and its first digit should be 1.");
	      return;
	    }

	 
	    if (accountBalance < 1000) {
	      System.out.println("Insufficient balance. Minimum balance should be $1000.");
	      return;
	    }

	 
	    switch (loanType) {
	      case "car":
	        eligibleLoanAmount = salary * 0.5;
	        eligibleEmis = 12;
	        break;
	      case "business":
	        eligibleLoanAmount = salary * 1.5;
	        eligibleEmis = 24;
	        break;
	      case "house":
	        eligibleLoanAmount = salary * 2;
	        eligibleEmis = 36;
	        break;
	      default:
	        System.out.println("Invalid loan type. Loan type should be car/business/house.");
	        return;
	    }

	 
	    if (expectedLoanAmount <= eligibleLoanAmount && expectedEmis <= eligibleEmis) {
	      System.out.println("Account number: " + accountNumber);
	      System.out.println("Eligible loan amount: $" + eligibleLoanAmount);
	      System.out.println("Requested loan amount: $" + expectedLoanAmount);
	      System.out.println("Eligible number of EMIs: " + eligibleEmis);
	      System.out.println("Requested number of EMIs: " + expectedEmis);
	    } else {
	      System.out.println("Bank would not provide loan. Loan amount or number of EMIs exceed eligible limit.");
	    }
	  }
	}


