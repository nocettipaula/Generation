package POO;

public class ProdutoEletronicoEx3
{
	private String celularA;
	private String bateriaA;
	private String carregadorA;
	
	public ProdutoEletronicoEx3(String celular, String bateria, String carregador) 
	{
		celularA = celular;
		bateriaA = bateria;
		carregadorA = carregador;	
	}
	public String getAparelhoCelularACompleto ()
	{
		String AparelhoCompleto = celularA+" "+bateriaA+" "+carregadorA;
		return AparelhoCompleto;
		
	}
	
}
