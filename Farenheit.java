class Farenheit
  {
	 public static void main (String args[])
	 {
	 /*
	 Elaboro: Uriel Garcia Moreno
	 Fecha: 16 de Agosto del 2017
	 Objetivo: Programa que calcule el costo por area
	 */
	  int centigrados = 0;
	  float farenheit = 0;
	  System.out.println("Teclea los grados: ");
	  centigrados = Leer.datoInt();
	  farenheit = (float)9 / 5 * centigrados + 32;
	  System.out.println("Los grados Farenheit son: " + farenheit);
	  System.out.println("Adios");
	 }  
  } 