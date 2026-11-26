package br.com.fatec;

public class TesteCarro {
    public static void main( String[] args){
        Carro cheetah = new Carro("Grotti Cheetah", 500);
        Carro banshee = new Carro("Bravato Banshee", 400);
        Carro blista = new Carro("Dinka Blista", 200);
        System.out.println(cheetah + " faz a volta em " + cheetah.getTempoDeVolta() + "s");
        System.out.println(banshee + " faz a volta em " + banshee.getTempoDeVolta() + "s");
        System.out.println(blista + " faz a volta em " + blista.getTempoDeVolta() + "s");
    }
}
