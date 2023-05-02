package oportunidadeEmprego;


public abstract class Vaga {

	private String cargo;
	private int quantidade; 
	private Exigencia exigencias;
	private String jornada_trabalho;
	private boolean presencial;
	private boolean remoto;
	private String regiao;
	private Empresa empresa; 
	private String valor_salario;
	private String beneficio; 
	
	// Construtor
	public Vaga(String cargo, int quantidade, Exigencia exigencias, 
				String jornada_trabalho, boolean presencial,
				boolean remoto, String regiao, Empresa empresa, 
				String valor_salario, String beneficio) 
	{
		this.cargo = cargo;
		this.quantidade = quantidade;
		this.exigencias = exigencias;
		this.jornada_trabalho = jornada_trabalho;
		this.presencial = presencial;
		this.remoto = remoto;
		this.regiao = regiao;
		this.empresa = empresa;
		this.valor_salario = valor_salario;
		this.beneficio = beneficio;
	}
	
	// Gets e Sets
	public String getCargo() 
	{
		return cargo;
	}
	

	public void setCargo(String cargo) 
	{
		this.cargo = cargo;
	}
	
	public int getQuantidade() 
	{
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) 
	{
		this.quantidade = quantidade;
	}
	
	public Exigencia getExigencias() 
	{
		return exigencias;
	}
	
	public void setExigencias(Exigencia exigencias) 
	{
		this.exigencias = exigencias;
	}
	
	public String getJornada_trabalho() 
	{
		return jornada_trabalho;
	}
	
	public void setJornada_trabalho(String jornada_trabalho)
	{
		this.jornada_trabalho = jornada_trabalho;
	}
	
	public boolean isPresencial() 
	{
		return presencial;
	}
	
	public void setPresencial(boolean presencial) 
	{
		this.presencial = presencial;
	}
	
	public boolean isRemoto() 
	{
		return remoto;
	}
	
	public void setRemoto(boolean remoto) 
	{
		this.remoto = remoto;
	}
	
	public String getRegiao() 
	{
		return regiao;
	}
	
	public void setRegiao(String regiao) 
	{
		this.regiao = regiao;
	}
	
	public Empresa getEmpresa() 
	{
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa)
	{
		this.empresa = empresa;
	}
	
	public String getValor_salario() 
	{
		return valor_salario;
	}
	
	public void setValor_salario(String valor_salario) 
	{
		this.valor_salario = valor_salario;
	}
	
	public String getBeneficio()
	{
		return beneficio;
	}
	
	public void setBeneficio(String beneficio) 
	{
		this.beneficio = beneficio;
	}
	
	public void listar_vagas()
	{
		System.out.println("Mostrar busca");
	}
	
	public void buscar_cargo()
	{
		System.out.println("Resultado busca");
	}
	
	@Override
	
	public String toString()
	{
		return "\nCargo: "+this.cargo+"\nQuantidade de vagas: "+this.quantidade+
				"\n\n--EXIGENCIAS-- "+ this.exigencias+"\nJornada de trabalho: "+this.jornada_trabalho+
				"\nEh presencial: "+this.presencial+"\nEh remoto: "+this.remoto+
				"\nRegiao: "+this.regiao+"\nSalario: "+this.valor_salario+
				"\nBeneficios: "+this.beneficio+"\n\n--EMPRESA-- "+this.empresa;
	
	}
	
}
