package teste.animais;

public class Cao extends AnimalAbstrato {
    @Override
    public String fazerBarulho() {
        return late();
    }

    public String late() {
        return "Au au!";
    }
}
