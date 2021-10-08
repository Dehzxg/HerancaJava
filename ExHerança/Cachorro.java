package POOBjeto;

public class Cachorro extends Animal{
	
	private String velocidade;
	private String abanarRabo;
	
	public Cachorro(String nome, int idade, String som, String velocidade,String abanarRabo)
	{
		super(nome,idade,som);
		this.velocidade = velocidade;
		this.abanarRabo = abanarRabo;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n O nome do cachorro é: "+getNome()+" e tem "+getIdade()+" anos"+"\n ele corre a uma velocidade de média de: "
	+velocidade+ "\n e quando ele está feliz ele acaba "+abanarRabo);
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public String getAbanarRabo() {
		return abanarRabo;
	}

	public void setAbanarRabo(String abanarRabo) {
		this.abanarRabo = abanarRabo;
	}
	
}
