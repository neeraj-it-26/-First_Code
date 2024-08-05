package Package2;

public class Student 
{
int rollno;
int age;
public void display1()
{
	System.out.println("Welcome to all of you");
}
public void display2()
{
	System.out.println("Automation is very easy");
}

public static void main(String[] args) {
	Student obj = new Student();
	obj.rollno = 10;
	obj.age = 25;
	obj.display1();
	obj.display2();
	System.out.println("Roll number is "+obj.rollno);
	System.out.println("Age of the person is "+obj.age);
}
}
