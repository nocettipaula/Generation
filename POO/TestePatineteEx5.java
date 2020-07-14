package POO;

public class TestePatineteEx5 
{
	public static void main(String[] args) 
	{

        PatineteEx5 patinete = new PatineteEx5("Azul", "Caloi", false, 0 , 30);
        System.out.println(patinete.mostrarDados());
        System.out.println("\n");
        System.out.println(patinete.andar());

    }

}
