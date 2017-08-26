package cenario;

import principal.Pool;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author urielcaire
 */
public class CenarioPool implements Pool<CenarioBuilder>{
    private List<CenarioBuilder> cenarios;
    
    public CenarioPool(){
        cenarios = new ArrayList();
    }

    @Override
    public CenarioBuilder acquire() {
        if (this.cenarios.size() > 0)
            return cenarios.remove(0);
        return null;
    }

    @Override
    public void release(CenarioBuilder t) {
        t.build();
        this.cenarios.add(t);
    }
    
}
