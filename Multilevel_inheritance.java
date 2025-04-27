// Multilevel Inheritance

class A
{
  void display()
  {
    System.out.println("This is Grand parent class.");
  }
}

class B extends A
{
  void display()
  {
    super.display();
    System.out.println("This is Parent class.");
  }
}

class C extends B
{
  void display()
  {
    super.display();
    System.out.println("This is Child class.");
  }
}

class MultilevelI
{
  public static void main(String args[])
  {
   C obj = new C();
   obj.display();
  }
}