package biblitex;

public class InterrogaParaPontos implements AlgoritmoTransformacao, Comparable<AlgoritmoTransformacao>{

    private final String nome = "InterrogaPraPontos";
    @Override
    public String transforma(String frase) {
        char[] charFrase = frase.toCharArray();

        String fraseTransformada = "";
        for (int i = 0; i < charFrase.length; i++) {
            if (charFrase[i] == '?') {
                fraseTransformada += ".";
            }else {
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
