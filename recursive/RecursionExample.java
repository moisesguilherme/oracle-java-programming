package recursive;

public class RecursionExample {

	public static void main(String[] args) {
		recurseMethod(4);

	}
	
	static void recurseMethod(int num) {
		if(num == 0)
			return;
		else {
			System.out.println("hello " + num);
			recurseMethod(--num);
			System.out.println(""+num);
			return;
		}
	}

}
