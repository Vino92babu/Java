package CoreJava;

public class array {
	public static void main(String[] args) {
		int a = 4; //Declare the variable 
		int aa;
		aa=3;
		// declare the multiple values of same data type variable is called array
		int A[]= new int[4];
		A[0] = 3;
		A[1] = 2;
		A[2] = 8;
		A[3] = 22;
//		A[4] = 33;
//		A[5] = 11;
		
		int b[] = {22 , 33, 33 ,22 ,33, 44, 33};
		for (int i = 0 ; i<b.length ; i++) {
			System.out.print(b[i]+" ");
			
		}
		
	}

}
