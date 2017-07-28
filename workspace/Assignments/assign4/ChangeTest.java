package assign4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChangeTest {

	
		@Test
		public void test1()
		{
			Change change = new Change(1,01);
			assertEquals("$1.01",change.toString());
			
			change.makeChange();
			assertEquals(3, change.getSingles());
			assertEquals("1", Integer.toString(change.getPennies()));
			assertEquals("1", Integer.toString(change.getDimes()));
		}
}
