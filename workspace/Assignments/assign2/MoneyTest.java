package assign2;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMonwy1() {
		Money moneyObj = new Money(7, 33);
		assertEquals ("$7.33", moneyObj.toString());
		moneyObj = new Money (3, 55);
		assertEquals ("$3.55", moneyObj.toString ());
	}

	@Test
	public void testMoney2() {
		Money moneyObj = new Money(7, 33);
		Money moneyObj2 = new Money (moneyObj);
		assertEquals ("$7.33", moneyObj2.toString());
		moneyObj2 = new Money (new Money (10, 10));
		assertEquals ("$10.10", moneyObj2.toString());
	}

	@Test
	public void testToString() {
		Money moneyObj = new Money(7, 0);
		assertEquals ("$7.00", moneyObj.toString());
		moneyObj = new Money(0, 7);
		assertEquals ("$0.07", moneyObj.toString());
		moneyObj = new Money(0, 0);
		assertEquals ("$0.00", moneyObj.toString());
	}

	@Test
	public void testEquals () {
		Money moneyObj = new Money(7, 33);
		Money moneyObj2 = new Money (moneyObj);
		assertTrue (moneyObj.equals(moneyObj));
		assertTrue (moneyObj.equals(moneyObj2));
		assertTrue (moneyObj2.equals(moneyObj));

		moneyObj2 = new Money (7, 34);
		assertFalse (moneyObj.equals(moneyObj2));
		moneyObj2 = new Money (8, 33);
		assertFalse (moneyObj.equals(moneyObj2));
	}

	@Test
	public void testCompareTo () {
		Money moneyObj = new Money(7, 33);
		Money moneyObj2 = new Money (moneyObj);
		assertEquals (0, moneyObj.compareTo(moneyObj));
		assertEquals (0, moneyObj2.compareTo(moneyObj));
		assertEquals (0, moneyObj.compareTo(moneyObj2));

		moneyObj2 = new Money (8, 33);
		assertTrue (moneyObj.compareTo(moneyObj2) < 0);
		assertTrue (moneyObj2.compareTo(moneyObj) > 0);

		moneyObj2 = new Money (7, 34);
		assertTrue (moneyObj.compareTo(moneyObj2) < 0);
		assertTrue (moneyObj2.compareTo(moneyObj) > 0);
	}

	@Test
	public void testAdd1 () {
		Money money1 = new Money(0, 0);
		Money money2 = new Money(1, 22);
		money1.add(money2);
		assertEquals ("$1.22", money1.toString());
		money1.add(money1);;
		assertEquals ("$2.44", money1.toString());
	}

	@Test
	public void testAdd2 () {
		Money money1 = new Money(10, 50);
		Money money2 = new Money(10, 60);
		money1.add(money2);;
		assertEquals ("$21.10", money1.toString());
		money2 = new Money(10, 90);
		money1.add(money2);;
		assertEquals ("$32.00", money1.toString());
	}

	@Test
	public void testSub1 () {
		Money money1 = new Money(10, 50);
		Money money2 = new Money(1, 22);
		money1.subtract(money2);
		assertEquals ("$9.28", money1.toString());
		money1.subtract(new Money (4, 3));
		assertEquals ("$5.25", money1.toString());
		money1.subtract(money1);
		assertEquals ("$0.00", money1.toString());
	}

	@Test
	public void testSub2 () {
		Money money1 = new Money(10, 50);
		Money money2 = new Money(11, 22);
		money2.subtract(money1);
		assertEquals ("$0.72", money2.toString());
		money2.subtract(new Money (4, 3));
		assertEquals ("$0.00", money2.toString());
		money2.subtract(money1);
		assertEquals ("$0.00", money2.toString());
	}

	@Test
	public void testMonwy3() {
		Money moneyObj = new Money(7, 333);
		assertEquals ("$10.33", moneyObj.toString());
		moneyObj = new Money (3, -255);
		assertEquals ("$0.45", moneyObj.toString ());
		moneyObj = new Money (-3, -155);
		assertEquals ("$0.00", moneyObj.toString ());

	}
}
