package Practice;

public class loop_practice {
	public static void main(String[] args) {
		for (int i = 1 ; i<=4 ; i++) {
//			System.out.println("1");
			for (int j =1 ; j<=4 ; j++ ) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for (int i = 1; i<=4 ; i++) {
			for (int j = 1; j<=4 ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 1 ; i<=4 ; i++) {
			for(int j = 1 ; j<=4 ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 0; i<4 ; i++) {
			for (int j = 1 ; j<=i+1; j++ ) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		for (int i = 0 ; i<4 ; i++ ) {
			for (int j = 1 ; j<=i+1 ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		int k = 1;
		for (int i = 0; i<4 ; i++) {
			for (int j = 1; j<=i+1 ; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		int odd = 1;
		for (int i = 0 ; i<4 ; i++) {
			for (int j = 1 ; j<=i+1 ; j++) {
				System.out.print(odd+" ");
				odd=odd+2;
			}
			System.out.println();
		}
		System.out.println("Reverse pattern");
		int w = 4;
		for (int i = 0 ; i<=4 ; i++){
			for (int j = 1 ; j<=w-i ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
