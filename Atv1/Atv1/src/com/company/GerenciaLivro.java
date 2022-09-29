package com.company;

import java.util.ArrayList;

public class GerenciaLivro  {
    private ArrayList<Livro> livros;

    public GerenciaLivro (){
        this.livros = new ArrayList<Livro>(livros);
    }

    public void addListLivro(Livro titulo, Livro ID) {
        if(!livros.contains(ID)) {
            livros.add(titulo);
            livros.add(ID);
        }
    }

    public void removeListCliente(Livro titulo, Livro ID){
        livros.remove(titulo);
        livros.remove(ID);
    }

    public ArrayList<Livro> getLivro() {
        return livros;
    }

    public void setLivro(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public Livro buscar(Livro ID){
        if(getLivro().isEmpty()) {
            return null;
        }else {
            return ID;
        }
    }
}
