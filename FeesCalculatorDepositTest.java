package bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FeesCalculatorDepositTest {

	@Test
	public void test() {
		FeesCalculator feesCalculator = new FeesCalculator();
		int amt[] = {2000, 15000, 70000}; //deposit amount
		int amt_i[] = {-500, 130000};
		int bal[] = {50000, 300000, 800000, 1200000}; //account balance
		int bal_i[] = {-500, 1600000};
		
		int actual1 = feesCalculator.calculateDepositInterest(amt[0], bal[0], true);
		int expect1 = Math.round(amt[0] * 0.002f);; //fee is 0.2% in the source code
		
		int actual2 = feesCalculator.calculateDepositInterest(amt[1], bal[1], false);
		int expect2 = 0;
		
		int actual3 = feesCalculator.calculateDepositInterest(amt[2], bal[2], false);
		int expect3 = Math.round(amt[2] * 0.01f);
		
		int actual4 = feesCalculator.calculateDepositInterest(amt[0], bal[3], false);
		int expect4 = Math.round(amt[0] * 0.005f);
		
		//no testing for invalid inputs in source
		int actual5 = feesCalculator.calculateDepositInterest(amt_i[0], bal[0], false);
		int expect5 = 0;
		
		int actual6 = feesCalculator.calculateDepositInterest(amt_i[1], bal[0], false);
		int expect6 = Math.round(amt_i[1] * 0.005f);
		
		int actual7 = feesCalculator.calculateDepositInterest(amt[0], bal_i[0], false);
		int expect7 = 0;
		
		int actual8 = feesCalculator.calculateDepositInterest(amt[0], bal_i[1], false);
		int expect8 = Math.round(amt[0] * 0.005f);
		
		assertEquals(expect1, actual1);
		assertEquals(expect2, actual2);
		assertEquals(expect3, actual3);
		assertEquals(expect4, actual4);
		assertEquals(expect5, actual5);
		assertEquals(expect6, actual6);
		assertEquals(expect7, actual7);
		assertEquals(expect8, actual8);
		
	}

}
