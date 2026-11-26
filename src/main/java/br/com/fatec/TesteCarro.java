package br.com.fatec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCarro {
    
    public static void main( String[] args){
        Carro cheetah = new Carro("Grotti Cheetah", 500);
        Carro banshee = new Carro("Bravato Banshee", 400);
        Carro blista = new Carro("Dinka Blista", 200);
        System.out.println(cheetah + " faz a volta em " + cheetah.getTempoDeVolta() + "s");
        System.out.println(banshee + " faz a volta em " + banshee.getTempoDeVolta() + "s");
        System.out.println(blista + " faz a volta em " + blista.getTempoDeVolta() + "s");

    System.out.println("Iguais? " + cheetah.equals(new Carro("Grotti Cheetah", 500)));
    System.out.println("Iguais? " + cheetah.equals(new Carro("Pegassi Infernus", 500)));


    List<Carro> lista = new ArrayList<>();
    lista.add(blista);
    lista.add(new Carro("Ocelot Pariah", 500));
    lista.add(banshee);
    lista.add(cheetah);

    Collections.sort(lista);
    System.out.println(lista);
    }
}
