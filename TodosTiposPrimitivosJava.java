package br.com.bytebank.banco.java.util.wrappers;

public class TodosTiposPrimitivosJava {

    public static void main(String[] args) {
        byte oitoBits = 100;
        byte maiorBite = Byte.MAX_VALUE;
        System.out.println("Maior byte: " + maiorBite);

        short dezesseisBits = 30000;
        short maiorShort = Short.MAX_VALUE;
        System.out.println("Maior short: " + maiorShort);

        int trintaEdoisBits = 100000000;
        int maiorInt = Integer.MAX_VALUE;
        System.out.println("Maior int: " +maiorInt);

        long sessentaEquatroBitsInteiro = 10;
        long maiorLong = Long.MAX_VALUE;
        System.out.println("Maior long: " +maiorLong);

        //tem que colocar o f para falar que é um float se nao ele vai pensar que é double e como double é 64 bits nao cabe em float que é 32
        float trintaEdoisBitsF = 1.456f;
        //     float trintaEdoisBitsF = (float) 1.456; -> ou fazer o cast
        float maiorFloat = Float.MAX_VALUE;
        System.out.println("Maior float: " +maiorFloat);

        double sessentaEquatroBitsDouble = 1.4859038325574;
        double maiorDouble = Double.MAX_VALUE;
        System.out.println("Maior double: " +maiorDouble);

        char dezesseisBitsChar = 'c';
        char maiorChar = Character.MAX_VALUE;
        System.out.println("Maior char: " +maiorChar);// printa o maior valor da tabela ASCII


        boolean umBit = true;
        boolean booleanWrapper = Boolean.FALSE;
        System.out.println("Boolean: " +booleanWrapper);
    }
}
