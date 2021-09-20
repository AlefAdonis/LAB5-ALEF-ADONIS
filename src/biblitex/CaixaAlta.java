package biblitex;

public class CaixaAlta implements AlgoritmoTransformacao, Comparable<AlgoritmoTransformacao> {

    private final String nome = "upperCase";

    @Override
    public String transforma(String frase) {
        char[] charFrase = frase.toCharArray();

        String fraseTransformada = "";
        for (int i = 0; i < charFrase.length; i++) {
            fraseTransformada += Character.toUpperCase(charFrase[i]);
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
