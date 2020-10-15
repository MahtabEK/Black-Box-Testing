package bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class FeesCalculatorTransferTest {

	@Test
	public void test() {
		FeesCalculator feeCalculator = new FeesCalculator();
		float actualFee1 = feeCalculator.calculateTransferFee(9000, 90000, 90000, true);
		float expectedFee1 = 9000 * 0.001f;
		
		float actualFee2 = feeCalculator.calculateTransferFee(9000, 90000, 100000, true);
		float expectedFee2 = 9000 * 0.0005f;
		
		float actualFee3 = feeCalculator.calculateTransferFee(9000, 100000, 90000, true);
		float expectedFee3 = 9000 * 0.005f;
		
		float actualFee4 = feeCalculator.calculateTransferFee(9000, 100000, 100000, true);
		float expectedFee4 = 9000 * 0.0025f;
		
		float actualFee5 = feeCalculator.calculateTransferFee(10000, 90000, 90000, true);
		float expectedFee5 = 10000 * 0.0005f;
		
		float actualFee6 = feeCalculator.calculateTransferFee(10000, 90000, 100000, true);
		float expectedFee6 = 10000 * 0.00025f;
		
		float actualFee7 = feeCalculator.calculateTransferFee(10000, 100000, 90000, true);
		float expectedFee7 = 10000 * 0.0025f;
		
		float actualFee8 = feeCalculator.calculateTransferFee(10000, 100000, 100000, true);
		float expectedFee8 = 10000 * 0.00125f;
		
		float actualFee9 = feeCalculator.calculateTransferFee(9000, 90000, 90000, false);
		float expectedFee9 = 9000 * 0.002f;
		
		float actualFee10 = feeCalculator.calculateTransferFee(9000, 90000, 100000, false);
		float expectedFee10 = 9000 * 0.001f;
		
		float actualFee11 = feeCalculator.calculateTransferFee(9000, 100000, 90000, false);
		float expectedFee11 = 9000 * 0.01f;
		
		float actualFee12 = feeCalculator.calculateTransferFee(9000, 100000, 100000, false);
		float expectedFee12 = 9000 * 0.005f;
		
		float actualFee13 = feeCalculator.calculateTransferFee(10000, 90000, 90000, false);
		float expectedFee13 = 10000 * 0.001f;
		
		float actualFee14 = feeCalculator.calculateTransferFee(10000, 90000, 100000, false);
		float expectedFee14 = 10000 * 0.0005f;
		
		float actualFee15 = feeCalculator.calculateTransferFee(10000, 100000, 90000, false);
		float expectedFee15 = 10000 * 0.005f;
		
		float actualFee16 = feeCalculator.calculateTransferFee(10000, 100000, 100000, false);
		float expectedFee16 = 10000 * 0.0025f;
		
		assertEquals(expectedFee1, actualFee1, 0.5);
		assertEquals(expectedFee2, actualFee2, 0.5);
		assertEquals(expectedFee3, actualFee3, 0.5);
		assertEquals(expectedFee4, actualFee4, 0.5);
		assertEquals(expectedFee5, actualFee5, 0.5);
		assertEquals(expectedFee6, actualFee6, 0.5);
		assertEquals(expectedFee7, actualFee7, 0.5);
		assertEquals(expectedFee8, actualFee8, 0.5);
		assertEquals(expectedFee9, actualFee9, 0.5);
		assertEquals(expectedFee10, actualFee10, 0.5);
		assertEquals(expectedFee11, actualFee11, 0.5);
		assertEquals(expectedFee12, actualFee12, 0.5);
		assertEquals(expectedFee13, actualFee13, 0.5);
		assertEquals(expectedFee14, actualFee14, 0.5);
		assertEquals(expectedFee15, actualFee15, 0.5);
		assertEquals(expectedFee16, actualFee16, 0.5);	
	}
}
