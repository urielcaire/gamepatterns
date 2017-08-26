package cenario;

import sobrevivente.SobreviventeFactory;
import veiculo.CarroFactory;
import zumbi.ZumbiFactory;

/**
 *
 * @author urielcaire
 */
public class CenarioAbstractFactory implements ICenarioAbstractFactory{

    @Override
    public ZumbiFactory createZumbiFactory() {
        return new ZumbiFactory();
    }

    @Override
    public CarroFactory createCarroFactory() {
        return new CarroFactory();
    }

    @Override
    public SobreviventeFactory createSobreviventeFactory() {
        return new SobreviventeFactory();
    }
    
}
