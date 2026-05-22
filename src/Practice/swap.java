package Practice;

public class swap {
	public void swap_withtemp() {
		int a = 45;
		int b = 34;
		int c;
		c= a;
		a = b ;
		b = c;
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		//System.out.println("C: "+c);
	}
	public void swap_withouttemp() {
		int A = 76;
		int B = 29;
		
		A = A+B;
		B = A-B;
		A = A-B;
		
		System.out.println("A: "+A);
		System.out.println("B: "+B);
		
		
	}
	public static void main(String[] args) {
		swap ob = new swap();
//		ob.swap_withtemp();
		ob.swap_withouttemp();
		}
		
	}


