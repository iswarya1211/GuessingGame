package testJava;

public class CreateCharacterPattern {            
	public static void main(String[] args) { 
	int alphabet = 65;
	{  
	for (int i = 0; i < 5; i++) //for outer loop  
	{  
	   
	//for (int k = 1; k < 5-i; k++)   // loop for spaces
	//{  
		
	//System.out.print(" ");  
	//}  
	for (int j = 0; j <= i; j++)  
	{  
	System.out.print((char) (alphabet + j) + " ");  
	}  
	System.out.println();  
	}  
	}  
	}
}


