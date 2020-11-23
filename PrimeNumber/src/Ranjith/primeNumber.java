package Ranjith;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int i,num;
		num = sc.nextInt();
		boolean isPrime = true;
		for(i=2;i<num;i++)
		{
			if(num%i == 0)
				isPrime = false;
		}
		if(isPrime)
			System.out.println(num + " " + "is A PrimeNumber");
		else
			System.out.println(num + " "+ "is Not a PrimeNumber");
	}

}
