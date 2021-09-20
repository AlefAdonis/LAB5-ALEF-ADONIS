package biblitex;

public class Clean implements AlgoritmoTransformacao, Comparable<AlgoritmoTransformacao> {

    private final String nome = "clean";

    public String transforma(String frase){
        char[] charFrase = frase.toCharArray();

        String fraseTransformada = "";
        for (int i = 0; i < charFrase.length; i++) {
            if (!(charFrase[i] == ',' || charFrase[i] == '!' || charFrase[i] == '.' || charFrase[i] == '?')) {
                fraseTransformada += charFrase[i];
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
