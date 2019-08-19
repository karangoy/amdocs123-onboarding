package org.amdocs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class SavingAccountTest {

	@Test
	public void testWithdrawlWhenCurrentBalanceIs5000INR() {
		
		SavingAccount account = new SavingAccount();
		
		SavingAccount accountSpy = spy ( account );
		
		doReturn(5000.00).when (accountSpy).getBalance();
		doNothing().when(accountSpy ).updateBalanceIntoDB( anyDouble());
		
		double updatedBalance = accountSpy.withdraw( 1000.00);
		double expectedBalance = (4000.00);
		
		assertEquals (expectedBalance, updatedBalance, 0.0001 );
	
	verify(accountSpy, times(1)).getBalance();
	verify(accountSpy, times(1)).updateBalanceIntoDB( anyDouble());
	
	}

}
