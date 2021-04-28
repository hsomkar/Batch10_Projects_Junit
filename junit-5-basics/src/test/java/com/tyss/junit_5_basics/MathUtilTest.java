package com.tyss.junit_5_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilTest {
	MathUtil mt = null;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("Runs before all");
	}

	@BeforeEach
	void init() {
		mt = new MathUtil();
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("Clean up...");
	}

	@Test
	@DisplayName("Adds 2 no.s")
	void test() {
		int expected = 2;
		int actual = mt.add(1, 1);
		assertEquals(expected, actual, "Should add 2 no.s");
	}

	@Test
	@DisplayName("Area of circle")
	void testcircleArea() {
		double expected = 3.1415;
		double actual = mt.circleArea(1);
		assertEquals(expected, actual, "Should clac. area of circle");
	}

	@Test
	@DisplayName("Divides 2 no.s")
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mt.divide(2, 1), "Divide by o should throw ");
	}
}
