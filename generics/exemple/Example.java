package generics.exemple;

public class Example<Type1, Type2> {
	private Type1 t1;
	private Type2 t2;
	
	public Example(Type1 t1, Type2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
		
	Type1 getT1() {
		return t1;
	}


	void setT1(Type1 t1) {
		this.t1 = t1;
	}



	Type2 getT2() {
		return t2;
	}




	void setT2(Type2 t2) {
		this.t2 = t2;
	}




	public String toString() {
		return "Exemple type 1:" + t1 + "\nExemple type 2:" + t2; 
	}
}
