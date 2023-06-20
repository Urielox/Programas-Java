import java.util.Scanner;

public class SueldosWhile
 {
	public static void main(String Args [])
    {
	  Scanner Leer=new Scanner (System.in);
	  char opc = 's';
	  int cuenta = 0;
	  float sueldof = 0, sueldo = 0;
	  float sueldosuma = 0;
	  float grantotal = 0;
	  while (opc == 's')
	  {  
	    System.out.println("Teclea el sueldo ");
	    sueldo=Leer.nextFloat();
	    sueldosuma= sueldo + sueldosuma;
			if (sueldo >= 0 &&  sueldo <= 999)
				sueldof = sueldo + (sueldo*.12f);
			else
				if (sueldo >= 1000  && sueldo <=2499)
					sueldof = sueldo+(sueldo*.10f);
				else
					if (sueldo >= 2500 && sueldo<=10000 )
						sueldof = sueldo+(sueldo*.08f);
					else
						sueldof = sueldo;
					
	  System.out.println("el nuevo sueldo es  " + sueldof); 
	  grantotal = grantotal + sueldof;
	  System.out.println("Desea agregar mas sueldos ? "); 
	  opc = Leer.next().charAt(0);
	  }
	 
	System.out.println("La cantidad a pagar es " + sueldosuma);
	System.out.println("El gran total es  " + grantotal);
	
	}
  }