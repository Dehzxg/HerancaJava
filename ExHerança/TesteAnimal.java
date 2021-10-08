package POOBjeto;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Myke",6,"auau","50","abanar rabo");
		dog.imprimirInfo();
		dog.setNome("Nick Fury");
		dog.imprimirInfo();
		
		System.out.println("\n\t *****************************");
		
		Cavalo alazao1 = new Cavalo("Alazao Jr",4,"relincho","12");
		alazao1.imprimirInfo();
		
		System.out.println("\n\t *****************************");
		
		Preguica jorge = new Preguica("Jorge Henrique",23,"uma incógnita","Subir em árvores");
		jorge.imprimirInfo();

		
	}

}
