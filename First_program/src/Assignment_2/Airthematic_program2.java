package Assignment_2;

//((((10/2)-2)*2)-2)+2)

public class Airthematic_program2 {
	public void sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result is "+c);
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
		Airthematic_program2 obj1 = new Airthematic_program2();
		int div_result = obj1.div(10, 2);
		int sub_result = obj1.sub(div_result, 2);
		int mul_result = obj1.mul(sub_result, 2);
		int sub_result1 = obj1.sub(mul_result, 2);
		obj1.sum(sub_result1, 2);
	}

}
