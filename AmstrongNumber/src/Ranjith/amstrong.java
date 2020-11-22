package Ranjith;
import java.util.Scanner;
public class amstrong {
	
/*		153 = 1*1*1 + 5*5*5 + 3*3*3
 		153 = 153 
 */
	public static void main(String[] args) {
		Scanner roy = new Scanner(System.in);
		int num = roy.nextInt();
		int r,sum=0;
		int temp= num;
		
		while(num>0) {
			r = num % 10;
			num = num / 10;
			sum = sum + r*r*r;
		}
	
		if(temp == sum)
		{
			System.out.println("The number is Amstrong number..!!");
		}
		else
		{
			System.out.println("The number is not an Amstrong number");
		}
		

	}

}
