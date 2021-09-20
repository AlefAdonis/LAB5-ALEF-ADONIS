package biblitex;

import java.util.Comparator;

public class ComparaAlfabeticamente implements Comparator<AlgoritmoTransformacao> {
    @Override
    public int compare(AlgoritmoTransformacao alg1, AlgoritmoTransformacao alg2) {
        if (alg1.getNome().compareTo(alg2.getNome()) == 0) {
            return 1;
        }
        return 0;
    }
}
