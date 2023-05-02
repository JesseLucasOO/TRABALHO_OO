package oportunidadeEmprego;

public class MenorAprendiz extends Vaga {

	private String disponibilidade_horario;
	private int idade_min;
	private int idade_max;
	
	// Construtor
	public MenorAprendiz(String disponibilidade_horario, int idade_min, 
						 int idade_max, String cargo, int quantidade, 
						 Exigencia exigencias, String jornada_trabalho, 
						 boolean presencial, boolean remoto, String regiao, 
						 Empresa empresa, String valor_salario, String beneficio)
	{
		super(cargo, quantidade, exigencias, jornada_trabalho, presencial,
				remoto, regiao, empresa, valor_salario, beneficio);
		this.disponibilidade_horario = disponibilidade_horario;
		this.idade_min = idade_min;
		this.idade_max = idade_max;
	}
	// Gets e Sets
	public String getDisponibilidade_horario()
	{
		return disponibilidade_horario;
	}
	
	public void setDisponibilidade_horario(String disponibilidade_horario) 
	{
		this.disponibilidade_horario = disponibilidade_horario;
	}
	
	public int getIdade_min() 
	{
		return idade_min;
	}
	
	public void setIdade_min(int idade_min)
	{
		this.idade_min = idade_min;
	}
	
	public int getIdade_max() 
	{
		return idade_max;
	}
	
	public void setIdade_max(int idade_max) {
		this.idade_max = idade_max;
	}
	
	@Override
	
	public String toString() 
	{
		return "--Tipo de vaga Menor Aprediz--" + disponibilidade_horario +
				"\nIdade minima: " + idade_min
				+ "\nIdade maxima: " + idade_max +super.toString();
	}

}
