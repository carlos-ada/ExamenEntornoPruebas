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

	public Integer funcion3(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
public class Funcion4 {
	public static void main(String[] args) {


		String[] CadenaNombres = { "Javier Melendez", "Carlos Garcia", "Carlos Villar", "Juan Jesus" };

		System.out.println(Funcion4(CadenaNombres));

        }
		public static String Funcion4(String[] CadenaNombres) {
	
			String CadenaConcatenada = null;
			for (int i = 0; i < CadenaNombres.length; i++) {
	
				CadenaConcatenada = CadenaNombres[0] + "-" + CadenaNombres[1] + "-" + CadenaNombres[2] + "-"
						+ CadenaNombres[3];
			}
			CadenaConcatenada = CadenaConcatenada.replaceAll("[AaEeIiOoUu]", "");
			CadenaConcatenada = CadenaConcatenada.replaceAll("[A-Z]", "");
			System.out.println(CadenaConcatenada);
			return CadenaConcatenada;
		}
public class Funcion5{

public static void main(String[] args) {
	}

	public  int Funcion5(int [] num) {

		int tam = num.length;
		int sum = 0; 
		int [] numarray = new int [tam];

		for (int cont = 0; cont < tam; cont++) {
			numarray[cont] = num[cont];
			sum = sum + numarray[cont];
		}
		return sum;
	}
public class Funcion6 {

	    public static void main(String[] args) {

                double [] num1 = {2,8,16,48};
		System.out.println(Funcion6(num1));

	}

	public static double Funcion6(double [] num1) {

        	double [] num2 = new double [num1.length];
        	double z = 4;
        	double w = 4;

	        for (int cont = 0; cont < num1.length; cont++) {

        	    if (num1[cont]%2==0) {

                	num2[cont] = num1[cont]*z; 
                	System.out.print("  Numero Par -->  " + num2[cont]);
            	}else {

               		num2[cont] = num1[cont]*w; 

                	System.out.print("  Numero Impar -->  " +num2[cont]);

            }

        }

		return z;

        }
public class Funcion7 {

public static void main(String[] args) {
        String [] listaDeCadenas = {"Javier", "Carlos", "Limonxelo", "Carlitos"};
        System.out.println(Funcion7(listaDeCadenas));
    }

     public static String Funcion7(String[] listaDeCadenas) {


            if (listaDeCadenas != null) {

                for (int i = 0; i < listaDeCadenas.length; i++) {

                    String cadena = listaDeCadenas[i];

                    if (!cadena.equals("")){
                        listaDeCadenas[i] = cadena.substring(3, 6);
                    }else {
                        cadena ="";
                    }

                }

            } else {
                listaDeCadenas = null;
            }

            return Arrays.toString(listaDeCadenas);

            }
}
public class Funcion8 {

public static void main(String[] args) {
        String [] alumnos = {"Linomenchelo","Cav1nem","Lenendi","Livlad"};
        int [][] tiemposDeTrabajos = { {0,0,0,0} ,  {4,0,3,2}};
        System.out.println(Funcion8(alumnos, tiemposDeTrabajos));
    }
public static boolean Funcion8(String[] alumnos, int[][] tiemposDeTrabajos){
            int t = 400;
    int sumatorio = 0;
    boolean result = true;
    for(int i = 0; i < tiemposDeTrabajos.length; i++){
        sumatorio = 0;
        for(int j = 0; j < tiemposDeTrabajos.length; j++){
            sumatorio += tiemposDeTrabajos[j][i];
        }
        if(sumatorio<=t){
            result = false;
        }
    }
    return result;

    }

