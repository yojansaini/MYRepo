package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.lti.code.Arithmetic;

public class TestArithmetic {
	private Arithmetic art;
	
	@Before
	public void init(){
		art=new Arithmetic();
			
	}
	@Test
	public void TestSum() {
		assertEquals(10,art.sum(4, 6));
		
	}
//	@Test
//	public void Testmax() {
//		assertEquals(20,art.max(30, 20));
//	}
	@Test
	public void Testmaxi() {
		assertEquals(40,art.max(20, 30));
	}
	

}
