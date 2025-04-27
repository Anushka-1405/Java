class CopyConstructor
{
	int rollno;
	String name;
	CopyConstructor(int r,String n)
	{
		rollno = r;
		name = n;
		System.out.println("-------Base Constructor------");
		System.out.println("Roll No :"+rollno+"\n"+"Name : "+name);

	} 
	CopyConstructor(CopyConstructor s)
	{
		rollno = s.rollno;
		name = s.name;
		System.out.println("-------Copy Constructor------");
		System.out.println("Roll No :"+rollno+"\n"+"Name : "+name);

	}

	public static void main(String args[])
	{
		CopyConstructor s1 = new CopyConstructor(149,"Chaitali");
		CopyConstructor s2 = new CopyConstructor(s1);

	}

}
