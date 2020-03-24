package cassino;

import java.util.Random;

public class Cassino {

	
	//variavel global que inicia como posição 0. cada vez q um jogador faz 5 ponto ele acrescenta +1 na variavel posicao
	static int posicao = 0 ;
	//numeros do jogadores iniciam em 1001
	static int numeroJogador = 1000;

	
	public static void main(String[] args) {
		jogador1.start();
		jogador2.start();
		jogador3.start();
		jogador4.start();
		jogador5.start();
		jogador6.start();
		jogador7.start();
		jogador8.start();
		jogador9.start();
		jogador10.start();
	}
	
	
	static Thread jogador1 = new Thread() {
		public void run() {
			//acrescenta +1 pro jogador iniciar como o nº 1001
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador2 = new Thread() {
		public void run() {
			//acrescenta +1 pro jogador iniciar como o nº 1002
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador3 = new Thread() {
		public void run() {
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador4 = new Thread() {
		public void run() {
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador5 = new Thread() {
		public void run() {
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador6 = new Thread() {
		public void run() {
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador7 = new Thread() {
		public void run() {
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador8 = new Thread() {
		public void run() {
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador9 = new Thread() {
		public void run() {
			numeroJogador++;
			jogar(numeroJogador);
		}
	};
	static Thread jogador10 = new Thread() {
		public void run() {
			numeroJogador++;
			jogar(numeroJogador);
		}
	};


	public static void jogar(int numeroJogador) {
		//jogador inicia com 0 pontos
		int ponto = 0;
		
		//em quanto jogador nao fizer 5 pontos ele vai repetir o laço
		while (ponto < 5) {
			//joga o dado1 e dao2 (gerando valor aleatorio de 1 a 6)
			int dado1 = (int) (new Random().nextInt(6) + 1);
			int dado2 = (int) (new Random().nextInt(6) + 1);
			//se o valor da soma do dado1 e dado2 for 7 ou 11, ele ganha 1 ponto
			if (((dado1 + dado2) == 7) || ((dado1 + dado2) == 11)) {
				ponto++;
			}
			System.out.println("jogador "+numeroJogador+"º. Ponto = "+ ponto);			
		}
		
		//depois de fazer os 5 pontos, é verificado em que posição o jogador esta.
		if (posicao == 0) {
			posicao++;
			System.out.println("Primeiro jogador a fazer 5 pontos: "+numeroJogador+". Ganhou 5000,00");			
		} else if (posicao == 1) {
			posicao++;
			System.out.println("Segundo jogador a fazer 5 pontos: "+numeroJogador+". Ganhou 4000,00");			
		} else if (posicao == 2) {
			posicao++;
			System.out.println("Terceiro jogador a fazer 5 pontos: "+numeroJogador+". Ganhou 3000,00");			
		} else if (posicao > 2) {
			posicao++;
			System.out.println("jogador " + numeroJogador + "º esta em " + posicao + "º posicao. Não ganhou nada");
		}
	};

}
