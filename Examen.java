import java.util.Scanner;

public class Examen
 {
		public static void main(String Args [])
    {
		Scanner Leer=new Scanner (System.in);
	  char opc = 's';
	  int cuenta = 0;
	  int cuentad = 0;
	  int cuentan = 0;
	  int cuentao = 0;
	  int cuentasi = 0;
	  int cuentase = 0;
	  int cuentar = 0;
	  int calificaciones = 0;
	  int diez = 0;
	  int nueve = 0;
	  int ocho = 0;
	  int siete = 0;
	  int seis = 0;
	  int recurse = 0;
	  while (opc == 's')  
	     {  
	       System.out.println("Teclea la calificacion del examen ");
	       calificaciones=Leer.nextInt();
	       if (calificaciones == 10)
				diez = diez + 1;
		   else
			 if (calificaciones == 9)
					nueve = nueve + 1;
			 else
				if (calificaciones == 8)
					ocho = ocho + 1;
			    else
					if (calificaciones == 7)
						siete = siete + 1;
					else
					    if (calificaciones == 6)
								seis = seis + 1;
						else
					        if (calificaciones < 6)
								  recurse = recurse + 1;
	       System.out.println("Desea agregar mas calificaciones ? "); 
	       opc = Leer.next ().charAt(0);
	     }
	System.out.println("La cantidad de alumnos con 10 son " + diez);
	System.out.println("La cantidad de alumnos con 9 son " + nueve);
	System.out.println("La cantidad de alumnos con 8 son " + ocho);
	System.out.println("La cantidad de alumnos con 7 son " + siete);
	System.out.println("La cantidad de alumnos con 6 son " + seis);
	System.out.println("La cantidad de alumnos reprobados son " + recurse);
	}
  }