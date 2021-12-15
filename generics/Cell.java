package generics;

public class Cell<T, T2> {
		
	private T t;
	private T2 k;
	
	public void setValue(T celldata, T2 i) {
		t = celldata;
		k = i;
	}
	
	public T getT1Value() {
		return t;
	}
	
	public T2 geT2Value() {
		return k;
	}
	
	public String toString() {
		return("cell type is: Type1: " +  t.getClass() + " and Type2: " + k.getClass());
	};

}
