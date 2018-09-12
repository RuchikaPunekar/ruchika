/*method overriding*/
import java.util.*;
class Demo
{
	double y;
	void area(int x)
	{
	  y=3.14*x*x;
	  System.out.println("area of circle is"+y);
	}
}
class Sample1 extends Demo
{
double z;
	Sample1(int w)
	{
		super.area(w);
	}
	void area(int x)
	{
	 z=(4/3)*3.14*x*x*x;
	 System.out.println("volume of sphere is"+z);
	}

public static void main(String args[])
{
	int w;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any value");
	w=sc.nextInt();
  	Sample1 s=new Sample1(w);
  	s.area(w);
}
}
