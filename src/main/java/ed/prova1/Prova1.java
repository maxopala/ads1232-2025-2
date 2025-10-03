package ed.prova1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Prova1 {
    public static List<Frequencia> buscaFrequencia1(List<String> list) {
        List<Frequencia> frequencias = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            boolean existe = false;
            for (int j = 0; j < frequencias.size(); j++) {
                Frequencia freq = frequencias.get(j);
                if (freq.getS().equals(s)) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                int count = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (s.equals(list.get(j))) {
                        count++;
                    }
                }
                Frequencia freq = new Frequencia();
                freq.setS(s);
                freq.setCount(count);

                frequencias.add(freq);
            }
        }

        return frequencias;
    }

    public static List<Frequencia> buscaFrequencia2(List<String> list) {
        List<Frequencia> frequencias = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            Frequencia freq = null;
            for (int j = 0; j < frequencias.size(); j++) {
                Frequencia freq2 = frequencias.get(j);
                if (freq2.getS().equals(s)) {
                    freq = freq2;
                    break;
                }
            }

            if (freq == null) {
                freq = new Frequencia();
                freq.setS(s);
                freq.setCount(0);
                frequencias.add(freq);
            }

            freq.setCount(freq.getCount() + 1);
        }

        return frequencias;
    }

    public static List<Frequencia> buscaFrequencia3(List<String> lista) {
        List<Frequencia> resultado = new ArrayList<>();
        List<String> jaContabilizadas = new ArrayList<>();

        for (String item : lista) {
            if (!jaContabilizadas.contains(item)) {
                int count = 0;
                for (String comparar : lista) {
                    if (item.equals(comparar)) {
                        count++;
                    }
                }
                resultado.add(new Frequencia(item, count));
                jaContabilizadas.add(item);
            }
        }
        return resultado;
    }

    public static List<Frequencia> buscaFrequencia4(List<String> listOriginal) {
        List<String> list = new ArrayList<>(listOriginal);

        List<Frequencia> frequencias = new ArrayList<>();
        while (!list.isEmpty()) {
            String s = list.getFirst();

            List<String> repeticoes = new ArrayList<>();
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                String s2 = list.get(j);
                if (s.equals(s2)) {
                    repeticoes.add(s2);
                    count++;
                }
            }
            Frequencia freq = new Frequencia();
            freq.setS(s);
            freq.setCount(count);

            frequencias.add(freq);

            list.removeAll(repeticoes);
        }
        return frequencias;
    }

    public static List<Frequencia> buscaFrequencia0(List<String> list) {
        List<Frequencia> frequencias = new ArrayList<>();
        for (String s : list) {
            if (frequencias.stream().noneMatch(f -> f.getS().equals(s))) {
                frequencias.add(new Frequencia(s, (int) list.stream().filter(t -> t.equals(s)).count()));
            }
        }
        return frequencias;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "ANA", "JOAO", "PEDRO", "JOAO", "CARLOS", "CARLOS",
                "ANA", "JOAO", "ANA", "RENATA", "ANA", "MARCELO", "ANA"
        );
        List<Frequencia> frequencias = buscaFrequencia4(list);
        System.out.println("Quantidade de palavras diferentes: " + frequencias.size());
        for (Frequencia frequencia : frequencias) {
            System.out.println(frequencia);
        }
        System.out.println(list);

        frequencias.stream()
                .filter(f -> f.getS().contains("A"))
                .filter(f -> f.getCount() > 1 && f.getCount() < 5)
                .map(f -> String.format("Frequencia(%s, %d)", f.getS(), f.getCount()))
                .forEach(s -> System.out.println("Elemento " + s));
    }
}
