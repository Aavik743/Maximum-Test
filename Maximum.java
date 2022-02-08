package javaGenerics;

public class Maximum {
	
	int x, y, z;
	
	public Maximum(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public static int testMax (Integer x, Integer y, Integer z) {
		Integer max = x;
		Maximum m = new Maximum(x, y, z);
		if(y.compareTo(max) > 0) {
			max = y;
		}
		
		if(z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x,y,z,max);
		return max;
		
	}
	
	public static void printMax(Integer x,Integer y,Integer z,Integer max) {
		System.out.printf("max of %s, %s and %s is %s\n",x,y,z,max);
	}

	
	
	public static void main(String[] args) {
		
		Integer x1 = 3,y1 = 5,z1 = 9;
		
		testMax(x1, y1, z1);
		
	}
	
	
}