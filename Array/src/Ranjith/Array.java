package Ranjith;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		int a[] = new int [25];
		Random r = new Random();
		
		for(int j=0;j<a.length;j++)
		{
			a[j] = r.nextInt(25);
		}
		
		try 
		{
			System.out.println(a[26]);
		}
		catch(Exception e)
		{
			System.out.println("Maximun index is 24 ..!!");
		}
		
		for(int i : a)
		{
			System.out.println(i + " ");
		}

	}

}
