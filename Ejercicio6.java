import java.util.*;
public class Ejercicio6{
	public static void main(String[] args) {
		//definimos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double edad;
		double sumaMayor;
		double sumaMenor;
		double contMayor;
		double contMenor;
		double promMayor;
		double promMenor;
		double i;
		sumaMayor=0;
		sumaMenor=0;
		contMayor=0;
		contMenor=0;
		for (i = 1;i <= 100 ; i++) {
			System.out.println("Ingrese la edad: ");
			edad = scanner.nextDouble();
			if (edad >= 25) {
				sumaMayor = sumaMayor+edad;
				contMayor = contMayor+1;				
			} else{
				sumaMenor = sumaMenor+edad;
				contMenor = contMenor+1;
			}
		}
		promMayor = sumaMayor/contMayor;
		promMenor = sumaMenor/contMenor;
		System.out.println("Promedio de mayores de 25: "+promMayor);
		System.out.println("Promedio de menores de 25: "+promMenor);
	}
}