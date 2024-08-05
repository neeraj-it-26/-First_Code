package package1;

public class Secon_Class
{

	int a;
	int b;
	int c;
	
	public int Add_sum(int a,int b)
	{
		c= a+b;
		System.out.println(c);
		return c;
	}
	


	
	public static void main(String[] args)
	{
	First_Class program1 = new First_Class();
	program1.Add();
	
	Secon_Class program2 = new Secon_Class();
	program2.Add_sum(9,10);
	}
	}
