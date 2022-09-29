package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GerenciaUsuario usuario = new GerenciaUsuario();
        int op;

        do{
            menu();
            op = in.next().charAt(0);
            switch (op){
                case 1:
                    String nomeUsuario = in.nextLine();
                    String cpf = in.nextLine();
                    usuario.setCliente();
                    usuario.buscar("232");
                    usuario.addListCliente(cpf);
                    usuario.addListCliente();
                    System.out.println(nomeUsuario);
                    System.out.println(cpf);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
            }
        } while (op!=0);
    }

    public static void menu(){
        System.out.println("Selecione uma das opções: \n" +
                "1) Cadastrar um novo usuario \n" +
                "2) Cadastrar um novo livro \n" +
                "3) Pegar um livro de emprestimo \n" +
                "4) Devolver um livro \n" +
                "0) Fechar o programa \n");
    }
}
