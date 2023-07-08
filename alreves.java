class alreves
{
	public static void main(String args [])
	{
		String cadena = " ";
		int cuantos=0;
		String reves = " ";
		{
			System.out.println("Teclea algo");
			cadena = Leer.dato();
			cuantos = cadena.length();
			
		for (int i =cuantos-1 ; i>=0; i--)
			reves = reves+cadena.charAt (i);
		
		System.out.println(reves);
		}
	}
}