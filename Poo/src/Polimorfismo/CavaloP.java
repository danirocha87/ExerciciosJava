package Polimorfismo;

public class CavaloP extends AnimalP {

	@Override //
	public void som() {
		System.out.println("Som do cavalo: rinhé rinhé...");

	}

	@Override // --> sobrescrita de método
	public void movimento() {
		System.out.println("Cavalo correndo...");

	}

}