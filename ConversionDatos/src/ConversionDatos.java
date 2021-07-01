
public class ConversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Tipos de datos en Java
		 * Numericos: byte, short, int, long, double
		 * Booleanos: (Verdadero, falso): boolean
		 * Caracteres: char
		 * Cadenas: String
		 * */
		
		int numero1 = 1000;
		long numero2 = numero1;
		float numero3 =numero2;
		/**
		 * Byte 8 bits
		 * Short 16 bits
		 * Int 32 bits
		 * Long 64 bits
		 * */
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		
		//Este proceso no se puede hacer de forma inversa
		byte numeroPequeno = 122;
		byte otroNumeroPequeno = 122;
		//Recordemos que un byte puede almacenar de -128 a 127
		//int almacena de -231 a 231
		//Por ello usamos el tipo de dato int para que no tegamos errores
		int suma = numeroPequeno + otroNumeroPequeno;
		System.out.println(suma);
		
		//Casteo de tipos de datos:
		long num1 = 1000;
		int num2 = (int) numero1; //Casteo de long a int
		float num3 = numero2;
		
	}

}
