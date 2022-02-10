package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max2 {

	@Test
	void test() {
		Maximum test = new Maximum();
		 Comparable output = test.testMax("banana","camel", "apple");
		 assertEquals("camel", output);
	}

}
