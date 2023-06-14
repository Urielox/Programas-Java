import java.util.Scanner;

public class Promedio
 {
		public static void main(String Args [])
    {
		Scanner Leer=new Scanner (System.in);
	  char opc = 's';
	  float promedio = 0;
	  int cuenta = 0;
	  int calificaciones = 0;
	  int calificacionessuma = 0;
	  while (opc == 's')
		  
	  
	  {  
	  System.out.println("Teclea la calificacion ");
	  calificaciones=Leer.nextInt();
	  cuenta=cuenta+1;
	  calificacionessuma = calificacionessuma + calificaciones;
	  System.out.println("Desea agregar mas calificaciones ? "); 
	  opc = Leer.next ().charAt(0);
	  }
	  promedio = calificacionessuma / cuenta;
	System.out.println("El promedio es " + promedio);
	}
  }