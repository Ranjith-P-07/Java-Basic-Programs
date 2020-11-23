package Ranjith;
import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); 
		boolean b = isPerfect(num);
		if(b)
			System.out.println("It's a Perfect Number..!!");
		
		else
			System.out.println("It's not a Perfect Number");
	}
	
	public static boolean isPerfect(int num) {
		int i,sum = 0;
		for(i=1;i<num;i++)
		{
			if(num%i == 0)
				sum=sum+i;
		}
		if(sum == num)
			return true;
		else
			return false;
	}

}
