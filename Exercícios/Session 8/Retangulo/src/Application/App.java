package Application;

import java.util.Locale;
import java.util.Scanner;
import enties.Retangulo;

public class App {

    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Retangulo rect = new Retangulo();

            System.out.println("Enter rectangle width and height:");
            Double width = sc.nextDouble();
            rect.setWidth(width);
            Double height = sc.nextDouble();
            rect.setHeight(height);

            System.out.printf("AREA = %.2f%n", rect.calcArea());
            System.out.printf("PERIMETER = %.2f%n", rect.calcPerimeter());
            System.out.printf("DIAGONAL = %.2f%n", rect.calcDiagonal());

            sc.close();
    }
}
