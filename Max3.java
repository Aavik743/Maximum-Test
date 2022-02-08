package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max3 {

	@Test
	void test() {
		Maximum test = new Maximum(0, 0, 0);
		 float output = test.testMax(3f, 4f, 5f);
		 assertEquals(5, output);
	}

}
