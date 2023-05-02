package oportunidadeEmprego;

public class Empresa 
{
	
	private String razao_social;
	private Vaga[] vagas = new Vaga[100];
	private Endereco localidade; 
	private Contato meio_contato;
	
	// Construtor
	public Empresa(String razao_social, Vaga[] vagas, 
				   Endereco localidade, Contato meio_contato)
	{
		this.razao_social = razao_social;
		this.vagas = vagas;
		this.localidade = localidade;
		this.meio_contato = meio_contato;
	}
	
	// Gets e Sets
	public String getRazao_social() 
	{
		return razao_social;
	}

	public void setRazao_social(String razao_social) 
	{
		this.razao_social = razao_social;
	}

	public Vaga[] getVagas()
	{
		return vagas;
	}

	public void setVagas(Vaga[] vagas)
	{
		this.vagas = vagas;
	}

	public Endereco getLocalidade() 
	{
		return localidade;
	}

	public void setLocalidade(Endereco localidade) 
	{
		this.localidade = localidade;
	}

	public Contato getMeio_contato() 
	{
		return meio_contato;
	}

	public void setMeio_contato(Contato meio_contato)
	{
		this.meio_contato = meio_contato;
	}
	
	public void buscar_empresa()
	{
		System.out.println("Mostrar empresa");
	}
	
	public void mostrar_vagas()
	{
		System.out.println("Mostrar vagas empresa");
	}
	
	@Override
	
	public String toString()
	{
		return"\nRazao social: "+this.razao_social+"\nVagas ofertadas: "+this.vagas+
				"\n--Endereco-- "+this.localidade+"\n--Meios de contato--"+this.meio_contato;
	}
}
