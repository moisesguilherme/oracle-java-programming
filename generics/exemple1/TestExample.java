package generics.exemple1;

public class TestExample {

	public static void main(String[] args) {
		Example<String, Integer>  e1 = new Example<>("Text", 10);
		
		System.out.println(e1);

	}

}
