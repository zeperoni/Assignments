package assign6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrderedLinkedListTest {

	@Test
	public void test1()
	{
	OrderedLinkedList list1 = new OrderedLinkedList();
	list1.insert(1);
	assertEquals("1", list1.toString());
	assertEquals(1, list1.NumEntries());
	}
	
	@Test
	public void test2()
	{
	OrderedLinkedList list1 = new OrderedLinkedList();
	list1.insert(2);
	list1.insert(4);
	list1.insert(5);
	assertEquals("2 4 5", list1.toString());
	assertEquals(3, list1.NumEntries());
	}
	
	@Test
	public void test4()
	{
	OrderedLinkedList list1 = new OrderedLinkedList();
	list1.insert(2);
	list1.insert(5);
	list1.insert(4);
	list1.insert(3);
	assertEquals("2 3 4 5", list1.toString());
	assertEquals(4, list1.NumEntries());
	}
	
	
	@Test
	public void test3()
	{
	OrderedLinkedList list1 = new OrderedLinkedList();
	list1.insert(2);
	list1.insert(4);
	list1.insert(5);
	list1.delete(2);
	assertEquals("4 5", list1.toString());
	assertEquals(2, list1.NumEntries());
	list1.delete(6);
	assertEquals(0, list1.get(4));
	}
	
	@Test
	public void test5()
	{
	OrderedLinkedList list1 = new OrderedLinkedList();
	list1.insert(1);
	list1.insert(80);
	list1.insert(-6);
	list1.insert(7);
	assertEquals("-6 1 7 80", list1.toString());

	assertEquals(3, list1.get(80));
	}
	

}
