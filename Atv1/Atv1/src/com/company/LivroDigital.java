package com.company;

public class LivroDigital extends Livro implements AudioBook,EBook{
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public double duracao(){
        return 0;
    }

    @Override
    public String descricao() {
        return null;
        get
    }

    public int paginas(){
        return 0;
    }
}
