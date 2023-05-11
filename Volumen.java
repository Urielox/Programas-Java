class Volumen
 {
   public static void main(String args[])
    {
	  float radio = 0, volumen = 0, area = 0;
	  System.out.println("Teclea el Radio ");
	  radio = Leer.datoFloat();
      area = radio * radio * 12.5664f;
	  volumen = (float)4.1888 * radio * radio * radio;
	  System.out.println("El area es de: " + area);
	  System.out.println("El volumen es: " + volumen);
	  System.out.println("Hasta Luego");
	 }
 }