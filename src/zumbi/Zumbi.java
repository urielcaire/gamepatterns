package zumbi;

import principal.Configuracao;

/**
 *
 * @author urielcaire
 */
public class Zumbi implements IZumbi{
    private int modelo;
    private int posX;
    private int posY;
    public int saude = 0;
    public int RAM = 0;
    
    public Zumbi(){
        modelo = (int)(Math.random()*3);
        Configuracao conf = Configuracao.getInstance();
        posY = (int)(Math.random()*conf.HEIGHT);
        posX = (int)(Math.random()*conf.WIDTH);
        saude = conf.EASY;
        RAM = conf.RAM_ZUMBI;
    }

    @Override
    public void desenhar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
