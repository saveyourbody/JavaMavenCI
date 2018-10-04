package com.test;



import org.junit.Test;

import junit.framework.Assert;

public class ExampleTest {

	@Test
	public void test() {
		
		int score = 80;
		
		//expected
		String expected = "A";
		
		//actual
		String actual = "A";
		
		Assert.assertEquals(expected, actual);
	}

}
