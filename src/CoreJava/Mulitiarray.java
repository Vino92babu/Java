package CoreJava;

public class Mulitiarray {
	public static void main(String[] args) {
		int numbers [] [] = {{1,2,3},{92,34,95},{62,14,53}};
		System.out.println(numbers[1][2]);
		for ( int i  = 0 ; i<3; i++){
			for (int j = 0 ; j<3 ; j++ ) {
				System.out.println(numbers[i][j]);
			}
			
			
		}
		
	}

}
