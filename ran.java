class ran
{
	public static void main(String args[])
	 {
		
		int num=0;
		int adv=0;
		char opc= 's';
		while(opc == 's')
			{
			num = (int) (Math.random()*5+1);
			System.out.println("adivinia un numero entre 1 y 5");
			adv = Leer.datoInt();
			if(num == adv)
				System.out.println("atinaste");
			else
				System.out.println("no atinaste");
			System.out.println("desea intentar denuevo s(si)/n(no)");
			opc=Leer.datoChar();
			}
		
	}	
}