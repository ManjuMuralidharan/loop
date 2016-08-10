import java.util.*;

class sumofN
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value N");
		int n=s.nextInt();
		int sum=0;
		
		for(int i=0;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
	}

}

