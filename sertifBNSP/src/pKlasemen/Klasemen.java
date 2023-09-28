package pKlasemen;

/**
 *
 * 
 */
public abstract class Klasemen {
    private int idTim;
    private String namaTim;
    private int poinJMLH;
    private int golJMLH;
    private int menangJMLH;
    
    public void setPoinJMLH(int poinJMLH){
        this.poinJMLH += poinJMLH;
    }
    public void setGolJMLH(int golJMLH){
        this.golJMLH += golJMLH;
    }
    public void setMenangJMLH(int menangJMLH){
        this.menangJMLH += menangJMLH;
    }

    public Klasemen(String namaTim) {
        this.namaTim = namaTim;
        this.poinJMLH = 0;
        this.golJMLH = 0;
        this.menangJMLH = 0;
    }
    
    public Klasemen(int idTim, String namaTim) {
        this.idTim = idTim;
        this.namaTim = namaTim;
        this.poinJMLH = 0;
        this.golJMLH = 0;
        this.menangJMLH = 0;
    }
    
    protected abstract void menang(Klasemen tim, int tim1, int tim2);
    
    protected abstract void getKlasemen();
    
    
    
    
}
