package POO;

public class PatineteEx5
{
	  	private String cor;
	    private String marca;
	    private boolean status;
	    private int velocidade;
	    private int incrementoVelocidade;

		public PatineteEx5 (String cor, String marca, boolean status, int velocidade, int incrementoVelocidade)
	    {

	        this.cor = cor;
	        this.marca = marca;
	        this.status = status;
	        this.velocidade = velocidade;
	        this.incrementoVelocidade = incrementoVelocidade;

	    }
	    public String mostrarDados()
	    {
	        String statusPatinete;

	        if (status == false) 
	        {
	            statusPatinete = "Patinete esta parado";
	        }
	        else
	        {
	            statusPatinete = "Pariente esta andando";
	        }
	        String informacao = "Cor: " + cor + "\nMarca: " + marca + "\nStatus: " + statusPatinete + "\nVelocidade Atual: " + velocidade + " KM/h" + "\nIncremento Velocidade: " + incrementoVelocidade+" KM/h";
	        return informacao;
	    }


	    public String andar() 
	    {
	        status = true;
	        String statusP = null;
	        if (status == true) 
	        {
	         statusP = "Patinete esta andando";
	        }
	        velocidade = velocidade + incrementoVelocidade;
	        String informacao = "Cor: " + cor + "\nMarca: " + marca + "\nStatus: " + statusP + "\nVelocidade Atual: " + velocidade + " KM/h";
	        return informacao;
	    }

}
