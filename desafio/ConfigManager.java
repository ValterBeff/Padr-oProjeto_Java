// Singleton

package desafio;

public class ConfigManager {

    private static ConfigManager instancia;
    private String configuracao;
    private Documento prototipo;

    public ConfigManager(){
    }

    public static ConfigManager getInstancia() {
        if (instancia == null){
            instancia = new ConfigManager();
        }
        return instancia;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

    public Documento getPrototipoDocumento() {
        return prototipo;

    }

    public void setPrototipoDocumento(Documento doc) {
        this.prototipo = doc;
    }
}
