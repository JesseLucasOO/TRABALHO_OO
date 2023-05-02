package oportunidadeEmprego;

public class CLT extends Vaga{
	
	private int idade_min;
	private boolean possui_clt;
	
	// Construtor
	public CLT(String cargo, int quantidade, Exigencia exigencias, 
			String jornada_trabalho, boolean presencial,
			boolean remoto, String regiao, Empresa empresa, 
			String valor_salario, String beneficio, int idade_min, boolean possui_clt)
	{
		super(cargo, quantidade, exigencias, jornada_trabalho, 
				presencial, remoto, regiao, empresa, valor_salario,
				beneficio);
		this.idade_min = idade_min;
		this.possui_clt = possui_clt;
	}

	// Gets e Sets
	public int getIdade_min() {
		return idade_min;
	}

	public void setIdade_min(int idade_min) {
		this.idade_min = idade_min;
	}

	public boolean isPossui_clt() {
		return possui_clt;
	}

	public void setPossui_clt(boolean possui_clt) {
		this.possui_clt = possui_clt;
	}

	@Override
	
	public String toString() 
	{
		return "--Tipo de vaga CLT--\nIdade minima exigida: " + idade_min + 
				"\nCandidato possui CLT: " + possui_clt +
				super.toString();
	}
	
}
