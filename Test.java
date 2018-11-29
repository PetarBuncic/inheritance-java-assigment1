package assigment1;

public class Test {
	
	public static void main (String [] args) {
		Product regent =new Wine("Roze",1234566, 50, 1);
		Product product=new Wine("red",123222,100,2);
		Chocolate cho=new Chocolate("Najlepse zelje chockolate",12121212,50,5);
	
		System.out.println(regent.toString());
		System.out.println(product.toString());
		System.out.println(cho.toString());
	}

}
