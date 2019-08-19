package org.amdocs;

public class SavingAccount {

	public double getBalance() {
		System.out.println("account balnced retriiev from aacount");
		return 7000.00;
		}
	
	public double withdraw(double amountToBeWithdrawn ) {
		System.out.println("inside 3 withdrw method");
		
		double currentBalance = getBalance();
		
		if(amountToBeWithdrawn < currentBalance )
			currentBalance = currentBalance - amountToBeWithdrawn;
		
		updateBalanceIntoDB(currentBalance);
		
		return(currentBalance);
}
	public void updateBalanceIntoDB(double currentBalance) {
		System.out.println("Assume here balance is updated");
	}
}
