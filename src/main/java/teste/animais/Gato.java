package teste.animais;

public class Gato extends AnimalAbstrato {
    @Override
    public String fazerBarulho() {
        return mia();
    }

    public String mia() {
        return "Miauuuuuuuuu!";
    }
}
