class ejercicio5
 {
	   public static void main(String Args [])
    {
		char opc='s';
		float Costo = 0, duracion = 0, totalc = 0; 
		int tipo = 0;
		while(opc=='s')
		{
			System.out.println("Teclea opcion deseada ");
			System.out.println("1.-Local");
			System.out.println("2.-Nacional");
			System.out.println("3.-Internacional");
			tipo = Leer.datoInt();
			if (tipo>=1 && tipo<=3)
			{
				switch(tipo)
				{
				
					case 1: 	
								System.out.println("Teclee la duracion");
								duracion = Leer.datoFloat();
								if (duracion>=5)
									Costo = duracion * .7f;
								else 
									Costo = duracion * .8f;	
					break;
					case 2:
								System.out.println("Teclee la duracion");
								duracion = Leer.datoFloat();
								if (duracion<=5)
									Costo = duracion * 1.5f;
								else
									Costo = duracion * 1.2f;	
					break;
					case 3:
								System.out.println("Teclee la duracion");
								duracion = Leer.datoFloat();
								if (duracion<=5)
									Costo = duracion * 2;
								else
									Costo = duracion * 1.8f;
					break;	
					default:
					System.out.println("Opcion erronea");
				}
			}
				totalc=totalc + Costo;
				System.out.println(" ¿Hiciste otra llamada? ('s'/'n') ");
				opc= Leer.datoChar();
		}		
				System.out.println("El costo total es: " + totalc);
				System.out.println("Hasta luego :3 ");
							 
	 				
		
	}
  }