package exceptions;

import javax.swing.JOptionPane;

public class UsingException {
		
	
	public UsingException() {
		
		try {
			actionMethod();
		}catch(MyException e) {
			//System.out.println(e);
			JOptionPane.showInternalMessageDialog(null, e);
			
		}
		
	}
	
	private void actionMethod() throws MyException {
		try {
			// algo errado
			int i = 1/0;
		} catch (Exception e) {
			throw new MyException("An unhandled error occurred!");
		}
	}
	
}
