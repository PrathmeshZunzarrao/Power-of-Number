import java.util.Scanner;
class  PowerofNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		System.out.print("Enter Power : ");
		int pow = sc.nextInt();

		int ans = 0;

		for(int i=1 ; i<=pow; i++)
		{
			 ans = num * i;
		}

		System.out.println(ans);
	}
}
