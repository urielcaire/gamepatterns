package cenario;

import principal.Configuracao;
import sobrevivente.SobreviventeFactory;
import veiculo.CarroFactory;
import zumbi.ZumbiFactory;

/**
 *
 * @author urielcaire
 */
public class CenarioBuilder implements ICenario, Prototype<CenarioBuilder>{
    public String nome;
    public int qtdeRAM;
    public int tipoCenario;
    private CenarioAbstractFactory abstractFactory;
    Configuracao conf;
    ZumbiFactory zumbis;
    CarroFactory carros;
    SobreviventeFactory sobreviventes;
    
    public CenarioBuilder(String nome, int qtdeRAM, int tipoCenario){
        this.nome = nome;
        this.qtdeRAM = qtdeRAM;
        this.tipoCenario = tipoCenario;
        conf = Configuracao.getInstance();
    }
    
    public void build(){
        abstractFactory = new CenarioAbstractFactory();
        System.out.println("Criado o cenário "+nome);
        if(tipoCenario == conf.CENARIO_SOBREVIVENCIA){
            this.buildSobreviventes(2);
            this.buildCarros(20);
            int temp = carros.getTotalRAM() + sobreviventes.getTotalRAM();
            int zumbiRAM = qtdeRAM - temp;
            int zumbis = (int)(zumbiRAM / conf.RAM_ZUMBI);
            this.buildZumbis(zumbis);
        }
    }
    
    @Override
    public void buildZumbis(int qtdeZumbis) {
        zumbis = abstractFactory.createZumbiFactory();
        zumbis.createZumbis(qtdeZumbis);
        System.out.println(qtdeZumbis+" zumbis foram criados.");
    }

    @Override
    public void buildSobreviventes(int qtdeSobreviventes) {
        sobreviventes = abstractFactory.createSobreviventeFactory();
        sobreviventes.createSobreviventes(qtdeSobreviventes);
        System.out.println(qtdeSobreviventes+" sobreviventes foram criados.");
    }

    @Override
    public void buildCarros(int qtdeCarros) {
        carros = abstractFactory.createCarroFactory();
        carros.createCarros(qtdeCarros);
        System.out.println(qtdeCarros+" carros foram criados.");
    }

    @Override
    public CenarioBuilder clone() {
        return new CenarioBuilder(this.nome, this.qtdeRAM, this.tipoCenario);
    }
    
}
