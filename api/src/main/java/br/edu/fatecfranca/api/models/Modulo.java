package br.edu.fatecfranca.api.models;

public class Modulo {

    private String titulo;
    private String conteudo;
    private Integer cargaHoraria;

    // Construtor genérico
    public Modulo() {
    }

    // Construtor personalizado completo, com todos os atributos
    public Modulo(
            String titulo,
            String conteudo,
            Integer cargaHoraria) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
