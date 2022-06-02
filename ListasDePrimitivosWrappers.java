package br.com.bytebank.banco.java.util.wrappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasDePrimitivosWrappers {

    public static void main(String[] args) {
        System.out.println("BYTE");
        byte[] arrayBytes = {10, 20, 30, 40};
        List<Byte> listaByte = new ArrayList<>();
        byte dez = 10;
        listaByte.add(dez);
        listaByte.add((byte)11);
        //listaByte.add(12); -> nao compila tenho que especificar que é um byte pois um int nao cabe em um byte
        System.out.println(listaByte);

        System.out.println("SHORT");
        List<Short> listaShort = new ArrayList<>(Arrays.asList((short)1,(short) 2,(short) 3, (short)4,(short)5));
        System.out.println(listaShort);

        System.out.println("INT");
        int[] inteiros = {8, 20, 30, 50, 30};
        List<Integer> listaInteiros = new ArrayList<>(Arrays.asList(8, 20, 30, 50, 30));
        System.out.println(listaInteiros);

        System.out.println("LONG");
        List<Long> listaLong = new ArrayList<>(Arrays.asList(20L, 30L, 40L, 60L));
        System.out.println(listaLong);

        System.out.println("FLOAT");
        List<Float> listaFloat = new ArrayList<>(Arrays.asList(30.2F, 40.76F, 50.1F));
        System.out.println(listaFloat);

        System.out.println("DOUBLE");
        List<Double> listaDoubles = new ArrayList<>(Arrays.asList(30.0, 21.8, 1.9)); //aqui tu eh obrigado a por doubles!
        System.out.println(listaDoubles);

        System.out.println("CHAR");
        List<Character> listaChars = new ArrayList<>(Arrays.asList('o', 'a'));
        listaChars.add('o');
        System.out.println(listaChars);

        System.out.println("BOOLEAN");
        boolean[] booleans = {false};
        List<Boolean> listaBooleans = new ArrayList<>();
        listaBooleans.add(false);
        System.out.println(listaBooleans);











    }
}
