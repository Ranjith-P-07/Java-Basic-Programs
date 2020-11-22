package Ranjith;
import java.util.Scanner;
public class switchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int checkNumber = sc.nextInt();
		
		switch(checkNumber)
		{
		case 0 :
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		}

	}

}
