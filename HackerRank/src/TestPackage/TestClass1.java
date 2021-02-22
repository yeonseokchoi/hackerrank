package TestPackage;

public class TestClass1 {
	
	public static void main(String[] args) {
		
		int n = 0;
		
		int x = 100;
		int y = 15950;
		int d = 300;
				
		int minMul = 0;
		int maxMul = (1000000000-x) / d;
	
		while(true) {
			
			System.out.println("minMul : " + minMul);
			System.out.println("maxMul : " + maxMul);
			
			int tMul = maxMul - ((maxMul-minMul)/2);
			System.out.println("tMul : " + tMul);
			
			int sum = x + (d*tMul);
			
			if( sum > (y-d) && sum < (y+d)) {
				if(sum >= y) {
					n = tMul;
				}else {
					n = tMul+1;
				}
				break;
			}
			
			if(sum < y) {
				minMul=tMul;
			} else {
				maxMul=tMul;
			}
			
		}
		
		System.out.println("result :" + n);
		
		// return n;
	}
}
