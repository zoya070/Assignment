import java.util.Scanner;
public class As3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kid1,kid2,kid3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 angles");
		kid1 = sc.nextInt();
		kid2 = sc.nextInt();
		kid3= sc.nextInt();
		if((kid1+kid2+kid3) == 180){
		if(kid1 == kid2 && kid2 == kid3 && kid1 == kid3)
		 {
		System.out.println("Prize 3");
		}
		else if(kid1 == 90 || kid2 ==90 || kid3 == 90) 
		{
		System.out.println("Prize 2");
		}else 
		{System.out.println("Prize 1");
		}
		}
		else {
		System.out.println("No prize");
		}
		}
		
	}


