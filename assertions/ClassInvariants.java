package assertions;

public class ClassInvariants {

	public static void main(String[] args) {
		
	  //Object a = pop();
	  

	}
	
	int nElement = 0;
	
	public Object pop() {

		int size = this.getElementCount();

		if (size == 0) {
			throw new RuntimeException("Attempt to pop from empty stack");
		}

		Object result = 1;
		assert (this.getElementCount() == size - 1);
		return result;

	}

	private int getElementCount() {
		return nElement + 1;
	}

}
