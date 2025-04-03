package padrao_singleton;

public class Logger {
    private static Logger instancia;

    public Logger(){
    }
    public static Logger getInstancia(){
        if (instancia == null){
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensagem){
        System.out.println("[LOG]" + mensagem);
    }
}
