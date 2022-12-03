class Areaswitch
 {
   public static void main(String Args [])
    {
	  float resultado = 0;
	  float area = 0, base = 0, radio = 0, longitud = 0;
	  int tipo = 0 ;
	  System.out.println("Teclea la forma de la figura ");
	  System.out.println("1.-Circulo");
	  System.out.println("2.-Cuadrado");
	  System.out.println("3.-Rectangulo");
	  System.out.println("4.-Triangulo");
	  tipo = Leer.datoInt();
	  if (tipo<=4)
	     switch(tipo)
		{
			case 1:
				System.out.println("Teclea el radio");
				radio = Leer.datoFloat();
				resultado = 4 * 3.1416f *(radio *  radio);
				break;
            case 2:
				System.out.println("Teclea la base");
				base = Leer.datoFloat();
				resultado = base * base;
				break;
			case 3:
			    System.out.println("Teclea la base");
				base = Leer.datoFloat();
				System.out.println("Teclea la longitud");
				longitud = Leer.datoFloat();					
				resultado = base * longitud;
				break;	
			case 4:		
				System.out.println("Teclea la base");
				base = Leer.datoFloat();
				System.out.println("Teclea la longitud");
				longitud = Leer.datoFloat();					
				resultado = base * longitud / 2;
				}
				else
				   resultado = 0;
			System.out.println("El resultado es: " + resultado);
			System.out.println("Hasta luego c: ");
	 }
 }