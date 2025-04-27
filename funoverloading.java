class funoverloading
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	float add( float a,float b)
	{
		return a+b;
	}
public static void main(String args[])
{
	funoverloading f=new funoverloading();
	System.out.println("Addition of int values"+(f.add(2,3)));
	System.out.println("Addition of double values"+(f.add(2.22,3.23)));
	System.out.println("Addition of float values"+(f.add(2.3f,3.3f)));
	
}
}
	