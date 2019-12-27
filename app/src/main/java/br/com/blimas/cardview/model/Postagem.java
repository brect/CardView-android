package br.com.blimas.cardview.model;

public class Postagem {

    private String nomeUsuario;
    private String descricaoPostagem;
    private int imagemPostagem;

    public Postagem() {
    }

    public Postagem(String nomeUsuario, String descricaoPostagem, int imagemPostagem) {
        this.nomeUsuario = nomeUsuario;
        this.descricaoPostagem = descricaoPostagem;
        this.imagemPostagem = imagemPostagem;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDescricaoPostagem() {
        return descricaoPostagem;
    }

    public void setDescricaoPostagem(String descricaoPostagem) {
        this.descricaoPostagem = descricaoPostagem;
    }

    public int getImagemPostagem() {
        return imagemPostagem;
    }

    public void setImagemPostagem(int imagemPostagem) {
        this.imagemPostagem = imagemPostagem;
    }
}
