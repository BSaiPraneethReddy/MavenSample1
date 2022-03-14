package com.lti.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCasesExample {

	//ctrl+shift+o for importing required packages..
	
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testCase1()
	{
		Assertions.assertEquals("Hello","Hello");
		Assertions.assertEquals(1000,500+500);
	}
	

	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}

}
