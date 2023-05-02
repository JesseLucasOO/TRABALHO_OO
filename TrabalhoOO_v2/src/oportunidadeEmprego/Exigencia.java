package oportunidadeEmprego;

public class Exigencia {

	private String escolaridade;
	private String habilidade;
	private String idioma;
	
	// Construtor
	public Exigencia(String escolaridade, String habilidade, String idioma) 
	{
		this.escolaridade = escolaridade;
		this.habilidade = habilidade;
		this.idioma = idioma;
	}
	
	// Gets e sets
	public String getEscolaridade() {
		return escolaridade;
	}
	
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	public String getHabilidade() {
		return habilidade;
	}
	
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	@Override
	
	public String toString()
	{
		return "\nEscolaridade: "+this.escolaridade+"\nHabilidades: "+this.habilidade+
				"\nIdioma(s): "+this.idioma; 
	}
	
}
