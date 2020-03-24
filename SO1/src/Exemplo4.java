
public class Exemplo4 {

	static int a = 8;
	static int b = 3;

	public static void main(String[] args) {
		tSoma.start();
		tSub.start();
		tMult.start();
		tDiv.start();
	}

	static Thread tSoma = new Thread() {
		public void run() {
			calc(a, b, 0);
		}
	};

	static Thread tSub = new Thread() {
		public void run() {
			calc(a, b, 1);
		}
	};

	static Thread tMult = new Thread() {
		public void run() {
			calc(a, b, 2);
		}
	};

	static Thread tDiv = new Thread() {
		public void run() {
			calc(a, b, 3);
		}
	};

	public static void calc(int a, int b, int tipoOperacao) {
		int res = 0;
		String op = "";
		switch (tipoOperacao) {
		case 0:
			res = a + b;
			op = "+";
			break;
		case 1:
			res = a - b;
			op = "-";
			break;
		case 2:
			res = a * b;
			op = "*";
			break;
		case 3:
			res = a / b;
			op = "/";
			break;
		}
		int tempoEspera = (int) (Math.random() * 1000);
		try {
			Thread.sleep(tempoEspera);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(a + " " + op + " " + b + " = " + res);
	};

}
