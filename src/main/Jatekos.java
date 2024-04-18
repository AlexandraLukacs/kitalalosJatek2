package main;

import java.util.Random;

public class Jatekos {
    /* ADATTAGOK */
    static Random rnd = new Random();
    private int tipp;
    
    /* TAGFÜGGVÉNYEK */
    public int getTipp(){
        return tipp;
    }
    
    public void tippel(){
        tipp = Jatekos.rnd.nextInt(Jatek.getMAX()+1);
        System.out.println("tippelésem: " + tipp);
    }
}
