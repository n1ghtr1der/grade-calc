package app;

import entities.Grades;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner receiver = new Scanner(System.in);
        Grades grade;

        grade = new Grades();
        System.out.print("Enter the first exam grade: ");
        grade.n1 = receiver.nextDouble();
        System.out.print("Enter the second exam grade: ");
        grade.n2 = receiver.nextDouble();
        System.out.print("Enter the third exam grade: ");
        grade.n3 = receiver.nextDouble();
        System.out.print("Enter the fourth exam grade: ");
        grade.n4 = receiver.nextDouble();
        receiver.close();

        double finalGrade = grade.average();
        System.out.printf("The final grade is: %.2f", finalGrade);
    }
}
