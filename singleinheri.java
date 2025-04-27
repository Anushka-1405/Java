
import java.util.*;
 final class A
{
	
	int a=20,b=15,sum;
	void display()
	{
	sum=a+b;
	System.out.println("Sum is"+sum);
	}
}
class B extends A
{

        void disp()
        {
         System.out.println("welcome");
        }
}
class inheritance
{
  
       public static void main(String args[])
       {
	
	 B obj=new B();
	 obj.display();
	 obj.disp();
	
       }
}
