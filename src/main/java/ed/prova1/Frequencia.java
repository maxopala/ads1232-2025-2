package ed.prova1;

public class Frequencia {
    private String s;
    private int count;

    public Frequencia() {
    }

    public Frequencia(String s, int count) {
        this.s = s;
        this.count = count;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("[%2d] %s", count, s);
    }
}
