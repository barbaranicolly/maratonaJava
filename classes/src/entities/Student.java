package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public Student(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public String name() {
        return name;
    }
    public double notaFinal() {
        return grade1 + grade2 + grade3;
    }
    public String PassOrFailed() {
        if (notaFinal() >= 60.0) {
            return "pass";
        } else {
            return "failed";
        }
    }
    public double ifFailed() {
        if (notaFinal() < 60.0) {
            return 60 - notaFinal();
        } else {
            return 0;
        }
    }
}

