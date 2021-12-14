package generics;

public class Cell<T> {
		
	private T data;
	
	public void setValue(T celldata) {
		data = celldata;
	}
	
	public T getValue() {
		return data;
	}

}
