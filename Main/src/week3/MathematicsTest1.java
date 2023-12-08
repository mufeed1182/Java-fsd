package week3;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
//import org.junit.Ignore;
import org.junit.Test;


public class MathematicsTest1 {
	Mathematics aut;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before: setUp method is called");
		aut=new Mathematics();
		aut.setNo1(3);
		aut.setNo2(4);
	}

	@After
	public void tearDown() throws Exception {
		aut=null;
		System.out.println("THis is after");
	}

	@Test
//	@Ignore
	public void testAdd() {		
		int actual = aut.add();
		assertEquals(7, actual);
	}

	@Test
	public void testSubtract() {		
		int actual = aut.subtract();
		assertEquals(-1, actual);
	}

	@Test
	public void testProduct() {
		int actual = aut.product();
		assertEquals(12, actual);
	}

}
