import java.util.*;

public class NomeGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes e gêneros no formato Nome:Genero, separados por vírgula:");
        String entrada = scanner.nextLine();
        scanner.close();

        // Mapa para armazenar nomes agrupados por gênero
        Map<String, List<String>> nomesPorGenero = new HashMap<>();

        // Separar os pares nome:gênero
        String[] pares = entrada.split(",");

        for (String par : pares) {
            String[] partes = par.split(":");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim();

                // Adiciona o nome à lista correta
                nomesPorGenero
                        .computeIfAbsent(genero, k -> new ArrayList<>())
                        .add(nome);
            }
        }

        // Ordena e imprime os nomes por gênero
        for (String genero : nomesPorGenero.keySet()) {
            List<String> nomes = nomesPorGenero.get(genero);
            Collections.sort(nomes);
            System.out.println("Gênero: " + genero);
            for (String nome : nomes) {
                System.out.println("- " + nome);
            }
        }
    }
}