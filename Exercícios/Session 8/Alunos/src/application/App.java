package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno student = new Aluno();
        
        String name = sc.nextLine();
        Double grade1 = sc.nextDouble();
        Double grade2 = sc.nextDouble();
        Double grade3 = sc.nextDouble();
        
        student.setN1(grade1);
        student.setN2(grade2);
        student.setN3(grade3);
        student.setName(name);

        student.results();
    }
}