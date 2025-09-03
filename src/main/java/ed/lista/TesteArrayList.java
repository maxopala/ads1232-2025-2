package ed.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> l = new ArrayList<>();

        int x;
        while ((x = sc.nextInt()) != 0) {
            l.add(x);
        }

        for (int i = 0; i < l.size(); i++) {
            int s = l.get(i);
            System.out.println(s);
        }
    }
}
