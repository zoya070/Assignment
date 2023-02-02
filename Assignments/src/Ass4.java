
public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int i1=sc.nextInt();
	
		List<Integer> arr=new ArrayList();
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.forEach(s1->{if(s1%2!=0) 
		System.out.println("this is all odd number  "+s1);});
	}

}
