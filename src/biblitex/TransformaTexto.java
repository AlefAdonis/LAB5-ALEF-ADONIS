package biblitex;

import java.util.*;

public class TransformaTexto {

    private HashMap<String, AlgoritmoTransformacao> algoritmosOperacionais;
    private ArrayList<String[]> historico;
    private HashSet<String> frasesOriginais;
    private int contadorTransformacao = 0;

    public TransformaTexto() {
        this.historico = new ArrayList<>();
        this.frasesOriginais = new HashSet<>();
        this.algoritmosOperacionais = new HashMap<>();

        this.setup();
    }

    public void cadastraAlgortimo(String nomeAlgoritmo, AlgoritmoTransformacao algoritmo){
        this.algoritmosOperacionais.put(nomeAlgoritmo, algoritmo);
    }

    public String transforma(String transformacao, String frase) {
        String fraseTransformada = "";

        if(!(this.algoritmosOperacionais.containsKey(transformacao))){
            return "Operação Não Encontrada";
        }
        AlgoritmoTransformacao algoritmo = this.algoritmosOperacionais.get(transformacao);
        fraseTransformada = algoritmo.transforma(frase);

        String[] historicoTransformacao = {frase, transformacao, fraseTransformada};
        this.historico.add(historicoTransformacao);
        this.frasesOriginais.add(frase);
        this.contadorTransformacao += 1;

        return fraseTransformada;
    }

    public String historico(int posicaoHistorico) {
        String[] historicoContabilizado = this.historico.get(posicaoHistorico);

        return historicoContabilizado[0] + " -> " + historicoContabilizado[1] + " -> " + historicoContabilizado[2];
    }

    private void setup(){
        Clean clean = new Clean();
        this.algoritmosOperacionais.put("clean", clean);
        CamelCase camelCase = new CamelCase();
        this.algoritmosOperacionais.put("CaMeLcAsEfY", camelCase);
        InterrogaParaPontos interrogaParaPontos= new InterrogaParaPontos();
        this.algoritmosOperacionais.put("InterrogaPraPontos",interrogaParaPontos);
        CaixaAlta caixaAlta = new CaixaAlta();
        this.algoritmosOperacionais.put("upperCase", caixaAlta);
        LimpaEspacos limpaEspacos = new LimpaEspacos();
        this.algoritmosOperacionais.put("cleanSpaces", limpaEspacos);
        Codificado coden = new Codificado();
        this.algoritmosOperacionais.put("CodigoDaVinci", coden);
    }

    public String listarOriginais() {
        String originais = "";
        int i = 0;

        for (String s : this.frasesOriginais) {
            if (i == (frasesOriginais.size() - 1)) {
                originais += s;
                break;
            }
            originais += s + "\n";
            i++;
        }
        return originais;
    }

    public int contaTransformacao() {
                return this.contadorTransformacao;
    }

    public String listarTransformacoes(){
        ComparaAlfabeticamente compara = new ComparaAlfabeticamente();
        List<AlgoritmoTransformacao> acoes = new ArrayList<>(this.algoritmosOperacionais.values());
        Collections.sort(acoes, compara);

        String listaAcoes = "";
        for(int i = 0; i < acoes.size(); i++){
            if(i == (acoes.size() - 1)){
                listaAcoes += acoes.get(i).getNome();
            }
            else{
                listaAcoes += acoes.get(i).getNome() + "\n";
            }
        }
        return listaAcoes;
    }



}
