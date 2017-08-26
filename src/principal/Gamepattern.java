package principal;

import cenario.CenarioBuilder;
import cenario.CenarioPool;

/**
 *
 * @author urielcaire
 */
public class Gamepattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuracao conf = Configuracao.getInstance();
        CenarioPool cenarios = new CenarioPool();
        cenarios.release(new CenarioBuilder("neve", conf.RAM_BAIXA, conf.CENARIO_RESGATE));
        CenarioBuilder antigo = cenarios.acquire().clone();
        cenarios.release(antigo);
    }
    
}
