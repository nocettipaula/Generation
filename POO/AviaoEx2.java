package POO;

public class AviaoEx2 
{
	    private String nomeCompanhiaAerea;
	    private int numeroDoVoo;
	    private boolean statusVoo;


		public AviaoEx2 (String nomeC, int numV, boolean statusV) 
	    {
	        nomeCompanhiaAerea = nomeC;
	        numeroDoVoo = numV;
	        statusVoo = statusV;
	    }

	    public String mostrarDados () {
	        String informacoes = "Nome da Companhia Áerea: "+nomeCompanhiaAerea+" | Número do Voo: "+numeroDoVoo;
	        return informacoes;
	    } 

	    public String verificarStatusVoo () {

	        String verificacao;
	        if (statusVoo == true) {
	            verificacao = "O avião já decolou.";
	        }

	        else {
	            verificacao = "O avião não decolou.";
	        }

	        return verificacao;
	    }
}
