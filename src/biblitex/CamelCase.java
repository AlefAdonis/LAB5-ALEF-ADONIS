package biblitex;

public class CamelCase implements AlgoritmoTransformacao, Comparable<AlgoritmoTransformacao>{

    private final String nome = "CaMeLcAsEfY";

    public String transforma(String frase){
        char[] charFrase = frase.toCharArray();

        String fraseTransformada = "";
        for (int i = 0; i < charFrase.length; i++) {
            if (i % 2 == 0) {
                fraseTransformada += Character.toUpperCase(charFrase[i]);
            } else {
                fraseTransformada += Character.toLowerCase(charFrase[i]);
            }
        }

        return fraseTransformada;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int compareTo(AlgoritmoTransformacao algoritmoTransformacao) {
        return this.getNome().compareTo(algoritmoTransformacao.getNome());
    }
}
