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
		System.out.println("\n O nome da pregui�a �: "+getNome()+"\n e a idade dele �: "+getIdade()
		+" anos"
		+ "\n ele emite um som que para humanos � "+getSom()+" para os seres humanos"
		+"\n e sua garras de 10cm tem uma caracter�tica de "+subirArvores);
	}

	public String getSubirArvores() {
		return subirArvores;
	}

	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}
	
}
