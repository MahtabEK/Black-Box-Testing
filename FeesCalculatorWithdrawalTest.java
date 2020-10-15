package bank;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import bank.FeesCalculator;

public class FeesCalculatorWithdrawalTest {
	
	private int calculateWithdrawlFee(int amount, int accountBalance, Boolean student, int dayOfWeek) {
		float feePercentage = 0;
		
		//Student
		if(student == true) {
			//Weekday
			if(dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {		
				feePercentage = 0.0f;
			}
			//Weekend
			else{ 
				feePercentage = 0.001f;
			}
			
		}
		//Not student
		else {
			//balance less than 1,000
			if(accountBalance < 1000){
				feePercentage = 0.002f;
				
			}
			//balance between 1,000 and 10,000
			else if(accountBalance > 1000 && accountBalance < 10000) {
				feePercentage = 0.001f;
				
			}
			//balance > 10,000
			else{
				feePercentage = 0.0f;
			}
			
		}
		// Calculate fee
		int fee = Math.round(amount * feePercentage);
		
		return fee;
	}
	
	@Test
	public void test() {
		
		FeesCalculator feeCalculator = new FeesCalculator();
		
		int actualFee1 = feeCalculator.calculateWithdrawalFee(20, -1, true, Calendar.SATURDAY);
		int expectedFee1 = calculateWithdrawlFee(20, -1, true, Calendar.SATURDAY);
		
		int actualFee2 = feeCalculator.calculateWithdrawalFee(20, 0, true, Calendar.SATURDAY);
		int expectedFee2 = calculateWithdrawlFee(20, 0, true, Calendar.SATURDAY);
		
		int actualFee3 = feeCalculator.calculateWithdrawalFee(20, 1, true, Calendar.SATURDAY);
		int expectedFee3 = calculateWithdrawlFee(20, 1, true, Calendar.SATURDAY);
		
		int actualFee4 = feeCalculator.calculateWithdrawalFee(20, 500, true, Calendar.SATURDAY);
		int expectedFee4 = calculateWithdrawlFee(20, 500, true, Calendar.SATURDAY);
		
		int actualFee5 = feeCalculator.calculateWithdrawalFee(20, 999, true, Calendar.SATURDAY);
		int expectedFee5 = calculateWithdrawlFee(20, 999, true, Calendar.SATURDAY);
		
		int actualFee6 = feeCalculator.calculateWithdrawalFee(20, 1000, true, Calendar.SATURDAY);
		int expectedFee6 = calculateWithdrawlFee(20, 1000, true, Calendar.SATURDAY);
		
		int actualFee7 = feeCalculator.calculateWithdrawalFee(20, 1001, true, Calendar.SATURDAY);
		int expectedFee7 = calculateWithdrawlFee(20, 1001, true, Calendar.SATURDAY);
		
		int actualFee8 = feeCalculator.calculateWithdrawalFee(20, 5000, true, Calendar.SATURDAY);
		int expectedFee8 = calculateWithdrawlFee(20, 5000, true, Calendar.SATURDAY);
		
		int actualFee9 = feeCalculator.calculateWithdrawalFee(20, 9999, true, Calendar.SATURDAY);
		int expectedFee9 = calculateWithdrawlFee(20, 9999, true, Calendar.SATURDAY);
		
		int actualFee10 = feeCalculator.calculateWithdrawalFee(20, 10000, true, Calendar.SATURDAY);
		int expectedFee10 = calculateWithdrawlFee(20, 10000, true, Calendar.SATURDAY);
		
		int actualFee11 = feeCalculator.calculateWithdrawalFee(20, 10001, true, Calendar.SATURDAY);
		int expectedFee11 = calculateWithdrawlFee(20, 10001, true, Calendar.SATURDAY);

		int actualFee12 = feeCalculator.calculateWithdrawalFee(20, -1, true, Calendar.WEDNESDAY);
		int expectedFee12 = calculateWithdrawlFee(20, -1, true, Calendar.WEDNESDAY);
		
		int actualFee13 = feeCalculator.calculateWithdrawalFee(20, 0, true, Calendar.WEDNESDAY);
		int expectedFee13 = calculateWithdrawlFee(20, 0, true, Calendar.WEDNESDAY);
		
		int actualFee14 = feeCalculator.calculateWithdrawalFee(20, 1, true, Calendar.WEDNESDAY);
		int expectedFee14 = calculateWithdrawlFee(20, 1, true, Calendar.WEDNESDAY);
		
		int actualFee15 = feeCalculator.calculateWithdrawalFee(20, 500, true, Calendar.WEDNESDAY);
		int expectedFee15 = calculateWithdrawlFee(20, 500, true, Calendar.WEDNESDAY);
		
		int actualFee16 = feeCalculator.calculateWithdrawalFee(20, 999, true, Calendar.WEDNESDAY);
		int expectedFee16 = calculateWithdrawlFee(20, 999, true, Calendar.WEDNESDAY);
		
		int actualFee17 = feeCalculator.calculateWithdrawalFee(20, 1000, true, Calendar.WEDNESDAY);
		int expectedFee17 = calculateWithdrawlFee(20, 1000, true, Calendar.WEDNESDAY);
		
		int actualFee18 = feeCalculator.calculateWithdrawalFee(20, 1001, true, Calendar.WEDNESDAY);
		int expectedFee18 = calculateWithdrawlFee(20, 1001, true, Calendar.WEDNESDAY);
		
		int actualFee19 = feeCalculator.calculateWithdrawalFee(20, 5000, true, Calendar.WEDNESDAY);
		int expectedFee19 = calculateWithdrawlFee(20, 5000, true, Calendar.WEDNESDAY);
		
		int actualFee20 = feeCalculator.calculateWithdrawalFee(20, 9999, true, Calendar.WEDNESDAY);
		int expectedFee20 = calculateWithdrawlFee(20, 9999, true, Calendar.WEDNESDAY);
		
		int actualFee21 = feeCalculator.calculateWithdrawalFee(20, 10000, true, Calendar.WEDNESDAY);
		int expectedFee21 = calculateWithdrawlFee(20, 10000, true, Calendar.WEDNESDAY);
		
		int actualFee22 = feeCalculator.calculateWithdrawalFee(20, 10001, true, Calendar.WEDNESDAY);
		int expectedFee22 = calculateWithdrawlFee(20, 10001, true, Calendar.WEDNESDAY);

		int actualFee23 = feeCalculator.calculateWithdrawalFee(20, -1, true, Calendar.SUNDAY);
		int expectedFee23 = calculateWithdrawlFee(20, -1, true, Calendar.SUNDAY);
		
		int actualFee24 = feeCalculator.calculateWithdrawalFee(20, 0, true, Calendar.SUNDAY);
		int expectedFee24 = calculateWithdrawlFee(20, 0, true, Calendar.SUNDAY);
		
		int actualFee25 = feeCalculator.calculateWithdrawalFee(20, 1, true, Calendar.SUNDAY);
		int expectedFee25 = calculateWithdrawlFee(20, 1, true, Calendar.SUNDAY);
		
		int actualFee26 = feeCalculator.calculateWithdrawalFee(20, 500, true, Calendar.SUNDAY);
		int expectedFee26 = calculateWithdrawlFee(20, 500, true, Calendar.SUNDAY);
		
		int actualFee27 = feeCalculator.calculateWithdrawalFee(20, 999, true, Calendar.SUNDAY);
		int expectedFee27 = calculateWithdrawlFee(20, 999, true, Calendar.SUNDAY);
		
		int actualFee28 = feeCalculator.calculateWithdrawalFee(20, 1000, true, Calendar.SUNDAY);
		int expectedFee28 = calculateWithdrawlFee(20, 1000, true, Calendar.SUNDAY);
		
		int actualFee29 = feeCalculator.calculateWithdrawalFee(20, 1001, true, Calendar.SUNDAY);
		int expectedFee29 = calculateWithdrawlFee(20, 1001, true, Calendar.SUNDAY);
		
		int actualFee30 = feeCalculator.calculateWithdrawalFee(20, 5000, true, Calendar.SUNDAY);
		int expectedFee30 = calculateWithdrawlFee(20, 5000, true, Calendar.SUNDAY);
		
		int actualFee31 = feeCalculator.calculateWithdrawalFee(20, 9999, true, Calendar.SUNDAY);
		int expectedFee31 = calculateWithdrawlFee(20, 9999, true, Calendar.SUNDAY);
		
		int actualFee32 = feeCalculator.calculateWithdrawalFee(20, 10000, true, Calendar.SUNDAY);
		int expectedFee32 = calculateWithdrawlFee(20, 10000, true, Calendar.SUNDAY);
		
		int actualFee33 = feeCalculator.calculateWithdrawalFee(20, 10001, true, Calendar.SUNDAY);
		int expectedFee33 = calculateWithdrawlFee(20, 10001, true, Calendar.SUNDAY);
		
		int actualFee34 = feeCalculator.calculateWithdrawalFee(20, -1, false, Calendar.SATURDAY);
		int expectedFee34 = calculateWithdrawlFee(20, -1, false, Calendar.SATURDAY);
		
		int actualFee35 = feeCalculator.calculateWithdrawalFee(20, 0, false, Calendar.SATURDAY);
		int expectedFee35 = calculateWithdrawlFee(20, 0, false, Calendar.SATURDAY);
		
		int actualFee36 = feeCalculator.calculateWithdrawalFee(20, 1, false, Calendar.SATURDAY);
		int expectedFee36 = calculateWithdrawlFee(20, 1, false, Calendar.SATURDAY);
		
		int actualFee37 = feeCalculator.calculateWithdrawalFee(20, 500, false, Calendar.SATURDAY);
		int expectedFee37 = calculateWithdrawlFee(20, 500, false, Calendar.SATURDAY);
		
		int actualFee38 = feeCalculator.calculateWithdrawalFee(20, 999, false, Calendar.SATURDAY);
		int expectedFee38 = calculateWithdrawlFee(20, 999, false, Calendar.SATURDAY);
		
		int actualFee39 = feeCalculator.calculateWithdrawalFee(20, 1000, false, Calendar.SATURDAY);
		int expectedFee39 = calculateWithdrawlFee(20, 1000, false, Calendar.SATURDAY);
		
		int actualFee40 = feeCalculator.calculateWithdrawalFee(20, 1001, false, Calendar.SATURDAY);
		int expectedFee40 = calculateWithdrawlFee(20, 1001, false, Calendar.SATURDAY);
		
		int actualFee41 = feeCalculator.calculateWithdrawalFee(20, 5000, false, Calendar.SATURDAY);
		int expectedFee41 = calculateWithdrawlFee(20, 5000, false, Calendar.SATURDAY);
		
		int actualFee42 = feeCalculator.calculateWithdrawalFee(20, 9999, false, Calendar.SATURDAY);
		int expectedFee42 = calculateWithdrawlFee(20, 9999, false, Calendar.SATURDAY);
		
		int actualFee43 = feeCalculator.calculateWithdrawalFee(20, 10000, false, Calendar.SATURDAY);
		int expectedFee43 = calculateWithdrawlFee(20, 10000, false, Calendar.SATURDAY);
		
		int actualFee44 = feeCalculator.calculateWithdrawalFee(20, 10001, false, Calendar.SATURDAY);
		int expectedFee44 = calculateWithdrawlFee(20, 10001, false, Calendar.SATURDAY);
		
		int actualFee45 = feeCalculator.calculateWithdrawalFee(20, -1, false, Calendar.WEDNESDAY);
		int expectedFee45 = calculateWithdrawlFee(20, -1, false, Calendar.WEDNESDAY);
		
		int actualFee46 = feeCalculator.calculateWithdrawalFee(20, 0, false, Calendar.WEDNESDAY);
		int expectedFee46 = calculateWithdrawlFee(20, 0, false, Calendar.WEDNESDAY);
		
		int actualFee47 = feeCalculator.calculateWithdrawalFee(20, 1, false, Calendar.WEDNESDAY);
		int expectedFee47 = calculateWithdrawlFee(20, 1, false, Calendar.WEDNESDAY);
		
		int actualFee48 = feeCalculator.calculateWithdrawalFee(20, 500, false, Calendar.WEDNESDAY);
		int expectedFee48 = calculateWithdrawlFee(20, 500, false, Calendar.WEDNESDAY);
		
		int actualFee49 = feeCalculator.calculateWithdrawalFee(20, 999, false, Calendar.WEDNESDAY);
		int expectedFee49 = calculateWithdrawlFee(20, 999, false, Calendar.WEDNESDAY);
		
		int actualFee50 = feeCalculator.calculateWithdrawalFee(20, 1000, false, Calendar.WEDNESDAY);
		int expectedFee50 = calculateWithdrawlFee(20, 1000, false, Calendar.WEDNESDAY);
		
		int actualFee51 = feeCalculator.calculateWithdrawalFee(20, 1001, false, Calendar.WEDNESDAY);
		int expectedFee51 = calculateWithdrawlFee(20, 1001, false, Calendar.WEDNESDAY);
		
		int actualFee52 = feeCalculator.calculateWithdrawalFee(20, 5000, false, Calendar.WEDNESDAY);
		int expectedFee52 = calculateWithdrawlFee(20, 5000, false, Calendar.WEDNESDAY);
		
		int actualFee53 = feeCalculator.calculateWithdrawalFee(20, 9999, false, Calendar.WEDNESDAY);
		int expectedFee53 = calculateWithdrawlFee(20, 9999, false, Calendar.WEDNESDAY);
		
		int actualFee54 = feeCalculator.calculateWithdrawalFee(20, 10000, false, Calendar.WEDNESDAY);
		int expectedFee54 = calculateWithdrawlFee(20, 10000, false, Calendar.WEDNESDAY);
		
		int actualFee55 = feeCalculator.calculateWithdrawalFee(20, 10001, false, Calendar.WEDNESDAY);
		int expectedFee55 = calculateWithdrawlFee(20, 10001, false, Calendar.WEDNESDAY);
		
		int actualFee56 = feeCalculator.calculateWithdrawalFee(20, -1, false, Calendar.SUNDAY);
		int expectedFee56 = calculateWithdrawlFee(20, -1, false, Calendar.SUNDAY);
		
		int actualFee57 = feeCalculator.calculateWithdrawalFee(20, 0, false, Calendar.SUNDAY);
		int expectedFee57 = calculateWithdrawlFee(20, 0, false, Calendar.SUNDAY);
		
		int actualFee58 = feeCalculator.calculateWithdrawalFee(20, 1, false, Calendar.SUNDAY);
		int expectedFee58 = calculateWithdrawlFee(20, 1, false, Calendar.SUNDAY);
		
		int actualFee59 = feeCalculator.calculateWithdrawalFee(20, 500, false, Calendar.SUNDAY);
		int expectedFee59 = calculateWithdrawlFee(20, 500, false, Calendar.SUNDAY);
		
		int actualFee60 = feeCalculator.calculateWithdrawalFee(20, 999, false, Calendar.SUNDAY);
		int expectedFee60 = calculateWithdrawlFee(20, 999, false, Calendar.SUNDAY);
		
		int actualFee61 = feeCalculator.calculateWithdrawalFee(20, 1000, false, Calendar.SUNDAY);
		int expectedFee61 = calculateWithdrawlFee(20, 1000, false, Calendar.SUNDAY);
		
		int actualFee62 = feeCalculator.calculateWithdrawalFee(20, 1001, false, Calendar.SUNDAY);
		int expectedFee62 = calculateWithdrawlFee(20, 1001, false, Calendar.SUNDAY);
		
		int actualFee63 = feeCalculator.calculateWithdrawalFee(20, 5000, false, Calendar.SUNDAY);
		int expectedFee63 = calculateWithdrawlFee(20, 5000, false, Calendar.SUNDAY);
		
		int actualFee64 = feeCalculator.calculateWithdrawalFee(20, 9999, false, Calendar.SUNDAY);
		int expectedFee64 = calculateWithdrawlFee(20, 9999, false, Calendar.SUNDAY);
		
		int actualFee65 = feeCalculator.calculateWithdrawalFee(20, 10000, false, Calendar.SUNDAY);
		int expectedFee65 = calculateWithdrawlFee(20, 10000, false, Calendar.SUNDAY);
		
		int actualFee66 = feeCalculator.calculateWithdrawalFee(20, 10001, false, Calendar.SUNDAY);
		int expectedFee66 = calculateWithdrawlFee(20, 10001, false, Calendar.SUNDAY);
		
		
		assertEquals(expectedFee1, actualFee1);
		assertEquals(expectedFee2, actualFee2);
		assertEquals(expectedFee3, actualFee3);
		assertEquals(expectedFee4, actualFee4);
		assertEquals(expectedFee5, actualFee5);
		assertEquals(expectedFee6, actualFee6);
		assertEquals(expectedFee7, actualFee7);
		assertEquals(expectedFee8, actualFee8);
		assertEquals(expectedFee9, actualFee9);
		assertEquals(expectedFee10, actualFee10);
		assertEquals(expectedFee11, actualFee11);
		assertEquals(expectedFee12, actualFee12);
		assertEquals(expectedFee13, actualFee13);
		assertEquals(expectedFee14, actualFee14);
		assertEquals(expectedFee15, actualFee15);
		assertEquals(expectedFee16, actualFee16);
		assertEquals(expectedFee17, actualFee17);
		assertEquals(expectedFee18, actualFee18);
		assertEquals(expectedFee19, actualFee19);
		assertEquals(expectedFee20, actualFee20);
		assertEquals(expectedFee21, actualFee21);
		assertEquals(expectedFee22, actualFee22);
		assertEquals(expectedFee23, actualFee23);
		assertEquals(expectedFee24, actualFee24);
		assertEquals(expectedFee25, actualFee25);
		assertEquals(expectedFee26, actualFee26);
		assertEquals(expectedFee27, actualFee27);
		assertEquals(expectedFee28, actualFee28);
		assertEquals(expectedFee29, actualFee29);
		assertEquals(expectedFee30, actualFee30);
		assertEquals(expectedFee31, actualFee31);
		assertEquals(expectedFee32, actualFee32);
		assertEquals(expectedFee33, actualFee33);
		assertEquals(expectedFee34, actualFee34);
		assertEquals(expectedFee35, actualFee35);
		assertEquals(expectedFee36, actualFee36);
		assertEquals(expectedFee37, actualFee37);
		assertEquals(expectedFee38, actualFee38);
		assertEquals(expectedFee39, actualFee39);
		assertEquals(expectedFee40, actualFee40);
		assertEquals(expectedFee41, actualFee41);
		assertEquals(expectedFee42, actualFee42);
		assertEquals(expectedFee43, actualFee43);
		assertEquals(expectedFee44, actualFee44);
		assertEquals(expectedFee45, actualFee45);
		assertEquals(expectedFee46, actualFee46);
		assertEquals(expectedFee47, actualFee47);
		assertEquals(expectedFee48, actualFee48);
		assertEquals(expectedFee49, actualFee49);
		assertEquals(expectedFee50, actualFee50);
		assertEquals(expectedFee51, actualFee51);
		assertEquals(expectedFee52, actualFee52);
		assertEquals(expectedFee53, actualFee53);
		assertEquals(expectedFee54, actualFee54);
		assertEquals(expectedFee55, actualFee55);
		assertEquals(expectedFee56, actualFee56);
		assertEquals(expectedFee57, actualFee57);
		assertEquals(expectedFee58, actualFee58);
		assertEquals(expectedFee59, actualFee59);
		assertEquals(expectedFee60, actualFee60);
		assertEquals(expectedFee61, actualFee61);
		assertEquals(expectedFee62, actualFee62);
		assertEquals(expectedFee63, actualFee63);
		assertEquals(expectedFee64, actualFee64);
		assertEquals(expectedFee65, actualFee65);
		assertEquals(expectedFee66, actualFee66);
	
	}
}


		

