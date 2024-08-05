package Assignment_2;

public class Airthematic_solution {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int i, int j)
	{
		int k;
		k=i-j;
		return k;
	}
	public int mul(int x, int y)
	{
		int z;
		z=x*y;
		return z;
	}
	public int div(int p, int q)
	{
		int r;
		r=p/q;
		return r;
	}

	public static void main(String[] args) {
		Airthematic_solution obj2 = new Airthematic_solution();
		//Problem 1:-  (((((10+2)*2)-2)*2)/2)
		int sum = obj2.sum(10, 2);
		int mul = obj2.mul(sum, 2);
		int sub = obj2.sub(mul, 2);
		mul = obj2.mul(sub, 2);
		int Div = obj2.div(mul, 2);
		System.out.println("Result for the problem (((((10+2)*2)-2)*2)/2) is "+Div);
		
		//Problem 2:-((((10/2)-2)*2)-2)+2)
		Div = obj2.div(10, 2);
		sub = obj2.sub(Div, 2);
		mul = obj2.mul(sub, 2);
		sub = obj2.sub(mul, 2);
		sum = obj2.sum(sub, 2);
		System.out.println("Result for the problem //((((10/2)-2)*2)-2)+2) is "+sum);
		
		
	}
}
