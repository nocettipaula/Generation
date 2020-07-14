package POO;

public class PacienteEx7 
{
	private String nomePaciente;
	private String nomeDoutor;
	private String especialidadeDr;
	
	public PacienteEx7 (String paciente, String doutor, String espDr)
	{
		nomePaciente = paciente;
		nomeDoutor = doutor;
		especialidadeDr = espDr;
		
	}
	public String getConsultaPaciente ()
	{
		String consultaEsp = nomePaciente+ " "+nomeDoutor+" "+especialidadeDr;
		return consultaEsp;
	}
	
}
