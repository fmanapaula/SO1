
public class Exemplo1 {

	static int a = 8;
	static int b = 3;
	
	public static void main(String[] args) {
		tSoma.start();
		tSub.start();
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
}
