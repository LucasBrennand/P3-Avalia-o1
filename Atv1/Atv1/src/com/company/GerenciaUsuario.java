package com.company;

import java.util.ArrayList;

public class GerenciaUsuario {
    private ArrayList<Usuario> clientes;

    public GerenciaUsuario (){
        this.clientes = new ArrayList<Usuario>(clientes);
    }

    public void addListCliente(Usuario nome, Usuario CPF) {
        if (!clientes.contains(CPF)) {
            clientes.add(nome);
            clientes.add(CPF);
        }
    }
    public void removeListCliente(String usuarios, Usuario CPF){
        clientes.remove(usuarios);
        clientes.remove(CPF);
    }

    public ArrayList<Usuario> getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList<Usuario> usuarios) {
        this.clientes = usuarios;
    }

    public Usuario buscar(Usuario CPF){
        if(getCliente().isEmpty()) {
            return null;
        }else {
            return CPF;
        }
    }
}
