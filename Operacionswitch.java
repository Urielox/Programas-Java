class Operacionswitch
 {
   public static void main(String Args [])
    {
	  float resultado = 0;
	  int uno = 0, dos = 0, tipo = 0 ;
	        System.out.println("Teclea el primer numero");
			uno = Leer.datoInt();
			System.out.println("Teclea el segundo numero");
			dos = Leer.datoInt();
	  System.out.println("Teclea el tipo de operacion ");
	  System.out.println("1.-Suma");
	  System.out.println("2.-Resta");
	  System.out.println("3.-Multiplicacion");
	  System.out.println("4.-Division");
	  tipo = Leer.datoInt();
	  if (tipo<=4)
	   switch(tipo)
		{
			case 1:
				resultado = uno + dos;
				break;
			case 2:
				resultado = uno - dos;
				break;
			case 3:
				resultado = uno * dos;
				break;
			case 4:	
				resultado = uno / dos;
				break;
		}
		else
		  resultado=0;
			System.out.println("El resultado es: " + resultado);
	 }
 }