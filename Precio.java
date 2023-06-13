class Precio
 {
   public static void main(String args[])
    {
	  String nombre;
	  float costo = 0, impuesto = 0, utilidad = 0;
	  System.out.println("Teclea el articulo ");
	  nombre = Leer.dato();
      System.out.println("Teclea el costo    ");
      costo = Leer.datoFloat();
      impuesto= costo * 0.16f;
	  utilidad= costo * 1.5f;
	  System.out.println("Su articulo es: " + nombre);
	  System.out.println("El costo es de: " + (impuesto + costo));
	  System.out.println("La utilidad es: " + utilidad);
	  System.out.println("Hasta Luego");
	 }
 }
