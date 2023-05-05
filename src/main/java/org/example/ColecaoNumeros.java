package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColecaoNumeros implements Colecao{
    private List<Integer> numeros = new ArrayList<>();

    public ColecaoNumeros() {
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
    }
    @Override
    public Iterator<Integer> criarIterator() {
        return null;
    }
}
