package POO;

public class TesteContaBancariaEx6
{
	public static void main (String args [])
	{
		 ContaBancariaEx6 conta1 = new ContaBancariaEx6("Paula Nocetti", 15415-1,1541,850.00,140.00,710.00);
	        ContaBancariaEx6 conta2 = new ContaBancariaEx6("Ingrid Castro", 129498-9,3267,1200.00,370.00,1570.00);
	        System.out.println(conta1.mostrarDados());
	        System.out.println("||||");
	        System.out.println(conta1.sacarDinheiro());

	        System.out.println("\n");

	        System.out.println(conta2.mostrarDados());
	        System.out.println("||||");
	        System.out.println(conta2.depositarDinheiro());
	}
}
