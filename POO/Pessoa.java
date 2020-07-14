package POO;

public class Pessoa 
{
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	public Pessoa (String primeiro,String meio, String ultimo) 
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	public String getNomeCompletoPessoa()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
		
	}
	public String getPrimeiroNome () 
	{
		String primeironame = primeiroNome;
		return primeironame;
	}
}
