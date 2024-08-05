package Assignment_2;

//(((((10+2)*2)-2)*2)/2)

public class Airthematic_program1 {

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
	public void div(int p, int q)
	{
		int r;
		r=p/q;
		System.out.println("Result is "+r );
	}
	
	public static void main(String[] args) {
		Airthematic_program1 obj = new Airthematic_program1();
		int sum_result = obj.sum(10,2);
		int mul_result = obj.mul(sum_result, 2);
		int sub_result = obj.sub(mul_result, 2);
		int mul_result1 = obj.mul(sub_result, 2);
		obj.div(mul_result1, 2);
						
	}
}
