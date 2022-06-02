package br.com.bytebank.banco.java.util.wrappers;

import br.com.bytebank.banco.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ListaDePrimitivoWrapperImplicito {


    public static void main(String[] args) {
        int idade = 20;

        List idades = new ArrayList();
        Cliente cliente = new Cliente();

        // o que ele fez aqui foi que ele transformou o tipo primitivo int no objeto Integer!
        idades.add(idade); //essa transforamacao automatica eh chamada de AUTOBOXING
        idades.add(30);
        idades.add(cliente);

        System.out.println(idades);
    }
}
