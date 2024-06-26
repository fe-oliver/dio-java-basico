package one.digitalinnovation.gof.singleton;
/** 
 * Singleton "apressado"
 * 
 *  @author fe-oliver
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager(){
        // criar um construtor privado 
        super();
    }
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
