package javaGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max3 {

	@Test
	void test() {
		 Generic test = new Generic();
		 Comparable output1 = test.testMaximum("apple","banana","camel");
		 Comparable output2 = test.testMaximum(5, 3, 9);
		 Comparable output3 = test.testMaximum(1.55, 1.33, 1.99);
		 assertEquals("camel", output1);
		 assertEquals(9, output2);
		 assertEquals(1.99, output3);
	}

}
