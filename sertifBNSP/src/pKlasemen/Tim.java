package pKlasemen;

import com.Config.Connection;
import com.View.View;
/**
 *
 * @author HP
 */
public class Tim extends Klasemen{

    public Tim(String namaTim) {
        super(namaTim);
        
    }
    
    
    public void menang(Klasemen tim2, int jmlhGolTim1, int jmlhGolTim2){
        
        // === setting untuk objek utama ===
        // karena menang, poin dari objeknya ditambah 3
        this.setPoinJMLH(3);
        // menambah jumlah gol untuk pertimbangan terakhir
        this.setGolJMLH(jmlhGolTim1);
        // karena menang, jumlah menang dari objeknya ditambah 3
        this.setMenangJMLH(1);
        
        View.menangPertandingan(tim2);
        
        // === setting untuk objek kedua 'tim' ===
        // walaupun kalah, jumlah gol tetap dijumlah
        tim2.setGolJMLH(jmlhGolTim2);
    }
    
    public void seri(Klasemen tim2, int jmlhGolTim1, int jmlhGolTim2){
        
        // === setting untuk objek utama ===
        // walaupun seri, poin dari objeknya ditambah 1
        this.setPoinJMLH(1);
        // menambah jumlah gol untuk pertimbangan terakhir
        this.setGolJMLH(jmlhGolTim1);
        
        // === setting untuk objek kedua 'tim' ===
        // walaupun seri, poin dari objeknya ditambah 1
        tim2.setPoinJMLH(1);
        // menambah jumlah gol untuk pertimbangan terakhir
        tim2.setGolJMLH(jmlhGolTim2);
        
        // memanggil fungsi 'kalah' untuk
    }
    
    private void kalah(Klasemen tim,int jmlhGolTim1){
        // karena kalah, poin dari objeknya ditambah 0
        // walaupun kalah, jumlah gol tetap dijumlah
        this.setGolJMLH(0);
    }
    
    protected void getKlasemen(){
        System.out.println("\n::: DATA KLASEMEN :::");
        System.out.println("BELUMMMMMMMM");
        
//         call database, call dulu method yang memanggil database nya
        System.out.println(Connection.getKlasemenData());
        
        
        // ngapainnnnnnnnn
    }
}
