
import java.util.*;
		public class As1 {
		  public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n;

		System.out. print("Entered number is");

		n =sc.nextInt();

		for(int i=1 ; i<=n ;i+=4)

		{
		if(n==i)
		{
		System. out.print("You are in Sapphire team ");
		}
		}
		for (int i = 1 ; i < n * 2 ; i += 2)
		{
		if(n==i*2)
		{
		System. out.print("You are in Pearl team ");

		}
		}
		for(int i=1; i<n*4; i+=3)
		    {
		      if(n==i)
		{
		System.out.println("You are in Ruby team");
		}
		}
		for(int i=1;i<=20;i++)
		{
		if(n==i)
		{
		System.out.println("You are in Emerald team");
		}
		}
		}

		    




	}


