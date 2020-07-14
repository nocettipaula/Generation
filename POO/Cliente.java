package POO;

public class Cliente
{
	private String nomeCliente;
	private String idadeCliente;
	private String sexoCliente;
	public Object get;
	
	public Cliente(String nome, String idade, String sexo)
	{
		nomeCliente = nome;
		idadeCliente = idade;
		sexoCliente = sexo;
	}
	public String dadosCliente1 () 
	{
		String dadosCliente = nomeCliente+ " "+idadeCliente+" "+sexoCliente;
		return dadosCliente;
	}
	public boolean getDadosClienteCompleto() 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
