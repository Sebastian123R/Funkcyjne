public class Fibonacci {
	public static void main(String[] args) {
		long a=0, b=1;
		for(int i=1; i < 10000; i++){
			long suma= a + b;
			a=b;
			b=suma;
			System.out.println(i + ". "+ suma);
		}
	}
}