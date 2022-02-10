package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max1 {

	@Test
	void test() {
		 Generic test = new Generic();
		 Comparable output1 = test.testMaximum("camel", "banana", "apple");
		 Comparable output2 = test.testMaximum(9, 3, 5);
		 Comparable output3 = test.testMaximum(1.99, 1.33, 1.55);
		 assertEquals("camel", output1);
		 assertEquals(9, output2);
		 assertEquals(1.99, output3);
	}

}
