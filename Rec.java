class Rec
  {
	 public static void main (String args[])
	 {
	 /*
	 Elaboro: Uriel Garcia Moreno
	 Fecha: 16 de Agosto del 2017
	 Objetivo: Programa que calcule el costo por area
	 */
		
	  float base= 0, longitud = 0, area = 0, costo = 0, costofinal = 0;
	  System.out.println("Teclea la base: ");
	  base = Leer.datoFloat();
	  System.out.println("Teclea la longitud: ");
	  longitud = Leer.datoFloat();
	  System.out.println("Teclea el costo por metro cuadrado: " );
	  costo = Leer.datoFloat();
	  area = base * longitud ;
	  costofinal= costo * area ;
	  System.out.println("El area del cuadrilatero es de: " + area);
	  System.out.println("El costo del area es de: " + costofinal);
	 }  
  } 