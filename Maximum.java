package javaGenerics;

public class Maximum {
	
	float x, y, z;
	
	public Maximum(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public static float testMax (Float x, Float y, Float z) {
		Float max = x;
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
	
	public static void printMax(Float x,Float y,Float z,Float max) {
		System.out.printf("max of %s, %s and %s is %s\n",x,y,z,max);
	}

	
	
	public static void main(String[] args) {
		
		Float x1 = 1.33f,y1 = 1.55f,z1 = 1.99f;
		
		testMax(x1, y1, z1);
		
	}
	
	
}