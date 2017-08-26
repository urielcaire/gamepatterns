package veiculo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author urielcaire
 */
public class CarroFactory {
    private List<Carro> carros;
    public CarroFactory(){
        carros = new ArrayList<Carro>();
    }
    public void createCarro(){
        carros.add(new Carro());
    }
    public void clearCarro(){
        carros.clear();
    }
    public int getTotalRAM(){
        int total = 0;
        for (int i = 0; i < carros.size(); i++) {
            total+=carros.get(i).RAM;
        }
        return total;
    }

    public void createCarros(int qtdeCarros) {
        for (int i = 0; i < qtdeCarros; i++) {
            createCarro();
        }
    }
}
