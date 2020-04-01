package com.example.aula4.models;

/**
 * Book
 */
public class Book {

    private int id;
    private String nome;
    private String autor;
    private boolean disponivel;
    private int paginas;

    public Book(){}

    public Book(int id, String nome, String autor, boolean disponivel, int paginas){
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.disponivel = disponivel;
        this.paginas = paginas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Book [autor=" + autor + ", disponivel=" + disponivel + ", id=" + id + ", nome=" + nome + ", paginas="
                + paginas + "]";
    }
}