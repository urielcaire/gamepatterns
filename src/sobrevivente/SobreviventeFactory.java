package sobrevivente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author urielcaire
 */
public class SobreviventeFactory {
    private List<Sobrevivente> sobreviventes;
    public SobreviventeFactory(){
        sobreviventes = new ArrayList<Sobrevivente>();
    }
    public void createSobrevivente(){
        sobreviventes.add(new Sobrevivente());
    }
    public void createSobreviventes(int qtdeSobreviventes){
        for (int i = 0; i < qtdeSobreviventes; i++) {
            sobreviventes.add(new Sobrevivente());
        }
    }
    public void clearSobrevivente(){
        sobreviventes.clear();
    }
    public int getTotalRAM(){
        int total = 0;
        for (int i = 0; i < sobreviventes.size(); i++) {
            total+=sobreviventes.get(i).RAM;
        }
        return total;
    }

    public void createSobreviventes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
