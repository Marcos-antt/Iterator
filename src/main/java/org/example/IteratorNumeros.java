package org.example;
import java.util.Iterator;
import java.util.List;

public class IteratorNumeros implements Iterator<Integer> {
    private List<Integer> numeros;
    private int posicao = 0;

    public IteratorNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public boolean hasNext() {
        return posicao < numeros.size();
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return numeros.get(posicao++);
        }
        return null;
    }
}
