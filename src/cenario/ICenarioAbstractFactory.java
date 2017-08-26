package cenario;

import sobrevivente.SobreviventeFactory;
import veiculo.CarroFactory;
import zumbi.ZumbiFactory;

/**
 *
 * @author urielcaire
 */
public interface ICenarioAbstractFactory {
    ZumbiFactory createZumbiFactory();
    CarroFactory createCarroFactory();
    SobreviventeFactory createSobreviventeFactory();
}
