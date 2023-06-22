class Telefonoswitch
{
	public static void main (String args[])
	{
		char opc=' ';
		float dur=0, costo=0;
		System.out.println("Telefonos de Mexico");
		System.out.println("A Local");
		System.out.println("B Nacional");
		System.out.println("C Internacional");
		System.out.println("Tecle laopcion deseada");
		opc=Leer.datoChar();
		System.out.println("Tecle la duracion");
		dur=Leer.datoFloat();
		switch(opc)
			{
				case 'A':
					if (dur<5)
						costo=dur*0.7f;
					else
						costo=dur*0.8f;
					break;
				case 'B':
					if (dur<5)
						costo=dur*1.5f;
					else
						costo=dur*1.2f;
					break;
				case 'C':
					if (dur<5)
						costo=dur*2;
					else
						costo=dur*1.8f;
				default:
					System.out.println("Opcion inexistente");
					costo=0;
			}
		System.out.println("El costo es " + costo);
	}
}