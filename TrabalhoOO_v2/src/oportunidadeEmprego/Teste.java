package oportunidadeEmprego;

public class Teste 
{
	public static void main(String[] args)
	{
		// Declarações
		Contato contato1 = new Contato(997654321, "steve@email.com");
		Endereco endereco1 = new Endereco("Quadra 19, Conjunto H, Avenida Los Santos", "Edificio MazeBank", 
											872901047, "Acre", "Rio Branco", " Brasil");
		Exigencia exigencia1 = new Exigencia("Ensino Medio Completo", "Saber POO", "Ingles e Espanhol");
		Empresa empresa1 = new Empresa("Gambiarra.Inc", null, endereco1, contato1);
		CLT clt1 = new CLT("Engenheiro", 02, exigencia1, "Das 10hs as 17hs", true, false,
							"DF", empresa1, "A combinar", "Plano de saude, transporte e alimentacao", 18, true);
		// Instruções
		System.out.println(clt1);
	}
}
