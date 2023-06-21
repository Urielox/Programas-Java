class Sueldoswitch
{
	public static void main (String args[])
	{
			int	tipo=0;
			float sueldo=0, isueldo=0, nsueldo=0;
			String nombre="";
			System.out.println("Teclea el nombre");
			nombre=Leer.dato();
			System.out.println("Teclea el tipo de empleado");
			tipo=Leer.datoInt();
			System.out.println("Tecle el sueldo");
			sueldo=Leer.datoFloat();
			if (tipo>=1 && tipo<=5)
				switch(tipo)
				{
					case 1:
						isueldo=0.05f;
						nsueldo=sueldo+sueldo*isueldo;
						break;
					case 2:
						isueldo=0.07f;
						nsueldo=sueldo+sueldo*isueldo;
						break;
					case 3:
						isueldo=0.09f;
						nsueldo=sueldo+sueldo*isueldo;
						break;
					case 4:
						isueldo=0.12f;
						nsueldo=sueldo+sueldo*isueldo;
					case 5:
						isueldo=0.15f;
						nsueldo=sueldo+sueldo*isueldo;
				}
			else
				{
					System.out.println("Clasificacion inexistente");
					isueldo=0;
					nsueldo=sueldo;
				}
			System.out.println(nombre);
			System.out.println("Sueldo: " + sueldo);
			System.out.println("Incremento de sueldo: " + isueldo);
			System.out.println("Nuevo Sueldo: " + nsueldo);
	}
}