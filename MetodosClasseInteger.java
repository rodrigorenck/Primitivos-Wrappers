package br.com.bytebank.banco.java.util.wrappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosClasseInteger {


    public static void main(String[] args) {
        Integer numero = Integer.valueOf(30); //AUTOBOXING - transformando o primitivo em referencia
        int numero1 = numero.intValue(); //UNBOXING - transformando a referencia em primitivo

        Integer numero2 = 31; //AUTOBOXING automatico

        int numero3 = 100;


        List<Integer> listaInteiros = new ArrayList<>(Arrays.asList(numero, numero1, numero2, 600, 50));

        listaInteiros.add(numero3); //fez o AUTOBOXING automatico - transformou o primtivo em Integer
        listaInteiros.add(193); //fez o AUTOBOXING automatico - transformou o primtivo em Integer

        for(Integer inteiro : listaInteiros){
            System.out.println(inteiro);
        }


        //PARSING -> transformando uma String em um int
        String numeroDez = "10";
        System.out.println(numeroDez + 10); //printa 1010

        //valueOf (String) retorna um novo objeto Integer () enquanto parseInt (String) retorna um int primitivo.
        //transformamos uma String em Int
        int numero10 = Integer.parseInt(numeroDez); //transformamos o "10" em 10 (int)

        System.out.println(numero10 + 10);//printa 20

        String dez = Integer.toString(10);//transformamos o 10 (int) em "10"

        dez  = dez + "20";
        System.out.println(dez); //printa 1020;

        //CONSTANTES
        System.out.println("MAIOR: " + Integer.MAX_VALUE);
        System.out.println("MENOR: " + Integer.MIN_VALUE);
        System.out.println("BYTES: " + Integer.BYTES);
        System.out.println("SIZE: " + Integer.SIZE);
        System.out.println("TYPE: " + Integer.TYPE);


        //outra maneira de transformar uma String em int -> se
        String fakeNum = "100"; //se aqui nao fosse um numero em String eu tomaria uma Exception
        int numTeste = Integer.valueOf(fakeNum);
        System.out.println(numTeste);


        //transformando Integer em double
        Integer salario = 1000;
        System.out.println(salario.doubleValue());

        //transformando em Float
        float fl = salario.floatValue();

        //transformando double em int
        Double numeco = 10.32;

        int numecoInteiro = numeco.intValue();
        System.out.println(numecoInteiro);





    }
}
