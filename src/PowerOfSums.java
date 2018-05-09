public class PowerOfSums {	
	public static int counter = 0;
	public static int powerSum(int n) {
		
		int i = -1;
		
		checkSum(n,i++,n-i);
		
		return powerSum(n++);
		
		
		


	}
	public static void checkSum(int n, int i, int j){
		
		
		if(i + j == n){
			counter++;
		}
		
		
	}
}
	

			
		