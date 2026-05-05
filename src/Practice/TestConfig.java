package Practice;

public class TestConfig {
	//Environment Setup
		String appUrl = "https://www.amazon.com";
		String appName = "Amazon";
		String browserName = "Chrome";
		int maxRetries = 5;
		String debugMode = "Manual";
	//product Details
		String name = "Ac Remote";
		double price = 567.77;
		boolean inStock = true;
		int qty = 35;
		
		public void display() {
			System.out.println("Environment Setup Details");
			System.out.println("appUrl: "+appUrl);
			System.out.println("appName: "+ appName);
			System.out.println("browserName: "+browserName);
			System.out.println("Retries: "+maxRetries);
			System.out.println("debugMode: "+debugMode);
			System.out.println("____________________________________________________________");
			System.out.println("product Details");
			System.out.println("Product Name: "+ name);
			System.out.println("price: "+price);
			System.out.println("inStock: "+inStock);
			System.out.println("qty: "+qty);
		}
	public static void main(String[] args) {
		TestConfig testdata = new TestConfig();
		testdata.display();
	}
}
