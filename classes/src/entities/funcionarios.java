package entities;

public class funcionarios {
    public int id;
    public String nome;
    private double salario;

    public funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void NovoSalario(double porcentagem){
        salario = salario + (salario * porcentagem /100);
    }
}
