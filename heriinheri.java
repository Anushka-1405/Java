
class Super
{
	int a =10;
	int b = 20;
}
class Sub1 extends Super
{
	void showAdd()
	{
		System.out.println("Addition of A and B = "+(a+b));
	}
}
class Sub2 extends Super
{

	void showSub()
	{

		System.out.println("Subtraction of A and B = "+(a-b));
	}
			
}
class HierarchicalInh
{
	public static void main(String args[])
	{
		Sub1 s1 = new Sub1();
		Sub2 s2 = new Sub2();
		s1.showAdd();
		s2.showSub();
	}

}


#2 


// Hirarchical Inheritance

class A
{
  void display()
  {
    System.out.println("This is JAVA.");
  }
}

class B extends A
{
  void display()
  {
    super.display();
    System.out.println("This is C++.");
  }
}

class C extends A
{
  void display()
  {
    
    System.out.println("This is PYTHON.");
  }
}

class D extends A
{
  void display()
  {
    
    System.out.println("This is C.");
  }
}



class HirarI
{
  public static void main(String args[])
  {
   B objB = new B();
   C objC = new C();
   D objD = new D();
   
   
   objB.display();
  
   
   objC.display();
   
   objD.display();
  }
}
 


