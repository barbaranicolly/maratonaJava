package entities;

public class Carros {
    private String modelo;
    private int ano;
    private double combustivel;

    public Carros(String modelo, int ano, double combustivel) {
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }
public double abastacer(double quantidade){
        return combustivel += quantidade;
}
public double retirar(double quantidade){
        return combustivel -= quantidade;
}
    public String toString() {
        return "modelo: " + modelo + " ano: " + ano + " combustivel: " + combustivel;
    }
}

