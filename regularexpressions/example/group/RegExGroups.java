package regularexpressions.example.group;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExGroups {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String date;
		Pattern dateP = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
		date = getDate(in, dateP);		
		System.out.println("US style date - " + date);
		in.close();
	}
	
	static String getDate(Scanner in, Pattern dateP) {
		String date;
		Matcher dateM;
		do {
			System.out.print("Enter a Date (dd/mm/yyyy): ");
			date = in.nextLine();
			dateM = dateP.matcher(date);
			if(dateM.matches()) {
				String day = dateM.group(1);
				String month = dateM.group(2);
				String year = dateM.group(3);
				date = month + "/" + day + "/" + year;
			}
		}while(!dateM.matches());
		return date;
	}

}
