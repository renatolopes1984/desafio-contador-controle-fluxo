package contador.desafio;

import java.util.Scanner;


public class Contador {

	public static void main(String[] args) {
		//CHAMANDO SCANNER PARA INTERAÇÃO COM O USUÁRIO SOLICITANDO DOIS NÚMEROS INTEIROS:
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//CHAMANDO O MÉTODO CONTENDO A LÓGICA DE CONTAGEM
			contar(parametroUm, parametroDois);
			
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Atenção: O segundo parâmetro deve ser maior que o primeiro.");			
		}

	}



	static void contar(int parametroUm, int parametroDois)  throws ParametrosInvalidosException {
		//VALIDAR SE parametroUm é MAIOR QUE parametroDois E LANÇAR A EXCEÇÃO
		if(parametroUm > parametroDois) 
			throw new ParametrosInvalidosException();
				
		//REALIZAR O for PARA IMPRIMIR OS NÚMEROS COM BASE NA VARIÁVEL CONTAGEM
		int contagem = parametroDois - parametroUm;
	
		for(contagem=1; contagem <= parametroDois - parametroUm; contagem++) {
			System.out.println("Imprimindo os números " + contagem);
		}
		
	}
		
	
}
