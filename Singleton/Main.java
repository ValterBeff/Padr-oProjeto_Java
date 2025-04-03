package padrao_singleton;

public class Main {
    public static void main(String[] args){
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();

        logger1.log("Iniciando aplicaçao...");
        logger2.log("Continuando execuçao...");

        if (logger1 == logger2){
            System.out.println(("logger1 e logger2 sao a mesma instância."));
        }
    }
}
