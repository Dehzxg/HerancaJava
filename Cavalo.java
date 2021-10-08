package POOBjeto;

public class Cavalo extends Animal {

	private String saltar;
	
	public Cavalo(String nome,int idade, String som, String saltar) {
		
		super(nome,idade,som);
		this.saltar = saltar;
		
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n O nome do cavalo é: "+getNome()+"\n de idade: "+getIdade()+" anos"+"\n O som emitido por ele é o: "
				+getSom()+
				"\n Saltando uma altura de no máximo: "+saltar);
	}

	public String getSaltar() {
		return saltar;
	}

	public void setSaltar(String saltar) {
		this.saltar = saltar;
	}
	
	
}
