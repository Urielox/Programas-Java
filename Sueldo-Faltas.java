class Aumento
 {
   public static void main(String Args [])
    {
	  String nombre;
	  float sueldof = 0, sueldo = 0;
	  int tipo = 0;
	  System.out.println("Teclee su nombre: ");
	  nombre = Leer.dato();
	  System.out.println("Teclea sus faltas ");
	  System.out.println("0.- Sin faltas C: ");
	  System.out.println("1.-Una falta");
	  System.out.println("2.-Dos faltas");
	  System.out.println("3.-Tres faltas ");
	   System.out.println("4.-MAS DE CUATRO FALTAS >:v");
	  tipo = Leer.datoInt();
	  if (tipo>=0 && tipo<=4)
		{
			System.out.println("Teclee su sueldo");
			sueldo = Leer.datoFloat();
			if (tipo == 0)
				sueldof = sueldo * 2;
			else
				if (tipo == 1)
					sueldof = 1.9f* sueldo;
				else
					if (tipo == 2)
						sueldof = 1.8f * sueldo;
					else
						if (tipo ==3)
								sueldof = 1.7f * sueldo;
						else
							sueldof = sueldo;
			System.out.println(nombre);
			System.out.println("Su saldo es de: " + sueldof );
			System.out.println("Hastaluego :3");
		}				
	  else					
		System.out.println("Opcion erronea");
	 }
 }