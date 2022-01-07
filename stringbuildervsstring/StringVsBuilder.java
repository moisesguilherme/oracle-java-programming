package stringbuildervsstring;

public class StringVsBuilder {
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Test immutability");
		String str2 = "Test immutability";
		
		//Display the identify hashCode for each object
		System.out.println("StringBuilder: " + str.hashCode());
		System.out.println("String: " + str2.hashCode());
		
		str.replace(0, str.length(), "HelloWorld");
		str2="HelloWorld";
		
		//Display the identify hashCode for each object
		System.out.println("StringBuilder: " + str.hashCode());
		System.out.println("String: " + str2.hashCode());
				
	}

}
