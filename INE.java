
class INE
{
	public static void main (String arg[])
	{
		char opc='s';
		int contador=0, contador18=0,contadorMenores=0;
		int edades=0,edad=0;
		double promedio=0;
		while (opc=='s')
		{
			System.out.println("Edades de los alumnos ");
			edad=Leer.datoInt();
			edades=edades+edad;
			if (edad>=18)
			{
				contador18=contador18+1;
				contador=contador+1;
			}
			else
			{
				contadorMenores=contadorMenores+1;
				contador=contador+1;
			}
			System.out.println("Algun otro alumno? (s/n)");
			opc=Leer.datoChar();
			
		}	
		promedio=edades/contador;
		System.out.println("Mayores/Menores de edad: ");
		System.out.println("18: "+contador18);
		System.out.println("-18: "+contadorMenores);
		System.out.println("Promedio de edad en el grupo:"+promedio);
	}
}