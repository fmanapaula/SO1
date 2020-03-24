
public class Exemplo2 {

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
		int res = a + b;
		System.out.println(a + " + " + b + " = " + res);
		}
	};	
	
	static Thread tSub = new Thread() {
		public void run() {
		int res = a - b;
		System.out.println(a + " - " + b + " = " + res);
		}
	};	
	
	static Thread tMult = new Thread() {
		public void run() {
		int res = a * b;
		System.out.println(a + " * " + b + " = " + res);
		}
	};	
	
	static Thread tDiv = new Thread() {
		public void run() {
		int res = a / b;
		System.out.println(a + " / " + b + " = " + res);
		}
	};	
}
