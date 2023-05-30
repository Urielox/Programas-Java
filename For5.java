class For5
{
	static public void main(String args[])
	{
		int d = 0, sum = 0;		
		
		for (int i = 1; i <= 5; ++i)
		{
			for (int e = 1; e <= 10; ++e)
			{
				d = d + 1;
				System.out.print(d + "\t");
				sum = sum + d ;
			}
			System.out.println(sum + "\n");	
			sum = 0;
		}
		System.out.println("Adios prro");	
	}	
}	
		