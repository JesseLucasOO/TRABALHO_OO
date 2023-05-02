package oportunidadeEmprego;

public class Estagio extends Vaga{

	private String instituicao_ensino_superior;
	private String periodo;
	private boolean remuneracao;
	
	// Construtor
	public Estagio(String cargo, int quantidade, Exigencia exigencias, 
			String jornada_trabalho, boolean presencial,
			boolean remoto, String regiao, Empresa empresa, String valor_salario, 
			String beneficio, String instituicao_ensino_superior, 
			String periodo, boolean remuneracao) 
	{
		super(cargo, quantidade, exigencias, jornada_trabalho, presencial, remoto, 
			  regiao, empresa, valor_salario,beneficio);
		this.instituicao_ensino_superior = instituicao_ensino_superior;
		this.periodo = periodo;
		this.remuneracao = remuneracao;
	}
	
	// Gets e Sets
	public String getInstituicao_ensino_superior() {
		return instituicao_ensino_superior;
	}


	public void setInstituicao_ensino_superior(String instituicao_ensino_superior) {
		this.instituicao_ensino_superior = instituicao_ensino_superior;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public boolean isRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(boolean remuneracao) {
		this.remuneracao = remuneracao;
	}
	
	@Override
	
	public String toString() 
	{
		return "--Tipo de vaga Estagio--" + instituicao_ensino_superior + "\nPeriodo: " + periodo
				+ "Remuneracao: " + remuneracao +super.toString();
	}
	
}
