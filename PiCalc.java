
// Compute pi
public class PiCalc {
	public static void main(String[] args) {
		System.out.printf("%f\n%f\n%f\n", computePi(10000), computePi(20000), computePi(100000));
	}
	
	public static double computePi(double i) {
		double sum = 0, pi = 1, j;
		for (j = 1; j <= 2 * i - 1; j +=2) {
			
			sum += 1 / j;
			
			j += 2;
			
			sum -= 1 / j;
		}
		
		pi = 4 * sum;
		
		return pi;
		
	}
}

		