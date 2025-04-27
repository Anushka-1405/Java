
// Check whether number is Armstrong or not

class Astrong
{
  public static void main(String args[])
  {
    int num = 153;
    int i = num;
    int sum = 0;
    int x;
    
    while(num > 0)
    {
      x = num % 10;
      sum = sum + (x*x*x);
      num/= 10;
     
     
    }
    System.out.println("The sum is: " + sum); 
    
    if(sum == i)
    {
      System.out.println("the number " + i + " is Armstrong.");
    }
    else
    {
      System.out.println("the number " + i + " is not Armstrong.");
    }
  }
}
      
