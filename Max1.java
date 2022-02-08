package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max1 {

	@Test
	void test() {
		Maximum test = new Maximum(0, 0, 0);
		 float output = test.testMax(5f, 4f, 3f);
		 assertEquals(5, output);
	}

}
