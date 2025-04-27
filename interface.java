/* Assignment No. 3
   Interface  */
   
   
interface A
{
  void draw();
  
}

class Rectangle implements A
{
  public void draw()
  {
    System.out.println("Drawing Rectangle.");
  }
}

class Circle implements A
{
  public void draw()
  {
     System.out.println("Drawing Circle.");
  }
}

class Interface
{
  public static void main(String args[])
  {
    A b = new Circle();
    b.draw();
    
    A c = new Rectangle();
    c.draw();
  }
}