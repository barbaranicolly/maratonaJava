package entities;

public class Livros {
    private String nome;
    private String autor;
    public double preco;

    public Livros(String nome, String autor, double preco){
    this.nome = nome;
    this.autor = autor;
    this.preco = preco;
}

    public String getNome(){
        return nome;
    }

    public String getAutor(){
        return autor;
    }
    public double getPreco(){
      return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
