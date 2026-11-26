
package br.com.fatec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Campeonato {

    private List<Piloto> pilotos;

    public Campeonato() {
        pilotos = new ArrayList<>();
    }

    public void inscrever(Piloto piloto) {
        if (pilotos.contains(piloto)) {
            System.out.println("Piloto repetido.");
        } else if (pilotos.size() == 4) {
            System.out.println("Grid cheio.");
        } else {
            pilotos.add(piloto);
        }
    }

    public void registrarCorrida(List<Piloto> chegada) {
        int[] pontuacao = {10, 6, 3, 1};

        for (int i = 0; i < chegada.size(); i++) {
            chegada.get(i).somarPontos(pontuacao[i]);

            if (i == 0) {
                chegada.get(i).registrarVitoria();
            }
        }
    }

    public List<Piloto> disputarCorrida(Random gerador, Piloto jogador, boolean nitro) {
        List<Piloto> chegada = new ArrayList<>(pilotos);

        for (Piloto piloto : chegada) {
            piloto.correr(gerador, piloto.equals(jogador) && nitro);
        }

        Collections.sort(chegada, new Comparator<Piloto>() {
            @Override
            public int compare(Piloto p1, Piloto p2) {
                return Integer.compare(p1.getTempo(), p2.getTempo());
            }
        });

        registrarCorrida(chegada);

        return chegada;
    }

    public List<Piloto> getClassificacao() {
        List<Piloto> classificacao = new ArrayList<>(pilotos);

        Collections.sort(classificacao, new Comparator<Piloto>() {
            @Override
            public int compare(Piloto p1, Piloto p2) {

                if (p1.getPontos() != p2.getPontos()) {
                    return Integer.compare(p2.getPontos(), p1.getPontos());
                }

                if (p1.getVitorias() != p2.getVitorias()) {
                    return Integer.compare(p2.getVitorias(), p1.getVitorias());
                }

                return p1.getNome().compareTo(p2.getNome());
            }
        });

        return classificacao;
    }
}

