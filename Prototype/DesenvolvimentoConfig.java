package padrao_prototype;

public class DesenvolvimentoConfig extends AmbienteConfig {
    public DesenvolvimentoConfig(String url, String usuario, String senha, int timeoutSegundos, boolean logDetalhado) {
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