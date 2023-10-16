import java.util.Scanner;
class PangramStr{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str=scan.nextLine();
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)) 
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not Pangram");
		}
	}
}