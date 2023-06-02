class Horas
 {
   public static void main(String args[])
    {
	  float horas = 0, minutos = 0, segundos = 0, dias = 0;
	  System.out.println("Teclea las horas ");
	  horas = Leer.datoFloat();
	  minutos = horas * 60;
	  segundos = horas * 3600;
	  dias = (float)1 / 24 * horas; 
	  System.out.println("El valor en minutos es de: " + minutos);
	  System.out.println("El valor en segundos es de: " + segundos);
	  System.out.println("El valor en dias es de: " + dias);
	  System.out.println("Hasta Luego");
	}
 }