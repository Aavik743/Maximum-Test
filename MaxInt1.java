package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxInt1 {

	@Test
	void test() {
		Maximum test = new Maximum(0, 0, 0);
		 int output = test.testMax(5, 4, 3);
		 assertEquals(5, output);
	}

}
