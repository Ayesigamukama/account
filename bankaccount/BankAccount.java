package bankaccount;
import java.util.Scanner;

public class BankAccount {
	private double balance;
// constructor
	public static void main(String accountNumber,double balance[] ) {
	this .accountNumber=accountNumber;
		This balance=balance;

	}
    // Method to deposit money public 
	public void desposit(double amount) {
		if (amount>0) {
			balance +=amount;
			
			System.out.println("Deposited:$"+amount);
		}else {
			System.out.println("Invalid amount");
		}
	}

     // Method to withdraw money
    public void withdraw (double amount) {
    	if(amount>0 && amount <= balance) {
    		balance -=amount;
    		
    		System.out.println("Insufficient funds or invalid amount");
    	}
    }
           //        method to check balance
       public void checkBalance() {
    	   
    	   System.out.println("current Balance");
       }
       }
 public class Main{
	       Public static void main(string[] args) {
	    	   Scanner scanner=new Scanner(System.ln);
	    	   BankAccount account= new BankAccount("123456789,500.0");
             // Initial account
	    	   boolean exit=false;
	    	   while(!exit) {
	    		   
	    		   System.out.println("\nchoose an option");
	    		   System.out.println("1.Deposit");
	    		   System.out.println("2.withdraw");
	    		   System.out.println("3.check balance");
	    		   System.out.println("4.Exit");
	    		        int choice=
	    			scanner. nextInt();
	    		        switch (choice) {
	    		        case 1:
	    		        	System.out.print("Enter deposit amount:");
	    		        	                    double
	    		    depositAmount =
	    		    scanner.nextDouble();
	    		    
	    		        account.withdraw(withdrawAmount);
	    		                             break;
	    		        case 3:
	    		        	account.checkBalance();
	    		                            break;
	    		        case 4:
	    		        	exit=
	    		        	true;
	    		        	
	    		    System.out.println("Exiting.Goodbye!")  ;
	    		                    break;
	    		                    default:
	    		   System.out.println("Invalid choice.please try again.") ;
	    		        }
	    	   }
	    	   scanner.close();
	       }
	  
	    		                    	
	    		    
	    		    
	    		    
	    		        	                    
	    		        	                    
	    		        	                    
	    		        	                    
	    	   
	       }
	       
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       