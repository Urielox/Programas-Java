import java.util.Scanner;

public class For1
 {
		public static void main(String Args [])
    {
		Scanner Leer=new Scanner (System.in);
		int cual = 0;
		System.out.println("Teclea un numero");
		cual=Leer.nextInt();
		for(int i = 1; i < 11; ++i)
			System.out.println(cual + " * " + i + " = " + (cual * i) );
		  
	System.out.println("Bye prro(a) ;v");
	}
  }