package POOBjeto;

public class Preguica extends Animal{
	
	private String subirArvores;
	
	
	public Preguica(String nome, int idade,String som,String subirArvores)
	{
		super(nome,idade,som);
		this.subirArvores = subirArvores;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n O nome da preguiça é: "+getNome()+"\n e a idade dele é: "+getIdade()
		+" anos"
		+ "\n ele emite um som que para humanos é "+getSom()+" para os seres humanos"
		+"\n e sua garras de 10cm tem uma caracterítica de "+subirArvores);
	}

	public String getSubirArvores() {
		return subirArvores;
	}

	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}
	
}
