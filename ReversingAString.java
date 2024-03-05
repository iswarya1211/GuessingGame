package testJava;

public class ReversingAString {
	public static void main(String[] args) {
	String a = "Goodday";
	String b = ""; 
	for(int i=0; i<=a.length()-1; i++) {
		b = a.charAt(i)+b;
	}
	System.out.println("Reversed String is: " +b);
		
	}

}
