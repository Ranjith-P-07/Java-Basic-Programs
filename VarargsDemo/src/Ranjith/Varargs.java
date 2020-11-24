package Ranjith;

public class Varargs {

	public static void main(String[] args) {
		Display obj = new Display();
		obj.show(5,6,7,8);

	}
}
class Display {
	
	public void show(int ...a ) { // Variable Arguments ...
		for(int i:a)
			System.out.println(i);
	}
	public void show(int a ) { // Method Overloading .
		System.out.println(a + " Is a Single Value");
	}
}