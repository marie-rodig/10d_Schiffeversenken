

public class Spieler
{
    abstract class Spieler implements Mode {
    protected Spielfeld sp;
    private int hoehe,breite;

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
