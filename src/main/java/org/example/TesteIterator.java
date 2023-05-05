package org.example;

import java.util.Iterator;

public class TesteIterator {
    public static void main(String[] args) {
        Colecao colecao = new ColecaoNumeros();
        Iterator<Integer> iterator = colecao.criarIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
