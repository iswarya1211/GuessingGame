package testJava;
public class CheckWhetherPrimeOrNot {
	public static boolean primeNumberCheck(int n) {
		if(n<=1) 
		return false;
		for(int i=2; i < n; i++) {
			if(n%i==0) 
			return false;
		}
		return true;
		}
	    public static void main(String[]args) {
	    	if(primeNumberCheck(61)){
	    		System.out.println(true);
	    	}
	    	else {
	    		System.out.println(false);
	    	}
	    	if(primeNumberCheck(91)) {
	    		System.out.println(true);
	    	}
	    	else {
	    		System.out.println(false);
	    	}
		}
	}
	



