package recursive;

public class RecursiveSequencesExample {

	public static void main(String[] args) {
		
		//System.out.println("Result:" + forward(10));
		System.out.println("Result:" + backward(3));

	}
	
	public static double forward(double limit) {
		double num1 = 5, result = 0;
		
		for(double i=0; i < limit; i++) {
			result += num1;
			System.out.println("loop: " + i + " " + result);
		}
		
		return result;
	}
	
	public static double backward(double limit) {
		double num = 5;
		if(limit <= 1)
			return num;
		else
			return backward(limit -1) + num;
	}
	
	

}
