import java.util.Scanner;

public class GastoWhile
 {
		public static void main(String Args [])
    {
		Scanner Leer=new Scanner (System.in);
	  char opc = 's';
	  int sumagasto = 0;
	  int gasto = 0;
	  while (opc == 's')
		  
	  
	  {  
	  System.out.println("Teclea el gasto ");
	  gasto=Leer.nextInt();
	  sumagasto = sumagasto + gasto;
	  System.out.println("Desea agregar mas gastos ? "); 
	  opc = Leer.next ().charAt(0);
	  }
	System.out.println("La suma de gastos es " + sumagasto);
	}
  }