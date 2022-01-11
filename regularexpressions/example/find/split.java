package regularexpressions.example.find;

public class split {

	public static void main(String[] args) {
		String str = "Quebra aqui0vai quebar aqui 1d0digitos até 9digitos";		
		String[] tokens = str.split("[0-9]+");

		
		for(String token: tokens)
			System.out.println(token);
	}

}
