package ed.lista;

import teste.animais.Animal;
import teste.animais.Galinha;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayList2 {
    public static void main(String[] args) {
        // Criar um programa que:
        /*
        Define uma classe de Animal.
        Define métodos para essa classe (fazer barulho)
        Cria as classes Cao, Gato e Galinha
        implementa o método do barulho
        Cria uma função que recebe uma lista de Animal
        Imprime todos os barulhos de cada animal.

        Se o animal for galinha, deve chamar o método de botar ovos também.
        O método, que só tem dentro da classe Galinha deve gerar um npúmero
             aleatório de ovos entre 1 e 5 e imprimir uma chamada ao metodo
              de barulho para cada ovo posto.
         */

        Animal a = null;

        int count;
        if (a instanceof Galinha) {
            count = ((Galinha)a).botarOvos();
        } else {
            count = 1;
        }
    }
}
