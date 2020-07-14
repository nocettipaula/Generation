package POO;

public class FuncionarioEx4
{
	private String nome;
	private String cargo;
	private int horario;
	
	
	
	public FuncionarioEx4(String nome, String cargo, int horario) {
		this.nome = nome;
		this.cargo = cargo;
		this.horario = horario;
	}



	public void trabalhar() {
		if (horario == 8) 
		{
		System.out.printf("O funcionario" + nome + "está no horario de trabalho");
		} 
	else {
	System.out.printf("O funcionario" + nome + "NÃO está no horario de trabalho");
		}
}
	}
