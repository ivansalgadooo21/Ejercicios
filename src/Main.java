import java.util.Scanner;
//import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		/*Ejercicio 1: Programa para transformar grados Celsius a Fahrenheit:
		
		//Creamos el scan
		Scanner scan = new Scanner(System.in);
		
		//Le pediremos al usuario que introduzca los grados
		System.out.print("Introduzca los grados Fahrenheit: \n");
		float far =  scan.nextFloat();
		float cel = ((far - 32)*5)/9;
		System.out.println("El valor en grados Celsius es : " + cel + "ºC");
		scan.close(); //Cerramos el scan
		 */
		
		
		
		
		
		/*Ejercicio 2: Programa que calcule el volumen y el área de una esfera:
	     
	    //Creamos el scan
		Scanner scan = new Scanner(System.in);
		
		//Le pediremos al usuario que introduzca el radio de la esfera
		System.out.println("Introduzca el radio de la esfera: ");
		
		//Declaramos el radio de la esfera
		float radio = scan.nextFloat();
		
		//Declaramos a PI en MAYÚSCULAS como constante, ya que es algo que tiene tanto el área como el volumen
		final float PI = 3.14f;
		
		//Realizaremos los cálculos, empezaremos a declarar la variable de  la fórmula del área 
		float area = 4 * PI * radio * radio;
		
		//Imprimiremos por pantalla el área que hemos calculado y le pondrmeos area de la variable
		System.out.println("El área de la esfera es : " + area);
		
		//Ahora tendremos que calcular el volumen, usaremos el area que hemos calculado
		
		//Y le añadiremos la fórmula del volumen
		System.out.println("El volumen de la esfera es : " + ((area * radio)/3));
		
		scan.close(); //Cerramos el scan
		
		*/
		
		
		
		
		
		
		/*Ejercicio 3: Programa que nos indique mediante números el tipo de nota: suspenso, aprobado, notable, sobresaliente:
		 * 
		//Creamos el scan
		Scanner scan = new Scanner(System.in);
		
		//Aqui le diremos que la nota solo puede ser entre 0 y 10,
		int nota;
		do {
			System.out.println("Introduzca una nota (entre 0 y 10): ");
			nota = scan.nextInt();
			
		} while ( !(nota>= 0 && nota <= 10) );
		
		//Ahora empezaremos con los ifs para calcular las notas y su correspondiencia
		if (nota < 5) {
			System.out.println("Suspenso");
			
		} else  if(nota < 7){
			System.out.println("Aprobado");
			
		} else if(nota < 9) {
			System.out.println("Notable");
					
		} else {
			System.out.println("Sobresaliente");
		}
		
		//Cerramos el scan par que no siga procesando  el programa
		scan.close(); //Cerramos el scan
		*/
		
		
		
		
		
		/*Ejercicio 4: Programa que lea 20 caracteres y muestre número de vocales:
		//Ceramos  el scan
		Scanner  scan = new Scanner (System.in);
		
		//Aqui delaramos las variables que serán contadores que se inician en 0
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		
		//Le indicamos una cadena de caracteres
		String entrada = "hola";
		//Entramos en bucle para empezar a leer teclado
		for(int x = 0; x < 20; x ++) {
			
		//Le decimos al usuario que introduzca el caracter (letra)
			System.out.println("Introduzca un caracter");
			
			//Con esto vamos a leer la siguiente línea que nos lea por teclado
			entrada = scan.nextLine();
			
			
			//Empezamos con el switch case y el break
			switch( entrada) {
				case "a":
					a++;
					break;
					
				case "e":
					e++;
					break;
					
				case "i":
					e++;
					break;
					
				case "o":
					e++;
					break;
					
				case "u":
					e++;
					break;
					
				default: 
					break;			
			} //Fin del switch
		
		} //Fin del for
		System.out.println("Número de a: " + a + "\n"
					+ "Numero de e: " + e + "\n"
					+ "Numero de i: " + i + "\n"
					+ "Numero de o: " + o + "\n"
					+ "Numero de u: " + u + "\n");
					
		scan.close(); //Cerramos el scan
		*/
		
		
		
		
		
		
		/*Ejercicio 5: programa que lea numeros enteros y caracteres y que muestre el resultado:
		
		//Creamos el scan
		Scanner  scan = new Scanner(System.in);
		
		//Declaramos los in y el ch
		int n1, n2;
		String ch = "";
		
		//Empezamos con el bucle mientras (while)
		while(ch!="0") {
			System.out.println("Introduzca el primer número:");
			n1 = scan.nextInt();
			System.out.println("Introduzca el segundo número:");
			n2 = scan.nextInt();
			System.out.println("Selecciona una operación (+,-,*,/,%):\n"
			       + "Pulse 0 para salir. ");
			ch = scan.next();
			
			//Empezamos con el switch y con todos sus casos y sus breaks
			switch (ch){
				case "+":
					System.out.println("El resultado es : " + (n1 + n2));
					
					break;
				case "-":
					System.out.println("El resultado es : " + (n1 - n2));
					break;
					
				case "*":
					System.out.println("El resultado es : " + (n1 * n2));
					break;
					
				case "/":
					System.out.println("El resultado es : " + (n1 / n2));
					break;
					
				case "%":
					System.out.println("El resultado es : " + (n1 % n2));
					break;
				
				case "0":
					System.out.println("Fin del programa");
					break;
				
				default:
					System.out.println("ERROR. Operando incorrecto");
					break;
					
				
			} //Fin del switch
		} //Fin del while
		scan.close(); //Cerramos el scan
		*/
		
		
		
		
		
		
		/*Ejercicio 6: programa que obtenga el programa de 20 valores reales:
		
		//Creamos el scan
		Scanner  scan = new Scanner(System.in);
		
		//Creamos las varibales 
		float num = 0;
		float sum = 0;
		
		for (int i = 0; i < 20; i ++ ) {
			System.out.println("Introduzca el número:");
			num = scan.nextFloat();
			sum += num; //Esto es lo mismo que sum = sum + sum 
			
			
		} //Fin del for
		scan.close(); //Cerramos el scan
		System.out.println("La media es: " + (sum/20));
		/*
	    
		
		
		
		
		
		
		/*Ejercicio 7: programa que calcule el factorial de un número:
		Scanner scan = new Scanner(System.in);
		
		//Creamos las variables
		int n = 0;
		int fac = 1;
		
		//Leemos el numero
		System.out.println ("Introduzca el número:");
		n = scan.nextInt();
		
		//Empezamos a crear el bucle for
		for (int i= 1; i < n; i ++) {
			//System.out.println ("Introduzca el número:");
			fac*=i;
			System.out.println ("El factorial de "  + n +" es: " + fac);
			scan.close();
			
		} //Fin del for
		*/
		
		
		
		
		
		
		/*Ejercicio 8: programa que calcule y haga la suma de números impares:
		
		//Creamos el scan
		Scanner  scan = new Scanner(System.in);
	    //Creamos las variables
		int n = 0;
	    int sum = 0;
	    //Le decimos al usuario que ponga los impares
	    System.out.println("Introduzca el número de impares:");
	    n = scan.nextInt();
	    n = n*2;
	    //Empezamos con el bucle for
	    for(int i  = 1; i < n; i++) {
	    	//sum = sum + i
	    	sum += i;
	    	i++;
	    	
	    }
	    scan.close();
	    //Mostramos por pantalla el resultado final
	    System.out.println("El resultado es: "+ sum);
	    */
	    
	    
	    
	    
	    /*Ejercicio 9: programa que sume los numeros entre 1 y 500  que sean multiplos de 5 y 7:
		//Creamos las variables 
		int res = 0;
		//Creamos el for
		for(int i = 1; i<= 500; i ++) {
			if ((i%5) == 0 && (i%7) == 0){
				res += i;
			}
		}
		//Mostramos el resultado de la suma
		System.out.println("El resultado es : "+ res);
		*/
		
		
		
		
		
		/*Ejercicio 10: programa que muestre si un texto es twitteable o no (supere 280 caracteres):
		//Declaramos la variable
		String tweet ;
		//Creamos el scanner
		Scanner  scan = new Scanner (System.in);
		//Decimos al uruaio
		System.out.println("Introduzca el tweet a twittear:");
		//Declaramos la vartiable al scan
		tweet = scan.nextLine();
		//Empezamos con el bucle for
		if(tweet.length() <= 280) {
			System.out.println("Twitteable");
			
		}else {
			System.out.println("No twitteable");
		}
		//Cerramos el scan
		scan.close();
		*/
		
		
		
		
		
		
		
		/*Ejercicio 11: programa que transforme minutos en días, horas y minutos:
		//Creamos el scann
		Scanner scann = new Scanner (System.in);
		//Creamos las variables
		int minutos = 0;
	    int horas = 0;
	    int dias = 0;
	    //Le pedimos al usuario que nos diga los minutos que desee
		System.out.println("Introduzca los minutos:");
		//Leemos la siguiente linea
		minutos = scann.nextInt();
		//Empezamos con las transformaciones de dias, horas y minutos
		dias = (minutos/60)/24;
		horas = (minutos/60);
		horas = horas - (dias*24);
		minutos= minutos - (horas*60) - (dias*24*60);
		//Una vez hechas las transformaciones mostramos por pantalla cuanto sería en días, horas y minutos
		System.out.println( dias + " dias, " + horas + " horas y " + minutos + " minutos");
		*/
		
		
		
		
		
		
		/*Ejercicio 12
		Scanner scann = new Scanner (System.in);
		//Creamos las variablas 
		int numero, numero2, numero3;
		//Le decimos al usuario que introduzca las 3 números
		System.out.println("introduzca el primer número:");
		numero = scann.nextInt();
		System.out.println("Introduzca el segundo número:");
		numero2 = scann.nextInt();
		System.out.println("introduzca el tercer número:");
		numero3 = scann.nextInt();
		//Empezamos con todas las opciones posibles
		if((numero % 2 == 0 && numero2 % 2 == 0) ||
				(numero2 % 2 == 0 && numero3 % 2 == 0)||
				(numero % 2 == 0 && numero3 % 2 == 0) ) {
			//Aquí indicamos si dos de los números son pares
			System.out.println("Al menos dos de los números son pares");
			//Si no hacemos un else
		}else {
			//Y le indicamos que no hay dos o más números pares
			System.out.println("No hay dos o más numeros pares");
		}
		scann.close();
		*/
		
		
		
		
		
		/*Ejercicio 13:
		//Necesitamos escanear factores
		Scanner scan = new Scanner (System.in);
		int numero1, numero2;
		//Le decimos al usuario que introduzca los 2 números
		System.out.println("introduzca el primer número:");
		numero1 = scan.nextInt();
		System.out.println("Introduzca el segundo número:");
		numero2 = scan.nextInt();
		//Si los dos números son iguales a 0
		if(numero1 == 0 || numero2 == 0){
			System.out.println("El producto es nulo");
			//Si no  le indicamos la segunda opcion
		}else if ((numero1 > 0 && numero2 > 0) || (numero1 < 0 && numero2 < 0)) {
			System.out.println("El producto es positivo");	
			//Si no es positivo ponemos un else
		}else {
			//Y le indicamos que es negativo
			System.out.println("El producto es negativo");
		}
		//Cerramos el scan
		scan.close();
		*/
		
		
		
		
		
		
		/*Ejercicio 14: programa que calcule la potencia de dos números y que compruebe que son positivos:
		//Creamos el scan
		Scanner scan = new Scanner (System.in);
		//Creamos las variables
		int numero, potencia;
		int resultado = 1;
		//leer numeros
		System.out.println("introduzca el  número:");
		numero = scan.nextInt();
		System.out.println("Introduzca la potencia:");
		potencia = scan.nextInt();
		if(numero > 0 && potencia > 0) {
			//Empezamos con el for
			for( int i = 0; i < potencia; i ++) {
				resultado *= numero;//res = res *x
				
			}
			System.out.println( numero + "elevado a " + potencia + " es " + resultado);
			scan.close();
		}else {
			System.out.println("Los números deben de ser naturales");
		}
		*/
		
		
		
		
		
		
		/*Ejercicio 15:
		//Creamos el scan
		Scanner scan = new Scanner (System.in);
		//Declaramos las variables
		float maximo, minimo, entrada;
		//Decimos que intorduzca los números
		System.out.println("Introduce el 1 valor:");
		minimo = maximo =entrada = scan.nextFloat();
		//Empezamos con el bucle for
		for(int i = 1; i < 20; i ++) {
			System.out.println("Introduce el " + ( i+1 )+
					" valor:");
			entrada = scan.nextFloat();
			if(entrada > maximo) {
				maximo= entrada;
			}else if(entrada < minimo) {
				minimo = entrada;
			}
			System.out.println("El máximo es " + maximo + " y el mínimo es"
					+ minimo );
		
		}
		*/
		
		
		
		
		
		
		/*Ejercicio 16: programa que lea un número entre 1 y 9 e indique si es par o primo
		//Creamos el scan
		Scanner scan = new Scanner(System.in);
		//Declaramos la variable
		int numero;
		do {
			//Indicamos al usuario que introduzca el número
			System.out.println("Introduzca el número entre 1 y 9");
			numero = scan.nextInt();
		}while(numero <= 0 || numero >= 10); System.out.println("ERROR"
				+ " número incorrecto");
		if(numero == 4 || numero == 6 || numero >=8) {
			System.out.println(numero + "No es un número primo");
		}else {
			System.out.println(numero + "Es un número primo");
			
		}
		scan.close();
		*/
		
		
		
		
		
		
		/*Ejercicio 17: 
		//Creamos el scan
		Scanner scan = new Scanner(System.in);
		//Declaramos las variables
		int x = -1, max = 0;
		//Empezamos con los do
		do {
			do {
				System.out.println("Escribe un número positivo: \nPulse 0 para salir.");
				x = scan.nextInt();
			} while(x < 0);
			
			if(x > 0){
				if(x > max) {
					System.out.println(x + " es mayor que el anterior");
					max = x;
				} else {
					max = x;
				}
			}
		} while( x!= 0);
		System.out.println("Bye!");
		scan.close();
		*/
		
		
		
		
		
		
		/*Ejercicio 18:programa que lea 10 números enteros positivos, visualice la suma
		//de los números pares de la lista, cuántos pares existen y cuál es la media
		//aritmética de los números impares
		
		//Creamos el scan
		Scanner scan = new Scanner(System.in);
		//Declaramos las variables
		int numero;
		int sumapares = 0;
		int sumaimpares = 0;
		int numeroimpares = 0;
		//Empezamos con el bucle for
		for(int i = 0; i < 10; i ++) {
			System.out.println("Introduzca el "+ (i+1)+ " valor");
			//Escaneamos la siguiente línea de numeros
			numero = scan.nextInt();
			//Si el numero es par
			if(numero%2 == 0) {
				//almacenamos el numero par en el sumatorio sumapares
				sumapares += numero;
				//Si el número no es par (es impar)
			}else {
				//Almacenamos el número impar en el sumatorio sumaimpares
				sumaimpares += numero;
				//Aumentamos en 1 el número de impares
				numeroimpares ++;
			}
		}
		//imprimimos las 3 opciones que se nos dan
		
		//Indicar por pantalla la suma de los pares
		System.out.println("La suma de los pares es " + sumapares);
		//indicar por pantalla la suma de los impares
		System.out.println("La suma de los pares es " + (10 - numeroimpares));
		//Indicar por pantalla la media aritmética de los números impares
		System.out.println("La media de los impares es " + (sumaimpares/numeroimpares));
		//Cerramos el scan
		scan.close();
		*/
		
		
		
		
		/*Ejercicio 20:diseña un algoritmo que lea un número entero por teclado, 
		//visualice sus dígitos y calcule la suma de los dígitos que sean pares. 
		//de un número usaremos un bucle que divida el número por 10 sucesivamente,
		//extraer los dígitos.El resto de cada división corresponde a cada uno de 
		//sus dígitos.
		
		//Creamos el scan
		Scanner scan = new Scanner(System.in);
		//Declaramos las variables
		int numero;
		int resto;
		int sumaPares = 0;
		//Indicamos que introduzca el numero por teclado
		System.out.println("introduzca el número:");
		//Indicamos que nos lea la siguiente línea
		numero = scan.nextInt();
		//Bucle for mientras que el número sea diferente de 0
		while (numero != 0) {
			//Resto es igual al número entre 10
			resto = numero % 10;
			//Si el resto entre 2 nos da 0 como resultado
			if(resto % 2 == 0) {
				//El resto para a ser par y lo sumamos al sumatorio de sumaPares
				sumaPares += resto; //sumPares = sumaPares + resto
				
			}
			numero = numero/10; //numero /= 10
			System.out.println(resto);
			
		}
		//Indicamos cuál es la suma de los pares por pantalla
		System.out.println("La suma de los pares es " + sumaPares);
		//Cerramos el scan
		scan.close();
		*/
		
		
		
		
		
		
	 }
	
}
