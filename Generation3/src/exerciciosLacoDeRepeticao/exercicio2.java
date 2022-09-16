package exerciciosLacoDeRepeticao;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.//

public class exercicio2 {
	
	public static void main(String[] args) {
		
				final int xf=10;
				int n,x,nPar=0,nImpar=0;
				
				Scanner leia = new Scanner(System.in);
				
				for(x=1;x<=xf;x++) {
				System.out.println("Digite um número inteiro:");
				n = leia.nextInt();
						if(n%2==0) {
							nPar++;
						}else {
							nImpar++;
						}
				
				}
				System.out.println("\nForam informados "+nPar+" número(s) par(es) e "+nImpar+" número(s) ímpar(es).");
			}

}
