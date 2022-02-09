package javaGenerics;

public class Maximum {
	
	String x, y, z;
	
	public Maximum(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public Maximum() {
		
	}

	public static String testMax (String x, String y, String z) {
		String max = x;
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
	
	public static void printMax(String x,String y,String z,String max) {
		System.out.printf("max of %s, %s and %s is %s\n",x,y,z,max);
	}

	
	
	public static void main(String[] args) {
		
		String x1 = "apple",y1 = "banana",z1 = "camel";
		
		
		
		testMax(x1, y1, z1);
		
	}
	
	
}