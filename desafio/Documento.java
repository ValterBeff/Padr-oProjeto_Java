// Prototype

package desafio;

public class Documento implements Cloneable {

    private String titulo;
    private String conteudo;
    private String formato;

    public Documento(String titulo, String conteudo, String formato) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.formato = formato;
    }

    public Documento clone() {
        try{
            return(Documento) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError("Clonagem não suportada!", e);
        }
    }
}
