package zumbi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author urielcaire
 */
public class ZumbiFactory {
    private List<Zumbi> zumbis;
    public ZumbiFactory(){
       zumbis = new ArrayList<Zumbi>(); 
    }
    public void createZumbi(){
        zumbis.add(new Zumbi());
    }
    public void createZumbis(int total){
        for (int i = 0; i < total; i++) {
            createZumbi();
        }
    }
    public void clearZumbis(){
        zumbis.clear();
    }
    public int getTotalRAM(){
        int total = 0;
        for (int i = 0; i < zumbis.size(); i++) {
            total+=zumbis.get(i).RAM;
        }
        return total;
    }
}
