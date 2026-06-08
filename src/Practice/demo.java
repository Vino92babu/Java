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
	/*public void ArraySort() {
		int A [] = {3,44,6,1,55,4,32};
		for (int i = 0 ; i< A.length ; i++){
			for (int j = i+1; j< A.length; j++) {
				if (A[i]> A[j]) {
					int temp = A[i];
					A[i]=A[j];
					A[j] = temp;
				
			}
			}
		}
		System.out.println(Arrays.toString(A));
		
	}*/
	
	public void arraysortdemo() {
		int arr[] = {5,7,2,8,1,6,3,4};
		for (int i = 0 ; i<arr.length ; i++) {
			for (int j = i+1 ; j<arr.length ; j++) {
				if (arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void stringmethods() {
		String Name = "Vinoth";
		System.out.println(Name);
		System.out.println(Name.charAt(4));
		System.out.println(Name.indexOf("e"));
		System.out.println(Name.substring(2, 6));
		System.out.println(Name.substring(1));
	}
	
	public static void main(String[] args) {
		demo test = new demo();
		//test.SwapWithTemp();
		//test.ArraySort();
		//test.arraysortdemo();
		test.stringmethods();

	}

}
