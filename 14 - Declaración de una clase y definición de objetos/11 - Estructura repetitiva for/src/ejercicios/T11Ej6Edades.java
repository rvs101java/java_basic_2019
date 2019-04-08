package ejercicios;

import java.util.Scanner;

public class T11Ej6Edades {

	public static void main(String[] args) {

		int turnoMa�ana = 50;
		int edadMa = 0;
		int edadMa�ana = 0;
		int mediaMa�ana = 0;

		int turnoTarde = 60;
		int edadTa = 0;
		int edadTarde = 0;
		int mediaTarde = 0;

		int turnoNoche = 110;
		int edadNo = 0;
		int edadNoche = 0;
		int mediaNoche = 0;

		for (int x = 1; x <= turnoMa�ana; x++) {
			edadMa = (int) (Math.random() * (14 + 16) + 2);
			System.out.println(x + " - Edad por la ma�ana: " + edadMa);
			edadMa�ana += edadMa;
		}
		mediaMa�ana = (edadMa�ana / turnoMa�ana);

		for (int x = 1; x <= turnoTarde; x++) {
			edadTa = (int) (Math.random() * (14 + 16) + 2);
			System.out.println(x + " - Edad por la tarde: " + edadTa);
			edadTarde += edadTa;
		}
		mediaTarde = (edadTarde / turnoTarde);

		for (int x = 1; x <= turnoNoche; x++) {
			edadNo = (int) (Math.random() * (14 + 16) + 2);
			System.out.println(x + " - Edad por la noche: " + edadNo);
			edadNoche += edadNo;
		}
		mediaNoche = (edadNoche / turnoNoche);

		System.out.println("- Promedio de edad de la ma�ana: " + mediaMa�ana);
		System.out.println("- Promedio de edad de la tarde: " + mediaTarde);
		System.out.println("- Promedio de edad de la noche: " + mediaNoche);

		if ((mediaMa�ana <= mediaTarde) && (mediaTarde <= mediaNoche)) {
			System.out.println("El turno de noche tiene la media mayor: " + mediaNoche);
		}
		if ((mediaNoche <= mediaMa�ana) && (mediaMa�ana <= mediaTarde)) {
			System.out.println("El turno de noche tiene la media mayor: " + mediaTarde);
		}
		if ((mediaNoche <= mediaTarde) && (mediaTarde <= mediaMa�ana)) {
			System.out.println("El turno de noche tiene la media mayor: " + mediaMa�ana);
		}

	}
}

class Sol8 {

	public static void getSol7() {
		Scanner teclado = new Scanner(System.in);
		int f, edad, suma1, suma2, suma3, pro1, pro2, pro3;
		suma1 = 0;
		suma2 = 0;
		suma3 = 0;

		for (f = 1; f <= 50; f++) {
			System.out.println("Ingrese edad :");
			edad = teclado.nextInt();
			suma1 = suma1 + edad;
		}
		
		pro1 = suma1 / 50;
		System.out.println("Promedio de edades del turno ma�ana");
		System.out.println(pro1);

		for (f = 1; f <= 60; f++) {
			System.out.println("Ingrese edad :");
			edad = teclado.nextInt();
			suma2 = suma2 + edad;
		}
		
		pro2 = suma2 / 60;
		System.out.println("Promedio de edades del turno tarde");
		System.out.println(pro2);

		for (f = 1; f <= 110; f++) {
			System.out.println("Ingrese edad :");
			edad = teclado.nextInt();
			suma3 = suma3 + edad;
		}
		
		pro3 = suma3 / 110;
		System.out.println("Promedio de edades del turno noche");
		System.out.println(pro3);

		teclado.close();

		System.out.print("Promedio de edades del turno noche:");
		System.out.println(pro3);

		if ((pro1 < pro2) && (pro1 < pro3)) {
			System.out.println("El turno ma�ana tiene un promedio menor de edades: " + pro1);
		} else {
			if (pro2 < pro3) {
				System.out.println("El turno tarde tiene un promedio menor de edades: " + pro2);
			} else {
				System.out.println("El turno noche tiene un promedio menor de edades: " + pro3);
			}
		}
	}
}
