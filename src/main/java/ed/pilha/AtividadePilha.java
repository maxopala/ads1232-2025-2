package ed.pilha;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class AtividadePilha {
    static List<Path> files() throws IOException {
        String dir = "/home/max/Dropbox/ucg/aulas/2025-2/ADS1232 - Estrutura de Dados/atividades";
        return Files.list(Path.of(dir)).filter(f -> f.toString().endsWith(".json")).toList();
    }

    static boolean validateJson(String json) {
        Stack<Character> s = new Stack<>();

        boolean isEscape = false;
        boolean isString = false;
        for (char c : json.toCharArray()) {
            if (c == '{') {
                if (isEscape) return false;
                if (!isString) s.push(c);
            } else if (c == '[') {
                if (isEscape) return false;
                if (!isString) s.push(c);
            } else if (c == '}') {
                if (isEscape) return false;
                if (!isString)
                    if (s.isEmpty() || s.pop() != '{') {
                        return false;
                    }
            } else if (c == ']') {
                if (isEscape) return false;
                if (!isString)
                    if (s.isEmpty() || s.pop() != '[') {
                        return false;
                    }
            } else if (c == '\\') {
                if (!isString) {
                    return false;
                }
                isEscape = !isEscape;
            } else if (c == '"') {
                if (isEscape) {
                    isEscape = false;
                } else {
                    isString = !isString;
                }
            } else {
                if (isEscape) {
                    if (c != 'n' && c != 'r' && c != 't')
                        return false;
                    isEscape = false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        for (Path path : files()) {
            String content = Files.readString(path).replaceAll("[ \n\t\r]+", " ").strip();
            System.out.println("path: " + path + ", valid: " + validateJson(content));

            StringTokenizer tokenizer = new StringTokenizer(content, " \t\n\n\f\"", true);
            if (path.toString().endsWith("valido.json")) while (tokenizer.hasMoreTokens()) {
                String t = tokenizer.nextToken();
                if (t.strip().isEmpty()) continue;
                System.out.println(t);
            }
        }
    }
}
