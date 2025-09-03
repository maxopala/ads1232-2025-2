package teste;

import teste.animais.Animal;

public class AnimalEngine {
    public void executarSons(Animal[] animais) {
        System.out.println("Reproduzindo o som dos animais");
        for (Animal animal : animais) {
            System.out.println(animal.fazerBarulho());
        }
        System.out.println("Fim da reprodução.");
    }
}
