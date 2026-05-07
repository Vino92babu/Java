package Practice;

public class loops {
	public static void main(String[] args) {
		int k =1;
		for(int i = 0; i<4;i++) {
			for (int j = 1;j<5-i;j=j+1) {
				System.out.print(k+"\t");
				k++;
			}
			System.out.println("");
		}
		/*for (int i = 1 ; i<5; i++) {
			for (int j = 1 ; j<i+1; j++) {
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
		}*/
		/*for (int i = 1 ; i<=4 ; i++) {
			for (int j = 1 ; j<=i ; j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}*/
		int kk =3;
		for (int i = 1 ; i<4 ; i++) {
			for (int j = 1 ; j<=i; j++) {
				System.out.print(kk+"\t");
				kk=kk+3;
			}
			System.out.println();
		}
		
		
	}

}
