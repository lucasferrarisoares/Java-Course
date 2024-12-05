package Application;

import java.util.Locale;
import java.util.Scanner;
import enties.Employee;

public class App {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            Employee emp = new Employee();

            System.out.print("Name: ");
            String name = sc.nextLine();
            emp.setName(name);
            System.out.print("Gross salary: ");
            Double grossSalary = sc.nextDouble();
            emp.setGrossSalary(grossSalary);
            System.out.print("Tax: ");
            Double tax = sc.nextDouble();
            emp.setTax(tax);

            System.out.println();
            System.out.println("Employee: " + emp);
            System.out.println();
            System.out.print("Which percentage to increase salary? ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
            
            System.out.println();
            System.out.println("Updated data: " + emp);
            sc.close();
    }
}