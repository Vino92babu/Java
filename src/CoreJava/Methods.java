package CoreJava;
public class Methods{
	public void getinput(){    //Creating method using Void (void returns nothing) 
		int Age = 34;
		String Name = "Vinoth";
		System.out.println(Name);
		System.out.println(Age);
		
	}
	
	static String Name = "Hi Vinoth";
	public static void main(String[] args) {
		
		Methods data = new Methods();
		Firstclass dd = new Firstclass();
		Firstclass.main(args);
		data.getinput();
		int A = 56;
		int B = 43;
		int C = 22;
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(Name);
	}
}