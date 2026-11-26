package br.com.fatec;

public class TesteConcessionaria {
    public static void main(String [] args){
        Concessionaria concessionaria = new Concessionaria();
        System.out.println("Carros no estoque: " + concessionaria.restantes());
        for(int i = 0; i< 3; i++){
            Carro carro = concessionaria.sortear();
            System.err.println("Sorteou: " + carro); 
        }
        System.err.println("Carros no estoque: " + concessionaria.restantes());
    }
}
