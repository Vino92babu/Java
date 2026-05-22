package Practice;

public class Array {
	/*public static void main(String[] args) {		
		int ip [][]  = {{22,4,5},{3,4,7},{13,252,50}};
		int min = ip[0][0];
		int max = ip[0][0];
		for (int i = 0 ;  i<3 ; i++) {
			for (int j = 0 ; j<3 ; j++) {
				if(ip[i][j]<min) {
					min= ip[i][j];
					max = ip[i][j];
				}
			}
		}
		System.out.print(min);
		System.out.print(min);
	}*/
	public void Cisco() {
		int num [][] = {{72,4,5},{3,6,10},{14,8,9}};
		int min = num[0][0];
		
		int max_col = 0;
		for (int i = 0 ; i<3 ; i++) {
			for (int j = 0 ; j<3 ;j++) {
				if (num[i][j]<min) {
					min= num[i][j];
					max_col = j;
				}
			}
		}
		int max = num[0][max_col];
		int k = 0;
		while (k<3) {
			if ()
			
		}
		
		System.out.print("Mininium number in matrix is: "+min );
		
	}
	
	public static void main(String[] args){
		Array minmax = new Array();
		minmax.Cisco();
		
	}
	

}


