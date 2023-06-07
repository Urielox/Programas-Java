class Operacion
 {
   public static void main(String Args [])
    {
	  float resultado = 0;
	  int uno = 0, dos = 0, tipo = 0 ;
	  System.out.println("Teclea el tipo de operacion ");
	  System.out.println("1.-Suma");
	  System.out.println("2.-Resta");
	  System.out.println("3.-Multiplicacion");
	  System.out.println("4.-Division");
	  tipo = Leer.datoInt();
	  if (tipo>=1 && tipo<=4)
		{
			System.out.println("Teclea el primer numero");
			uno = Leer.datoInt();
			System.out.println("Teclea el segundo numero");
			dos = Leer.datoInt();
			if (tipo == 1)
				resultado = uno + dos;
			else
				if (tipo == 2)
					resultado = uno - dos;
				else
					if (tipo == 3)
						resultado = uno * dos;
					else
						resultado = uno / dos;
			System.out.println("El resultado es: " + resultado);
		}				
	  else					
		System.out.println("Opcion erronea");
	 }
 }