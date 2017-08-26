package principal;

/**
 *
 * @author urielcaire
 */
public class Configuracao implements IConfiguracao{
    private static Configuracao singleton;
    public int nivel = 0;
    
    private Configuracao(){
        nivel = EASY;
    }
    public static Configuracao getInstance(){
        if(singleton == null)
            singleton = new Configuracao();
        return singleton;
    }
}
