package entities;

public class Grades {
    public double n1, n2, n3, n4;

    public double average() {
        double finalGrade = (n1 + n2 + n3 + n4) / 4;
        return finalGrade;
        }
}
