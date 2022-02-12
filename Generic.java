package javaGenerics;

import java.util.Arrays;

public class Generic<E extends Comparable<E>> {
	
//	static ArrayList<E extends comparable<E>> arr = new ArrayList<E extends Comparable<E>>();
	E x, y, z;

	public Generic(E x, E y, E z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}	

	public Generic() {
		
	}

	public static <E extends Comparable<E>> Comparable testMaximum (E... values) {
		
			Arrays.sort(values);
		
		return values[values.length - 1];
	}	
	
	public void printMax(E x,E y,E z,E max) {
		System.out.printf("max of %s, %s and %s is %s\n",x,y,z,max);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Generic.testMaximum("camel", "banana", "apple","ball"));
		System.out.println(Generic.testMaximum(3, 5, 9,4));
		System.out.println(Generic.testMaximum(1.33, 1.55, 1.99,1.44));
		
		
		
		
		
	}
}
