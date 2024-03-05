package testJava;

public class SecondLargestNumInArray {
		   public static void main(String args[]){
			   int a[] = {10,20,40,30,50,70,90};
		       int size = a.length;
		       int temp;
		      for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){

		            if(a[i]>a[j]){
		               temp = a[i];
		               a[i] = a[j];
		               a[j] = temp;
		            }
		         }
		      }
		      System.out.println("Second largest number is:: "+a[size-2]);
		   }
		}

