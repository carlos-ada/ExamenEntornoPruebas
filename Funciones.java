public class Funcion1 {
	public static void main(String[] args) {
		System.out.println(funcion1(40));
	}
		
		static int x = 5;
		
		public static boolean funcion1 (int n){
			int x = 5;
			boolean resp;
			if(n % x == 0) {
				resp= true;
			}else {
				resp=false;
			}
			return n % 5 == 0;
		}
public class Funcion2 {
	
	public static void main(String[] args) {

		System.out.println(Funcion2(153));
	}

	public static Boolean Funcion2(int num) {

		Boolean resp = null;

		int y = 200 - 50;
		int x = 200 + 50;

		if (num <= x && num >= y) {

			resp = true;

		} else {
			resp = false;
		}

		return resp;

	}

	public Object numeroIntervalo(int nextInt) {
		// TODO Auto-generated method stub
		return null;
	}
public class Funcion3 {

		public static void main(String[] args) {
		System.out.println(Funcion3(200));
}
	public static int Funcion3(int num) {


		int x = 5;
		int ymenos = 200-50;
		int ymas = 200+50;
		int rang = (int)Math.floor(Math.random()*(ymas+ymenos));
		int result = 0;

		if (num%x == 0) {
			result = rang%num;
		}

		return result;

	}

}
