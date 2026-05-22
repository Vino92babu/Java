package Practice;
import java.util.Arrays;
public class demo {
	public void SwapWithTemp() {
		int A [] = {2,3,4,22,33};
		int B [] = {33,44,1,66,44};
		int[] temp;
		temp = A;
		A=B;
		B=temp;
		System.out.println("A:"+ Arrays.toString(A));
		System.out.println("B:"+Arrays.toString(B));
	}
	
	public void ArraySort() {
		int A [] = {3,44,6,1,55,4,32};
		for (int i = 0 ; i< 6 ; i++){
			
		}
	}
	
	public static void main(String[] args) {
		demo test = new demo();
		test.SwapWithTemp();

	}

}
