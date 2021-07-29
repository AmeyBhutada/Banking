package banking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
	
		@Test
		void test2()
		{
			System.out.println("Creating SavingsAccount object...");
			SavingsAccount sa = new SavingsAccount();
			assertNotNull(sa); //not null means some value has to be there
			System.out.println("SavingsAccount created...");
			System.out.println("------------------");
		}
		
		//Bus booking project - 45 test cases 
		
		@Test
		void test1()
		{ //A -> B -> C
			System.out.println("Creating SavingsAccount object...");
			double  currentBalance = 50000;
			SavingsAccount sa = new SavingsAccount(101,"Jack",currentBalance);
		assertNotNull(sa); //not null means some value has to be there
			System.out.println("SavingsAccount created...");
			System.out.println("invoking withdraw ......");
			double amountToWithdraw=-3000;
			sa.withdraw(amountToWithdraw);
			//assertEquals( 47000 , currentBalance-amountToWithdraw);
		assertEquals(currentBalance-amountToWithdraw,sa.getBalance());
			System.out.println("withdraw over......");
			System.out.println("------------------");
		}
}
