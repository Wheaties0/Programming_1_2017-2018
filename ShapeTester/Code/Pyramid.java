import java.util.Scanner;
import java.lang.Math.*;

public class Pyramid {
	float Height;
	float Breadth;
	float Length;

	 public void Volume() {
	 	System.out.println("Volume Calculator for Pyramid");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Length Value");
		float Length = keyboard.nextFloat();
		System.out.println("Enter Height Value");
		float Height = keyboard.nextFloat();
		System.out.println("Enter Breadth Value");
		float Breadth = keyboard.nextFloat();

		float Volume = (Length * Height * Breadth) / 3;

		System.out.println("The Volume of your Pyramid is " + Volume);
	}
}

// 	public void SurfaceArea() {
// 		System.out.println("Surface Area Calculator for Pyramid");
// 		Scanner keyboard = new Scanner(System.in);
// 		System.out.println("Enter Length Value");
// 		float Length = keyboard.nextFloat();
// 		System.out.println("Enter Height Value");
// 		float Height = keyboard.nextFloat();
// 		System.out.println("Enter Breadth Value");
// 		float Breadth = keyboard.nextFloat();

// 		float SurfaceArea = (2 * Length * Breadth) + (2 * Length * Height) + (2 * Height * Breadth);

// 		System.out.println("The Surface Area of your Pyramid is " + SurfaceArea);
// 	}
// }
// }