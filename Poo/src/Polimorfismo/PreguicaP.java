package Polimorfismo;

public class PreguicaP extends AnimalP {

	@Override // --> sobrescrita de método
	public void som() {
		System.out.println("Som da preguiça: uoxx uoxxe...");

	}

	@Override // --> sobrescrita de método
	public void movimento() {
		System.out.println("Preguiça dormindo na árvore...");

	}

}
