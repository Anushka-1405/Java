
// Check leap year

class leap
{
 public static void main(String args[])
 {
   int y = 1920;
   
   if(y%4==0 && y%2==0)
   {
     System.out.println(y + " is a leap year.");
   }
   else
   {
    System.out.println(y + " is not a leap year.");
   }
   
 }
}
