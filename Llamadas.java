class Llamadas
 {
		public static void main(String Args [])
    {
	  float Costo = 0;
	  float duracion = 0; 
	  int tipo = 0;
	  System.out.println("Teclea opcion deseada ");
	  System.out.println("1.-Local");
	  System.out.println("2.-Nacional");
	  System.out.println("3.-Internacional");
	  tipo = Leer.datoInt();
	  if (tipo>=1 && tipo<=3)
		{
			System.out.println("Teclee la duracion");
			duracion = Leer.datoInt();
			if (tipo == 1)
						if (duracion>=5)
							Costo = duracion * .7f;
						else 
							Costo = duracion * .8f;	
			else
					if (tipo == 2)
							if (duracion<=5)
								Costo = duracion * 1.5f;
							else
							Costo = duracion * 1.2f;	
					else
							if (duracion<=5)
								Costo = duracion * 2;
							else
								Costo = duracion * 1.8f;
						
		
			
				System.out.println("El costo es: " + Costo);
				System.out.println("Hasta luego :3 ");
		}					 
	  else					
		System.out.println("Opcion erronea");
	}
  }