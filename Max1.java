package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max1 {

	@Test
	void test() {
		Maximum test = new Maximum();
		 Comparable output = test.testMax("camel", "banana", "apple");
		 assertEquals("camel", output);
	}

}
