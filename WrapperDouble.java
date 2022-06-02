package br.com.bytebank.banco.java.util.wrappers;

public class WrapperDouble {


    public static void main(String[] args) {
        Integer numero = Integer.valueOf(123); //autoboxing -> transformando um primitivo em um objeto
        System.out.println(numero.intValue());//unboxing -> transformando um objeto em um primitivo

        Double numero2 = Double.valueOf(342.38);
        System.out.println(numero2.doubleValue());

        Double numero3 = 38291.923; //da no mesmo que fazer a linha 10!

    }
}
