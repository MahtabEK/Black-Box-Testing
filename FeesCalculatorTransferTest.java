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
public class FeesCalculatorTransferTest {

	@Parameter(0)
	public int amount;

	@Parameter(1)
	public int fromAccountBalance;

	@Parameter(2)
	public int toAccountBalance;

	@Parameter(3);
	public boolean student;

	@Parameter(4)
	public float feePercentage; //expected

	public FeesCalculator feeCalculator;

	
	@Before
	public void initialize() {
		feeCalculator = new FeesCalculator();
	}


	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 

            {9000, 90000, 90000, true, 9000 * 0.001f},
            {9000, 90000, 100000, true, 9000 * 0.005f},
            {9000, 100000, 90000, true, 9000 * 0.005f},
            {9000, 100000, 100000, true, 9000 * 0.0025f},
            {10000, 90000, 90000, true, 10000 * 0.0005f},
            {10000, 90000, 100000, true, 10000 * 0.00025f},
	    {10000, 100000, 90000, true, 10000 * 0.0025f},
            {10000, 100000, 100000, true, 10000 * 0.00125f},
	    {9000, 90000, 90000, false, 9000 * 0.002f},
            {9000, 90000, 100000, false, 9000 * 0.001f},
	    {9000, 100000, 90000, false, 9000 * 0.01f},
	    {9000, 100000, 100000, false, 9000 * 0.005f},
	    {10000, 90000, 90000, false, 10000 * 0.001f},
            {10000, 90000, 100000, false, 10000 * 0.0005f},
	    {10000, 100000, 90000, false, 10000 * 0.005f},
	    {10000, 100000, 100000, false, 10000 * 0.0025f},
        });
    }
    
	@Test
    public void test() {
    	assertEquals(feePercentage, feeCalculator.calculateDepositInterest(amount, accountBalance, student), 0.5);
    }


	