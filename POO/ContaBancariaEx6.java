package POO;

public class ContaBancariaEx6 
{
	private String nomeCliente;
    private int codConta;
    private int agenciaConta;
    private double saldoConta;
    private double valorDeposito;
    private double valorSaque;

	public ContaBancariaEx6 (String nomeC, int codC, int agenciaC, double saldoC, double valorD,double valorS) 
	{
        nomeCliente = nomeC;
        codConta = codC;
        agenciaConta = agenciaC;
        saldoConta = saldoC;
        valorDeposito = valorD;
        valorSaque = valorS;
    }

    public String mostrarDados()
    {
        String infos=nomeCliente+
                "\nCódigo da conta:"+codConta+
                "\nNúmero agência:"+agenciaConta+
                "\nSaldo na conta:"+saldoConta;

        return infos;

    }

    public String sacarDinheiro() 
    {
        String extrato;
        saldoConta = saldoConta - valorSaque;
        extrato = "Você sacou:" + valorSaque+
                "\nSaldo restante em conta:"+saldoConta; 
        return extrato;
    }

    public String depositarDinheiro() 
    {
        String extrato;
        saldoConta = saldoConta + valorDeposito;
        extrato = "Você depositou:" + valorSaque+
                "\nSaldo novo:"+saldoConta; 
        return extrato;
        
    }

}
