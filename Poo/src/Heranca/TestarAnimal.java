package Heranca;

import java.util.Scanner;


		public class TestarAnimal {

			public static void main(String[] args) {

				Scanner input = new Scanner(System.in);

				Cachorro cachorro = new Cachorro();
				Cavalo cavalo = new Cavalo();
				Preguica preguica = new Preguica();

				System.out.println("#### Exemplo de Herança com animais ####\n");

				System.out.println("Insira os dados do Cachorro, Cavalo e Bicho Preguiça:");

				System.out.print("\nNome do cachorro: ");
				cachorro.setNome(input.next());
				System.out.print("Idade: ");
				cachorro.setIdade(input.nextInt());

				System.out.print("\nNome do bicho preguiça: ");
				preguica.setNome(input.next());
				System.out.print("Idade: ");
				preguica.setIdade(input.nextInt());

				System.out.print("\nNome do cavalo: ");
				cavalo.setNome(input.next());
				System.out.print("Idade: ");
				cavalo.setIdade(input.nextInt());

				System.out.println("\nInformações sobre os animais:");

				System.out.println("\n" + cachorro.getNome() + " é um cachorro de " + cachorro.getIdade() + " anos que "
						+ cachorro.getAcao() + " e seu som caracteristico é " + cachorro.getSom() + ".");

				System.out.println(preguica.getNome() + " é uma preguiçuinha de " + preguica.getIdade() + " anos que "
						+ preguica.getAcao() + " e seu som caracteristico é " + preguica.getSom() + ".");

				System.out.println(cavalo.getNome() + " é um cavalo de " + cavalo.getIdade() + " anos que " + cavalo.getAcao()
						+ " e seu som caracteristico é " + cavalo.getSom() + ".");

				input.close();

			}
	}
	