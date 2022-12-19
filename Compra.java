class Compra
{
	public static void main (String args[])
	{
		int cant=0;
		float precio=0, subtotal=0, desc=0, total=0;
		System.out.println("Teclea el precio");
		precio=Leer.datoFloat();
		System.out.println("Cantidad");
		cant=Leer.datoInt();
		if (cant>=1 && cant<=3)
			switch (cant)
			{
				case 1:
					subtotal=cant*precio;
					desc=.50f;
					total=subtotal*desc;
					break;
				case 2:
					subtotal=cant*precio;
					desc=.55f;
					total=subtotal*desc;
					break;
				case 3:
					subtotal=cant*precio;
					desc=.60f;
					total=subtotal*desc;
			}
		else
		{
			subtotal=cant*precio;
			desc=.65f;
			total=subtotal*desc;
		}
		System.out.println("Cantidad" + cant);
		System.out.println("Precio de cada uno" + precio);
		System.out.println("Subtotal" + subtotal);
		System.out.println("Descuento" + desc);
		System.out.println("Total" + total);
	}
}