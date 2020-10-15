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
class FeesCalculatorDepositTest {

	@Parameter(0)
	public int amount;
	@Parameter(1)
	public int accountBalance;
	@Parameter(2)
	public boolean student;
	@Parameter(3)
	public float feePercentage; //expected
	public FeesCalculator feeCalculator;

	
	@Before
	public void initialize() {
		feeCalculator = new FeesCalculator();
	}


	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 

            {2000, 50000, true, Math.round(2000 * 0.002f)},
            {15000, 300000, false, 0},
            {70000, 800000, false, Math.round(70000 * 0.01f)},
            {2000, 1200000, false, 2000 * 0.005f},
            {-500, 50000, false, 0},
            {130000, 50000, false, Math.round(130000 * 0.005f},
	    {2000, -500, false, 0},
            {2000, 1600000, false, 2000 * 0.005f},
        });
    }
    
	@Test
    public void test() {
    	assertEquals(feePercentage, feeCalculator.calculateDepositInterest(amount, accountBalance, student), 0.5);
    }