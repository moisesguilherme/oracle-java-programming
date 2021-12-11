package exceptions;

import javax.swing.JOptionPane;

public class testException {

	public static void main(String[] args) {
		
		//UsingException u = new UsingException();
		
		try {
			actionMethod();
		}catch(MyException e) {
			//System.out.println(e);
			JOptionPane.showInternalMessageDialog(null, e);	
		}
		
	}

	private static void actionMethod() throws MyException {
		try {
			// algo errado
			int i = 1/0;
		} catch (Exception e) {
			throw new MyException("An unhandled error occurred!");
		}
	}

	
}
