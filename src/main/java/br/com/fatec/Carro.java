package br.com.fatec;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter
@AllArgsConstructor

public class Carro implements Comparable <Carro> {
    private String modelo;
    private int potencia;

    public int getTempoDeVolta() {
    return 30 + 6000 / potencia;
    }

    @Override
    public String toString() {
        return modelo + " (" + potencia + " cv)";
    }

    @Override
    public boolean equals(Object obj) {
    if (!(obj instanceof Carro)) {
        return false;
    }
    Carro outro = (Carro) obj; // casting
    return this.modelo.equals(outro.modelo);
}

@Override
public int compareTo(Carro outro) {
    if (this.potencia > outro.potencia)
        return -1; // mais potente vem primeiro
    if (this.potencia < outro.potencia)
        return 1;
    return this.modelo.compareTo(outro.modelo); // empate: alfabética
}

}
