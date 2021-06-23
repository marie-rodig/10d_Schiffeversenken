

public class SPIELER
{
    abstract class Spieler implements Mode {
    protected Spielfeld sp;
    private int hoehe,breite;

<<<<<<< HEAD
    public Spieler() {
    }
    
    public Spieler(Spieler sp1) {
        this(sp1.getSpielfeld());
    }
    
    public int Spielfeld ;sp (int y) {
        if(sp != null) {
            this.sp = sp;
            hoehe = sp.getHoehe();
            breite = sp.getBreite();
        }
    }
    
    abstract public void init(int mode);
=======
    public Spieler() {
    }
    
    public Spieler(Spieler sp1) {
        this(sp1.getSpielfeld());
    }
    
    public int Spielfeld sp (int y) {
        if(sp != null) {
            this.sp = sp;
            hoehe = sp.getHoehe();
            breite = sp.getBreite();
        }
    }
    
    abstract public void init(int mode);
>>>>>>> 0319fefad54d9cb1edad22d9fc595d80ba5fb67f

    public Spielfeld getSpielfeld() {
        return sp;
    }
    
    public void setSpielfeld(Spielfeld sp) {
        if(sp != null) {
            this.sp = sp;
        }
    }
}

}
