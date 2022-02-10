package javaGenerics;

public class Generic<E extends Comparable<E>> {
	
	E x, y, z;

	public Generic(E x, E y, E z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Generic() {
		
	}

	public static <E extends Comparable<E>> Comparable  testMaximum (E x, E y, E z) {
		E max = x;
		
		if((y).compareTo(max) > 0) {
			max = y;
		}
		
		if((z).compareTo(max) > 0) {
			max = z;
		}
		printMax(x,y,z,max);
		return max;
		
	}
	
	public static <E extends Comparable<E>> void printMax(E x,E y,E z,E max) {
		System.out.printf("max of %s, %s and %s is %s\n",x,y,z,max);
	}
	
	public static void main(String[] args) {
		
		Generic.testMaximum("camel", "banana", "apple");
		Generic.testMaximum(3, 5, 9);
		Generic.testMaximum(1.33, 1.55, 1.99);
	}
}
