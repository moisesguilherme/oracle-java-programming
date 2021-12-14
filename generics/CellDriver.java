package generics;

public class CellDriver {
	
	public static void main(String[] args) {
		Cell cell = new Cell();
		cell.setValue(1);
		int num = (int)cell.getValue();
		System.out.println(num);
	}
}
