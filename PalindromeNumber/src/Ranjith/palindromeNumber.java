package Ranjith;
import java.util.Scanner;
public class palindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int tempraryNumber=num,reverse=0,reminder;
		
		while(num>0)
		{
		reminder=num%10; //ex: if num is 123 then reminder is 3
		num = num/10; // it stores 12 in num variable
		reverse=reverse*10+reminder;
		}
		
		if(reverse == tempraryNumber)
		{
			System.out.println("The number is Palindrome");
		}
		else
		{
			System.out.println("The number is not a Palindrome");
		}
	}

}
