package exercicios;
import java.util.Scanner;

public class raio {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		double raio;
		double PI = 3.14;
		double area;
		
		System.out.print("Digite o raio do circulo: ");
		raio = input.nextDouble();
		
		area = PI *(raio * raio);
		System.out.print("A área do circulo  é essa: " +area);
		
	}

}
