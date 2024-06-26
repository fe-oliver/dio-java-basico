package one.digitalinnovation.gof.singleton;
/** 
 * Singleton "preguioçoso"
 * 
 *  @author fe-oliver
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    public SingletonLazy(){
        // criar um construtor privado 
        super();
    }
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
