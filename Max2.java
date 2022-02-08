package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max2 {

	@Test
	void test() {
		Maximum test = new Maximum(0, 0, 0);
		 float output = test.testMax(4f, 5f, 3f);
		 assertEquals(5, output);
	}

}
