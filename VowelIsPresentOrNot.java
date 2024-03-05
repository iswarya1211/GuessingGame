package testJava;
public class VowelIsPresentOrNot {
	public static boolean VowelIsPresentOrNot(String input) {
		return input.toLowerCase().matches(".*[aeiou]*.");
	}
	public static void main(String[] args) {
		System.out.println(VowelIsPresentOrNot("Switch"));
		System.out.println(VowelIsPresentOrNot("Table"));
		System.out.println(VowelIsPresentOrNot("Happy"));
	}

}

