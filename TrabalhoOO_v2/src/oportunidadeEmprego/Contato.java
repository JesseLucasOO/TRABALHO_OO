package oportunidadeEmprego;

public class Contato 
{
	private int numero_telefone;
	private String email;
	
	// Construtor
	public Contato(int numero_telefone, String email) 
	{
		this.numero_telefone = numero_telefone;
		this.email = email;
	}
	// Gets e sets
	public int getNumero_telefone()
	{
		return numero_telefone;
	}
	
	public void setNumero_telefone(int numero_telefone)
	{
		this.numero_telefone = numero_telefone;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}	
	
	@Override
	
	public String toString()
	{
		return "\nTelefone: "+this.numero_telefone+"\nEmail: "+this.email;
	}
}
