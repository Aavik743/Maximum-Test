package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max3 {

	@Test
	void test() {
		Maximum test = new Maximum();
		 String output = test.testMax("banana", "apple","camel");
		 assertEquals("camel", output);
	}

}
