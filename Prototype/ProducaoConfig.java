package padrao_prototype;

public class ProducaoConfig extends AmbienteConfig {
    public ProducaoConfig(String url, String usuario, String senha, int timeoutSegundos, boolean logDetalhado) {
        super(url, usuario, senha, timeoutSegundos, logDetalhado);
    }

    @Override
    public void exibirInfo(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}