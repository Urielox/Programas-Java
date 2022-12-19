class Dolares
 {
   public static void main(String args[])
    {
	  float dolares = 0, compra = 0, venta = 0, cambio = 0;
	  System.out.println("Teclea los dolares ");
	  dolares = Leer.datoFloat();
	  System.out.println("Teclea el tipo de cambio ");
	  cambio = Leer.datoFloat();
	   
      compra = dolares * cambio ;
	  
	  System.out.println("El valor en pesos de compra es de: " + compra);
	  
	  System.out.println("Hasta Luego");
	 }
 }