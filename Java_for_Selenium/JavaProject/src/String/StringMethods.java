package String;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Welcome";
		System.out.println(s.length()); //number of characters in the string
		
		//concatenation
		
		String s1="Welcome to ";
		String s2="training";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//Equals
		
		String s3="WELCOME";
		String s4="WeLCOME";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contains
		
		System.out.println(s3.contains("Wel"));
		
		//substring
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(5,7));
		
		//replace
		
		System.out.println(s.replace('e','a')); //Walcoma
		
	}

}
