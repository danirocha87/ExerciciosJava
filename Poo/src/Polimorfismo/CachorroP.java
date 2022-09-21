package Polimorfismo;

public class CachorroP extends AnimalP{       

	@Override //--> sobrescrita de método
	public void som() {	
		System.out.println("Som do cachorro: au rrau rau...");
		
	}

	@Override //--> sobrescrita de método
	public void movimento() {	
		System.out.println("Cachorro pulando e correndo...");
		
	}

	

}