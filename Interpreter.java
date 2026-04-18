import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import java.util.regex.*;
import java.util.*;
import java.util.regex.*;

public class Interpreter {

    private Map<String, String> variables = new HashMap<>();

    public void execute(String code) {

        // separa por linhas (NÃO por ;)
        String[] lines = code.split("\\n");

        for (String raw : lines) {
            String line = raw.trim();

            if (line.isEmpty()) continue;

            // ignorar estrutura da linguagem
            if (line.startsWith("class ")) continue;
            if (line.equals("{") || line.equals("}")) continue;
            if (line.startsWith("void") || line.contains("main")) continue;

            // PRINT
            if (line.startsWith("print")) {
                handlePrint(line);
            }

            // ATRIBUIÇÃO
            else if (line.contains("=")) {
                handleAssignment(line);
            }

            else {
                System.out.println("Ignorado: " + line);
            }
        }
    }

    private void handlePrint(String line) {
        Pattern p = Pattern.compile("print\\s*\\((.*)\\)");
        Matcher m = p.matcher(line);

        if (m.find()) {
            String content = m.group(1).trim();

            // string literal
            if (content.startsWith("\"") && content.endsWith("\"")) {
                content = content.substring(1, content.length() - 1);
            }
            // variável
            else if (variables.containsKey(content)) {
                content = variables.get(content);
            }

            System.out.println(content);
        }
    }

    private void handleAssignment(String line) {
        String[] parts = line.split("=");
        if (parts.length != 2) return;

        String var = parts[0].trim();
        String value = parts[1].trim();

        if (value.startsWith("\"") && value.endsWith("\"")) {
            value = value.substring(1, value.length() - 1);
        }

        variables.put(var, value);
    }
    public static void main(String[] args) {
          if (args.length == 0) {
            System.out.println("Uso: java  <ficheiro.cs>");
            return;
        }
         String code ="";
        try{
            code = new String(Files.readAllBytes(Paths.get(args[0])));
        }catch (Exception e) {
              System.out.println("error\n");
        }
        CharStream input = CharStreams.fromString(code);

        Interpreter interpreter = new Interpreter();
        interpreter.execute(code);
    }
}