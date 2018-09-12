/*dynamic method dispatch*/
import java.util.*;
class Sample3
{
	public static void main(String args[])
	{
    	 int w;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter any number");
	 w=sc.nextInt();
	 Demo1 d=new Demo1();
	 d.test(w);
	 d=new Demo2();
	 d.test(w);
	 d=new Demo3();
	 d.test(w);

        }
}
class Demo1 
{
void test(int y)
{
	  int sum=0,i;
	  for(i=1;i<=y;i++)
	  {
 	    sum=sum+i;
	  }
	  System.out.println("sum of number is "+sum);
}
}
class Demo2 extends Demo1
{
void test(int y)
{
	int fact=1,i;
	for(i=1;i<=y;i++)
	{
 	  fact=fact*i;
	}
 	System.out.println("factorial of number is"+fact);
}
}
class Demo3 extends Demo2
{
	void test(int y)
	{
	int z,rev=0,d;
	z=y;
	while(z!=0)
	{
	 d=z%10;
	 rev=rev*10+z;
	 z=z/10;
	}
	System.out.println("reverse of number is "+rev);
	}
}



