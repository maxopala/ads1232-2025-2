package ed.pilha;

import java.util.Scanner;

public class TestePilhaExecuco {
    public static void main(String[] args) {
        System.out.println("Numero: ");
        int v = new Scanner(System.in).nextInt();
        ClasseA a = new ClasseA();
        System.out.println("Entrou a.metodoA");
        a.metodoA(v);
        System.out.println("Voltou a.metodoA");
    }
}


class ClasseA {
    public void metodoA(int a) {
        int x = a * 2;
        ClasseB b = new ClasseB();
        System.out.println("Entrou b.metodoB");
        b.metodoB(x, a);
        System.out.println("Voltou b.metodoB");
    }
}

class ClasseB {
    public void metodoB(int a, int b) {
        int y = a * b;
        System.out.println("Entrou b.metodoB2");
        this.metodoB2(a, b, y);
        System.out.println("Voltou b.metodoB2");
    }

    public void metodoB2(int a, int b, int d) {
        int y = a * b + d;
        ClasseC c = new ClasseC();
        System.out.println("Entrou c.metodoC");
        c.metodoC(y);
        System.out.println("Voltou c.metodoC");
    }
}

class ClasseC {
    public void metodoC(int x) {
        System.out.println(x);
    }
}