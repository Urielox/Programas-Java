  class Salario
   { 
     public static  void main (String arg[])
        {
		  String nombre;
          int tipo = 0;
          float salario  = 0;
          float nsalario = 0;

          System.out.println("Salario Atlas Software <Sosteniendo el futuro> ");
		  System.out.println("Escribe tu Nombre");
		  nombre = Leer.dato();
          System.out.println("Tipo de empleado 1 ---> +5% ");
          System.out.println("Tipo de empleado 2 ---> +7% ");
          System.out.println("Tipo de empleado 3 ---> +9% ");
          System.out.println("Tipo de empleado 4 ---> +12% ");
          System.out.println("Tipo de empleado 5 ---> +15% ");		  
          System.out.println("¿Que tipo empleado eres?  ");
          tipo = Leer.datoInt();
          if (tipo >= 1 && tipo  <= 5)
             {
                 System.out.println("Teclea tu salario ");
                 salario = Leer.datoFloat();
                 if (tipo == 1)
					 nsalario =  salario + (salario * 0.05f);
				else 
					if (tipo == 2)
						 nsalario  = salario + (salario * 0.07f);
					else
							if (tipo == 3)
								nsalario  = salario + (salario * 0.09f);
							else
								if (tipo == 4)
								  nsalario  = salario + (salario * 0.12f);
								else
								  nsalario  = salario + (salario * 0.15f);
				System.out.println(nombre + " Su salario ha incrementado a: " + nsalario);
				System.out.println("Agradecemos su preferencia");
             }
          else
              System.out.println("opcion erronea ");
        }
       
   }