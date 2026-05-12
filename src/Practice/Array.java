package Practice;

public class Array {
	public static void main(String[] args) {		
		int ip [][]  = {{22,4,5},{3,4,7},{13,252,50}};
		int min = ip[0][0];
//		int max = ip[0][0];
		for (int i = 0 ;  i<3 ; i++) {
			for (int j = 0 ; j<3 ; j++) {
				if(ip[i][j]<min) {
					min= ip[i][j];
//					max = ip[i][j];
				}
			}
		}
		System.out.print(min);
		System.out.print(min);
	}

}


