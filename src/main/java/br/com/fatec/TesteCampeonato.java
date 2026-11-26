
package br.com.fatec;
import java.util.ArrayList;
import java.util.List;

public class TesteCampeonato {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Grotti Cheetah", 500);
        Carro carro2 = new Carro("Bravado Banshee", 400);
        Carro carro3 = new Carro("Pegassi Infernus", 480);
        Carro carro4 = new Carro("Dinka Blista", 200);

        Piloto lucia = new Piloto("Lucia", carro1);
        Piloto jason = new Piloto("Jason", carro2);
        Piloto raul = new Piloto("Raul", carro3);
        Piloto cal = new Piloto("Cal", carro4);

        Campeonato campeonato = new Campeonato();

        campeonato.inscrever(lucia);
        campeonato.inscrever(jason);
        campeonato.inscrever(new Piloto("Lucia", carro3));
        campeonato.inscrever(raul);
        campeonato.inscrever(cal);
        campeonato.inscrever(new Piloto("Boobie", carro2));

        // Primeira corrida
        List<Piloto> corrida1 = new ArrayList<>();
        corrida1.add(lucia);
        corrida1.add(jason);
        corrida1.add(raul);
        corrida1.add(cal);

        campeonato.registrarCorrida(corrida1);

        // Segunda corrida
        List<Piloto> corrida2 = new ArrayList<>();
        corrida2.add(raul);
        corrida2.add(cal);
        corrida2.add(jason);
        corrida2.add(lucia);

        campeonato.registrarCorrida(corrida2);

        // Terceira corrida
        List<Piloto> corrida3 = new ArrayList<>();
        corrida3.add(cal);
        corrida3.add(raul);
        corrida3.add(jason);
        corrida3.add(lucia);

        campeonato.registrarCorrida(corrida3);

        // Exibir classificação
        List<Piloto> classificacao = campeonato.getClassificacao();

        for (int i = 0; i < classificacao.size(); i++) {
            System.out.println((i + 1) + ". " + classificacao.get(i));
        }
    }
}

