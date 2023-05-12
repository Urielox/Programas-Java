import java.util.Scanner;
class Calif
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String [] nombre = new String [5];
		float [][] calificacion = new float [5][3];
		float sumafila = 0f, sumacolumna = 0f, promediofila = 0f, promediocolumna = 0f;
		for(int i = 0; i<=4; i++)
		{
			System.out.println("Teclea nombre del alumno");
			nombre [i] = Leer.dato();
			for(int j = 0; j<=2; j++)
			{
				System.out.println("Teclea calificacion de alumno " +  nombre [i] + " " +(j+1) + "° parcial");
				calificacion [i][j] = teclado.nextFloat();
			}
		}
		for(int i = 0; i<=4; i++)
		{
			System.out.print(nombre [i] + "\t");
			sumafila = 0;
			for(int j = 0; j<=2; j++)
			{
					sumafila += calificacion [i][j];
					System.out.print(calificacion[i][j] + "\t");
			}
			promediofila = sumafila / 3;
			System.out.println(promediofila);	
		}
		for(int z = 0; z<=2; z++)
		{
			sumacolumna = 0;
			for(int a = 0; a<=4; a++)
			{
				sumacolumna += calificacion[a][z];
			}
			promediocolumna = sumacolumna /5;
			System.out.print("\t" + promediocolumna);
		}
	}
}