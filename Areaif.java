class Areaif
 {
   public static void main(String Args [])
    {
	  float resultado = 0;
	  float area = 0, base = 0, radio = 0, longitud = 0, tipo = 0 ;
	  System.out.println("Teclea la forma de la figura ");
	  System.out.println("1.-Circulo");
	  System.out.println("2.-Cuadrado");
	  System.out.println("3.-Rectangulo");
	  System.out.println("4.-Triangulo");
	  tipo = Leer.datoInt();
	  if (tipo>=1 && tipo<=4)
		{
			if (tipo == 1)
				{
				System.out.println("Teclea el radio");
				radio = Leer.datoFloat();
				resultado = 4 * 3.1416f *(radio *  radio);
				}
				else
				{
				if (tipo == 2)
				{
					System.out.println("Teclea la base");
					base = Leer.datoFloat();
					resultado = base * base;
				}
				else
				{
					if (tipo == 3)
					{
						System.out.println("Teclea la base");
						base = Leer.datoFloat();
						System.out.println("Teclea la longitud");
						longitud = Leer.datoFloat();					
						resultado = base * longitud;
					}
					else
					{
						System.out.println("Teclea la base");
						base = Leer.datoFloat();
						System.out.println("Teclea la longitud");
						longitud = Leer.datoFloat();					
						resultado = base * longitud / 2;
						}
				}
				}
			System.out.println("El resultado es: " + resultado);
			System.out.println("Hasta luego c: ");
					}				
	  else					
		System.out.println("Opcion erronea");
	 }
 }