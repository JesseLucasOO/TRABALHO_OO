package oportunidadeEmprego;

public class Endereco {

	private String logradouro;
	private String complemento;
	private int cep;
	private String estado;
	private String cidade;
	private String pais;
	
	// Construtor
	public Endereco(String logradouro, String complemento, int cep, 
					String estado, String cidade, String pais) 
	{
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.pais = pais;
	}
	
	// Gets e sets
	public String getLogradouro()
	{
		return logradouro;
	}
	
	public void setLogradouro(String logradouro)
	{
		this.logradouro = logradouro;
	}
	
	public String getComplemento()
	{
		return complemento;
	}
	
	public void setComplemento(String complemento) 
	{
		this.complemento = complemento;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep)
	{
		this.cep = cep;
	}
	
	public String getEstado() 
	{
		return estado;
	}
	
	public void setEstado(String estado)
	{
		this.estado = estado;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}
	
	public String getPais() 
	{
		return pais;
	}
	
	public void setPais(String pais) 
	{
		this.pais = pais;
	}
	
	@Override
	
	public String toString()
	{
		return "\nLogradouro: "+this.logradouro+"\nComplemento: "+this.complemento+
				"\nCep: "+this.cep+"\nEstado: "+this.estado+"\nCidade: "+this.cidade+
				"\nPais: "+this.pais; 
	}
	
	
}
