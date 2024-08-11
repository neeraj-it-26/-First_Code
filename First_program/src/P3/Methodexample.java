package P3;

public class Methodexample {

	public void Mthd(int i, int j)
	{
		this.Mthd(2);
		System.out.println("This is two parameterize method");
	}
	public void Mthd() 
	{
		this.Mthd(10, 9, 8);
		System.out.println("This is default method");
	}
	public void Mthd(int i) {
		this.Mthd();
		System.out.println("This is one parameterize method");
	}
	public void Mthd(int i, int j, int k) {
		System.out.println("This is three parameterize method");
	}
	public void Mthd(int i, int j, int k, int l) {
		this.Mthd(10, 8);
		System.out.println("This is four parameterize method");
	}
	public static void main(String[] args) {
		Methodexample obj = new Methodexample();
		obj.Mthd(2, 1, 4,8);
	}
}
