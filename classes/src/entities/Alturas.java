package entities;

public class Alturas {
    private String nome;
    private int idade;
    private double altura;

    public Alturas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public double AlturaMedia() {
        return altura / 2;
    }
    public String menores() {
         if (idade < 16) {
            return getNome();
        }
         return null;
    }
}
