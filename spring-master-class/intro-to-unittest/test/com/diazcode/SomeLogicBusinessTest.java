package com.diazcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeLogicBusinessTest {
	//	@BeforeEach run before of each test cases
	@BeforeEach
	public void onBeforeEach() {
		System.out.println("Before Each TestCase");
	}
	
	
	//	@BeforeAll run one and only once
	@BeforeAll
	static void onBeforeAll() {
		System.out.println("Before All TestCase");
	}
	
	@Test
	public void sumOf3NegNums() {
		SomeLogicBusiness someLogicBusiness = new SomeLogicBusiness();
		int tmp = someLogicBusiness.sums(new int[]{- 1, - 2, - 3});
		assertEquals(- 1 - 2 - 3 - 4, tmp);
	}
	
	@Test
	public void sumOf1NegNums() {
		SomeLogicBusiness someLogicBusiness = new SomeLogicBusiness();
		int tmp = someLogicBusiness.sums(new int[]{- 1});
		assertEquals(- 1, tmp);
//		Only 1 assertFunction in 1 test method
//		assertTrue(1==2);
	}
	
	@Test
	public void sums() {
//		fail("Not yet implemented!");
	}
}