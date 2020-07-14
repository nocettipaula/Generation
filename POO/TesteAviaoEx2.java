package POO;

public class TesteAviaoEx2 
{
	    public static void main (String args[])
	    {
	        AviaoEx2 nave1 = new AviaoEx2 ("Gol", 99, true);
	        AviaoEx2 nave2 = new AviaoEx2 ("Azul", 999, false);

	        System.out.println(nave1.mostrarDados());
	        System.out.println(nave1.verificarStatusVoo());

	        System.out.println(nave2.mostrarDados());
	        System.out.println(nave2.verificarStatusVoo());


	    }
}
