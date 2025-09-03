package teste;

import teste.animais.Animal;
import teste.animais.Cao;
import teste.animais.Galinha;
import teste.animais.Gato;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        AnimalEngine animalEngine = new AnimalEngine();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos animais tu quer? ");
        int count = scanner.nextInt();

        Animal[] animais = new Animal[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Qual? [1] Cao | [2] Gato | [3] Galinha");
            int t = scanner.nextInt();

            Animal a;

            if (t == 1) {
                a = new Cao();
            } else if (t == 2) {
                a = new Gato();
            } else if (t == 3) {
                a = new Galinha();
            } else {
                throw new RuntimeException("Esse nao, mano.");
            }

            animais[i] = a;
        }

        animalEngine.executarSons(animais);
    }
}
