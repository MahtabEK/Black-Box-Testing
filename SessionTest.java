package atm;


import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import banking.Money;
import banking.exceptions.InvalidAmountException;
import banking.exceptions.InvalidPINException;

public class SessionTest {
	int atmID;
	String atmPlace;
	String atmBankName;
	InetAddress atmBankAddress;
	ATM atmTest;
	int cardID;
	int transactionChoice;
	int from;
	int to;
	String pin;
	Money amount;
	
	
	
	
	public SessionTest() throws UnknownHostException {
		atmID = 538;
		atmPlace = "Wonderland Rd.";
		atmBankName = "Scotia Bank";
		atmBankAddress = InetAddress.getByName("127.0.0.1");
		atmTest = new ATM(atmID, atmPlace, atmBankName, atmBankAddress);
		atmTest.getCashDispenser().setInitialCash(new Money(5000));
		cardID = 123456;
		transactionChoice = 0;
		from = 1995;
		to = 1991;
	}
	
	
	@Test
	public void testExpectedException1() {
		Session sessionTest = new Session(atmTest, 12345, "1534", transactionChoice, from, to,  new Money(19));
		Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException2() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(20));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException3() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(21));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException4() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(500));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException5() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(999));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException6() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(1000));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException7() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(1001));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException8() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(40));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException9() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(50));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException10() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(60));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException11() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(70));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException12() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(80));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException13() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(90));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	
	@Test
	public void testExpectedException14() {
		Session sessionTest = new Session(atmTest, cardID, "1534", transactionChoice, from, to, new Money(100));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	/****************checking invalid pin: 3 digit pin*****************/
	
	@Test
	public void testExpectedException15() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to,  new Money(19));
		Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException16() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(20));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException17() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(21));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException18() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(500));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException19() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(999));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException20() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(1000));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException21() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(1001));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException22() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(40));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException23() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(50));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException24() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(60));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException25() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(70));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException26() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(80));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException27() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(90));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException28() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(100));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	/****************checking invalid pin: 5 digit pin*****************/
	
	@Test
	public void testExpectedException29() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to,  new Money(19));
		Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException30() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(20));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException31() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(21));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException32() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(500));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException33() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(999));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException34() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(1000));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException35() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(1001));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException36() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(40));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException37() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(50));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException38() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(60));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException39() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(70));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException40() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(80));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException41() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(90));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException42() {
		Session sessionTest = new Session(atmTest, cardID, "15346", transactionChoice, from, to, new Money(100));
	    Assertions.assertThrows(InvalidPINException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	/****************checking invalid (suppose it's valid) pin: 3 digit pin*****************/
	
	@Test
	public void testExpectedException43() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to,  new Money(19));
		Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException44() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(20));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException45() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(21));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException46() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(500));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException47() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(999));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException48() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(1000));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException49() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(1001));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}

	@Test
	public void testExpectedException50() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(40));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException51() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(50));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException52() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(60));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException53() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(70));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException54() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(80));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException55() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(90));
	    Assertions.assertThrows(InvalidAmountException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
	@Test
	public void testExpectedException56() {
		Session sessionTest = new Session(atmTest, cardID, "153", transactionChoice, from, to, new Money(100));
	    Assertions.assertThrows(NullPointerException.class, () -> {
		sessionTest.performSession();
	  });
	}
	
}
	



