package Ranjith;
import java.util.Scanner;

public class fibonnaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int FinalValue = sc.nextInt();
		int FirstValue = 1;
		int fib=0,sum=0;
		System.out.println(sum + "\n" + FirstValue);
		while(fib<=FinalValue)
		{
			fib=sum+FirstValue;
			sum=FirstValue;
			FirstValue=fib;
			System.out.println(fib);
		}
	}

}
