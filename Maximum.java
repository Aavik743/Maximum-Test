package javaGenerics;

public class Maximum<E extends Comparable<E>> {
	
	E x, y, z;
	
	public Maximum(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public Maximum() {
		
	}
	
	public static <E extends Comparable<E>> E max(E x,E y, E z) {
		E max = x;
		
		if(y.compareTo(max) > 0) {
			max = y;
		}
		
		if(z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x,y,z,max);
		return max;
	}

	public E testMax (E x, E y, E z) {
		E max = x;
		
		if(y.compareTo(max) > 0) {
			max = y;
		}
		
		if(z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x,y,z,max);
		return max;
		
	}
	
	public static <E> void printMax(E x,E y,E z,E max) {
		System.out.printf("max of %s, %s and %s is %s\n",x,y,z,max);
	}

	
	
	public static void main(String[] args) {
		
		String x1 = "apple",y1 = "banana",z1 = "camel";
		Integer x2 = 3,y2 = 5,z2 = 9;
		Float x3 = 1.33f,y3 = 1.55f,z3 = 1.99f;
		
		
		Maximum maximum = new Maximum();
		maximum.testMax(x1, y1, z1);
		maximum.testMax(x2, y2, z2);
		maximum.testMax(x3, y3, z3);
		
	}
	
	
}