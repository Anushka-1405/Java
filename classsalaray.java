class salary
{
  public static void main(String args[])
  {
    double tsalary = 200000, saving;
    double tax =  (tsalary * 0.18);
    double kharcha = 50000;
    
    saving = tsalary - (tax + kharcha);
    
    System.out.println("My salary = " + tsalary  + " \ntax = " + tax + " \nKharcha = " + kharcha + " \n\nMy saving is: " + saving);
  }
 }
    
     