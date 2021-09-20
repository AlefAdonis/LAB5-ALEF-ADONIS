package biblitex;

public class Codificado implements AlgoritmoTransformacao, Comparable<AlgoritmoTransformacao> {

    private final String nome = "CodigoDaVinci";
    @Override
    public String transforma(String frase) {
        char[] charFrase = frase.toCharArray();

        String fraseTransformada = "";
        for (int i = 0; i < charFrase.length; i++) {
            switch (Character.toLowerCase(charFrase[i])) {
                case 'a':
                    fraseTransformada += '4';
                    break;
                case 'e':
                    fraseTransformada += '3';
                    break;
                case 'i':
                    fraseTransformada += '1';
                    break;
                case 'o':
                    fraseTransformada += '0';
                    break;
                case 'u':
                    fraseTransformada += '<' + '>';
                    break;
                case 'm':
                    fraseTransformada += '/';
                    break;
                case 's':
                    fraseTransformada += '+';
                    break;
                case 'r':
                    fraseTransformada += '=';
                    break;
                case 'n':
                    fraseTransformada += '*';
                    break;
                case 'd':
                    fraseTransformada += '$';
                    break;
                default:
                    fraseTransformada += charFrase[i];
                    break;
            }
        }
        CamelCase camelCase = new CamelCase();
        fraseTransformada = camelCase.transforma(fraseTransformada);

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
