package bank;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import bank.FeesCalculator;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FeesCalculatorWithdrawalTest {

	
	@Parameter(0)
	public int amount;

	@Parameter(1)
	public int accountBalance;

	@Parameter(2)
	public boolean student;

	@Parameter(3)
	public int dayOfWeek

	@Parameter(4)
	public float feePercentage; //expected

	public FeesCalculator feeCalculator;

	@Before
	public void initialize() {
		feeCalculator = new FeesCalculator();
	}

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


	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 

        {20, -1, true, Calendar.SATURDAY, calculateWithdrawlFee(20, -1, true, Calendar.SATURDAY)},
        {20, 0, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 0, true, Calendar.SATURDAY)},
        {20, 1, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 1, true, Calendar.SATURDAY)},
        {2000, 1200000, false, 2000 * 0.005f},
        {-500, 50000, false, 0},
        {130000, 50000, false, Math.round(130000 * 0.005f},
	{2000, -500, false, 0},
        {2000, 1600000, false, 2000 * 0.005f},
	{20, 500, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 500, true, Calendar.SATURDAY)},
	{20, 999, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 999, true, Calendar.SATURDAY)},
	{20, 1000, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 1000, true, Calendar.SATURDAY)},
	{20, 1001, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 1001, true, Calendar.SATURDAY)},
	{20, 5000, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 5000, true, Calendar.SATURDAY)},
	{20, 9999, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 9999, true, Calendar.SATURDAY)},
	{20, 10000, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 10000, true, Calendar.SATURDAY)},
	{20, 10001, true, Calendar.SATURDAY, calculateWithdrawlFee(20, 10001, true, Calendar.SATURDAY)},
	{20, -1, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, -1, true, Calendar.WEDNESDAY)},
	{20, 0, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 0, true, Calendar.WEDNESDAY)},
	{20, 1, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 1, true, Calendar.WEDNESDAY)},
	{20, 500, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 500, true, Calendar.WEDNESDAY)},
	{20, 999, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 999, true, Calendar.WEDNESDAY)},
	{20, 1000, true, Calendar.WEDNESDAY), calculateWithdrawlFee(20, 1000, true, Calendar.WEDNESDAY)},
	{20, 1001, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 1001, true, Calendar.WEDNESDAY)},
	{20, 5000, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 5000, true, Calendar.WEDNESDAY)},
	{20, 9999, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 9999, true, Calendar.WEDNESDAY)},
	{20, 10000, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 10000, true, Calendar.WEDNESDAY)},
	{20, 10001, true, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 10001, true, Calendar.WEDNESDAY)},
	{20, -1, true, Calendar.SUNDAY, calculateWithdrawlFee(20, -1, true, Calendar.SUNDAY)},
	{20, 0, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 0, true, Calendar.SUNDAY)},
	{20, 1, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 1, true, Calendar.SUNDAY)},
	{20, 500, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 500, true, Calendar.SUNDAY)},
	{20, 999, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 999, true, Calendar.SUNDAY)},
	{20, 1000, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 1000, true, Calendar.SUNDAY)},
	{20, 1001, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 1001, true, Calendar.SUNDAY)},
	{20, 5000, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 5000, true, Calendar.SUNDAY)},
	{20, 9999, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 9999, true, Calendar.SUNDAY)},
	{20, 10000, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 10000, true, Calendar.SUNDAY)},
	{20, 10001, true, Calendar.SUNDAY, calculateWithdrawlFee(20, 10001, true, Calendar.SUNDAY)},
	{20, -1, false, Calendar.SATURDAY, calculateWithdrawlFee(20, -1, false, Calendar.SATURDAY)},
	{20, 0, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 0, false, Calendar.SATURDAY)},
	{20, 1, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 1, false, Calendar.SATURDAY)},
	{20, 500, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 500, false, Calendar.SATURDAY)},
	{20, 999, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 999, false, Calendar.SATURDAY)},
	{20, 1000, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 1000, false, Calendar.SATURDAY)},
	{20, 1001, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 1001, false, Calendar.SATURDAY)},
	{20, 5000, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 5000, false, Calendar.SATURDAY)},
	{20, 9999, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 9999, false, Calendar.SATURDAY)},
	{20, 10000, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 10000, false, Calendar.SATURDAY)},
	{20, 10001, false, Calendar.SATURDAY, calculateWithdrawlFee(20, 10001, false, Calendar.SATURDAY)},
	{20, -1, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, -1, false, Calendar.WEDNESDAY)},
	{20, 0, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 0, false, Calendar.WEDNESDAY)},
	{20, 1, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 1, false, Calendar.WEDNESDAY)},
	{20, 500, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 500, false, Calendar.WEDNESDAY)},
	{20, 999, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 999, false, Calendar.WEDNESDAY)},
	{20, 1000, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 1000, false, Calendar.WEDNESDAY)},
	{20, 1001, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 1001, false, Calendar.WEDNESDAY)},
	{20, 5000, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 5000, false, Calendar.WEDNESDAY)},
	{20, 9999, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 9999, false, Calendar.WEDNESDAY)},
	{20, 10000, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 10000, false, Calendar.WEDNESDAY)},
	{20, 10001, false, Calendar.WEDNESDAY, calculateWithdrawlFee(20, 10001, false, Calendar.WEDNESDAY)},
	{20, -1, false, Calendar.SUNDAY, calculateWithdrawlFee(20, -1, false, Calendar.SUNDAY)},
	{20, 0, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 0, false, Calendar.SUNDAY)},
	{20, 1, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 1, false, Calendar.SUNDAY)},
	{20, 500, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 500, false, Calendar.SUNDAY)},
	{20, 999, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 999, false, Calendar.SUNDAY)},
	{20, 1000, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 1000, false, Calendar.SUNDAY)},
	{20, 1001, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 1001, false, Calendar.SUNDAY)},
	{20, 5000, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 5000, false, Calendar.SUNDAY)},
	{20, 9999, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 9999, false, Calendar.SUNDAY)},
	{20, 10000, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 10000, false, Calendar.SUNDAY)},
	{20, 10001, false, Calendar.SUNDAY, calculateWithdrawlFee(20, 10001, false, Calendar.SUNDAY)},
        });
    }
    
	@Test
    public void test() {
    	assertEquals(feePercentage, feeCalculator.calculateDepositInterest(amount, accountBalance, student), 0.5);
    }




	
	

