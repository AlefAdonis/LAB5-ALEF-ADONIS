package biblitex;

public class MainTransforma {
    public static void main(String[] args){
        TransformaTexto tt = new TransformaTexto();

        System.out.println(tt.transforma("CaMeLcAsEfY", "oi, como vc vai?"));
        System.out.println(tt.transforma("clean", "oi, como vc vai?"));
        System.out.println(tt.contaTransformacao());
        System.out.println(tt.historico(0));
        System.out.println("\n --------------------------- \n");
        System.out.println(tt.transforma("clean", "oi, como vc vai?"));
        System.out.println(tt.transforma("clean", "oi, como vc vai?"));
        System.out.println(tt.contaTransformacao());
        System.out.println(tt.historico(2));
        System.out.println(tt.historico(3));
        System.out.println("\n --------------------------- \n");
        System.out.println(tt.transforma("InterrogaPraPontos", "oi, como vc vai?"));
        tt.transforma("clean", "Oi, como vc vai?");
        System.out.println(tt.listarOriginais());

        System.out.println(tt.transforma("CodigoDaVinci", "Minha casa fica ao sudeste, saindo de Siló."));

        System.out.println("\n --------------------------- \n");
        System.out.println(tt.listarTransformacoes());


    }
}
