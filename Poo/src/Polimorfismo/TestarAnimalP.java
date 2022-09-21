package Polimorfismo;
public class TestarAnimalP {
	
	public static void main(String[] args) {
		
		CachorroP cachorro = new CachorroP();
		CavaloP cavalo = new CavaloP();
		PreguicaP preguica = new PreguicaP();
		
		System.out.println("\n#### Exemplos de animais que emitem som e se movimentam de maneiras distintas: ####\n");
		
		cachorro.som();
		cachorro.movimento();
		System.out.println();
		cavalo.som();
		cavalo.movimento();
		System.out.println();
		preguica.som();
		preguica.movimento();
		
		
		
				
	}
}
	

