package java8feature;

public class main {

	public static void main(String[] args) {

		anonymous obj = new anonymous()
		// interfce he isliye { cerli breces
		{
			public void show() {
				System.out.println("hello anonymoues");

			}
			
			public void printnum(int x) {
				System.out.println(x);

			}
			
			

		};// ; mednatory

		obj.show();
		obj.printnum(44);

	}

}