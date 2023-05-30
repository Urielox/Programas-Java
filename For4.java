class For4
{
	static public void main(String args[])
	{	
		int aumento = 10, suma = 0, general = 0;			
		for (int i = 1; i <=5; ++i)					
		{
			for (int j = 1; j <=5; ++j)
			{
				suma = aumento + suma;				
				System.out.print (aumento + "\t");
				aumento += 10;
			}	
			general = suma + general;				
			System.out.println (suma);
			suma = 0;
			System.out.println ("\n");
		}
	System.out.println ("El gran total es " + general);		
	System.out.println ("Adios");
	}
}